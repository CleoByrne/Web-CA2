package controllers;

import controllers.security.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.Logger;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.users.*;
import models.Product;

import views.html.productAdmin.*;

@Security.Authenticated(Secured.class)
@With(CheckIfAdmin.class)

public class AdminProductCtrl extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public AdminProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

	private User getCurrentUser() {
		User u = User.getUserById(session().get("email"));
		return u;
	}

    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result addProduct() {   
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm, getCurrentUser()));
    }

    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result addProductSubmit() {

        String saveImageMsg;

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
	
        if(newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm, getCurrentUser()));
        }
     
        Product newProduct = newProductForm.get();
        
        newProduct.save();

        newProduct.update();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        
        saveImageMsg = saveFile(newProduct.getId(), image);

        flash("success", "Product " + newProduct.getName() + " has been created" + " " + saveImageMsg);
            
        return redirect(controllers.routes.HomeController.index());
    }
        

    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result updateProduct(Long id) {
        Product p = Product.find.byId(id);
        Form<Product> productForm = formFactory.form(Product.class).fill(p);
        return ok(updateProduct.render(id, productForm, User.getUserById(session().get("email"))));		
    }


    
    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result updateProductSubmit(Long id) {

        String saveImageMsg;

        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();
	
        if(updateProductForm.hasErrors()) {
            return badRequest(updateProduct.render(id, updateProductForm, getCurrentUser()));
        }
        
        Product p = updateProductForm.get();
        p.setId(id);
                   
        p.update();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveFile(p.getId(), image);

        flash("success", "Product " + updateProductForm.get().getName() + " has been updates" + " " + saveImageMsg);
            
        return redirect(controllers.routes.HomeController.index());
    }


    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted");
        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {
            String mimeType = image.getContentType();
            if (mimeType.startsWith("image/")) {
                File file = image.getFile();
                ConvertCmd cmd = new ConvertCmd();
                IMOperation op = new IMOperation();
                op.addImage(file.getAbsolutePath());
                op.resize(300,200);
                op.addImage("public/images/" + id + ".jpg");
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                thumb.addImage("public/images/" + id + ".jpg");
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }				
                return " and image saved";
            }
        }
        return "image file missing";	
    } 
}
