package controllers;

import play.mvc.*;
import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

public class HomeController extends Controller {

    private FormFactory formFactory;

    private Environment e;

    @Inject
    public HomeController(FormFactory f, Environment env) {
        this.e = env;
        this.formFactory = f;
    }

    public Result index() {
        List<Product> productList = Product.findAll();
        return ok(index.render(productList, User.getUserById(session().get("email")), e));
    }

    public Result allTvs() {
        List<Product> productList = Product.findAll();
        return ok(allTvs.render(productList, User.getUserById(session().get("email")), e));
    }

    public Result tvAcc() {
        List<Product> productList = Product.findAll();
        return ok(tvAcc.render(productList, User.getUserById(session().get("email")), e));
    }

    public Result allPhones() {
        List<Product> productList = Product.findAll();
        return ok(allPhones.render(productList, User.getUserById(session().get("email")), e));
    }

    public Result phoneAcc() {
        List<Product> productList = Product.findAll();
        return ok(phoneAcc.render(productList, User.getUserById(session().get("email")), e));
    }

    public Result computing() {
        List<Product> productList = Product.findAll();
        return ok(computing.render(productList, User.getUserById(session().get("email")), e));
    }

    public Result tablets() {
        List<Product> productList = Product.findAll();
        return ok(tablets.render(productList, User.getUserById(session().get("email")), e));
    }

    @Transactional
    public Result contactUs() {
        Form<Contact> contactUsForm = formFactory.form(Contact.class);
        return ok(contactUs.render(contactUsForm, User.getUserById(session().get("email"))));
    }

    @Transactional
    public Result contactUsSubmit() {
        Form<Contact> contactUsForm = formFactory.form(Contact.class).bindFromRequest();
        if (contactUsForm.hasErrors()) {
            return badRequest(contactUs.render(contactUsForm, User.getUserById(session().get("email"))));
        } 
        
        return redirect(controllers.routes.HomeController.contactUsSuccess());
    }

    public Result contactUsSuccess() {
        return ok(contactUsSuccess.render(User.getUserById(session().get("email"))));
    }

    public Result product(Long id) {
        List<Product> productList = Product.findAll();
        return ok(product.render(id,productList, User.getUserById(session().get("email")), e));
    }

    public Result cart() {
        return ok(cart.render(User.getUserById(session().get("email"))));
    }
    

}
