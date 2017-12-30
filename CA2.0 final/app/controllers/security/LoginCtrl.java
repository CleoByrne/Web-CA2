package controllers.security;

import controllers.*;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import javax.inject.Inject;
import models.shopping.*;
import models.*;
import models.users.*;
import views.html.*;

public class LoginCtrl extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    @Transactional
    public Result login() {
       Form<Login> loginForm = formFactory.form(Login.class);
       Form<Customer> addCustomerForm = formFactory.form(Customer.class);
	   return ok(signIn.render(addCustomerForm, loginForm, User.getUserById(session().get("email"))));
    }

    @Transactional
    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.LoginCtrl.login());
    }

    @Transactional
    public Result loginSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        Form<Customer> addCustomerForm = formFactory.form(Customer.class);
        if (loginForm.hasErrors()) {
            return badRequest(signIn.render(addCustomerForm, loginForm, User.getUserById(session().get("email"))));
        } 
        else {
            session().clear();
            session("email", loginForm.get().getEmail());
                  
        }
        return redirect(controllers.routes.HomeController.index());
    }

    @Transactional
    public Result addCustomerSubmit() {
        Form<Login> loginForm = formFactory.form(Login.class);
        Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest();
        ShoppingCart newShoppingCart = new ShoppingCart();
	
        if(newCustomerForm.hasErrors()) {
            return badRequest(signIn.render(newCustomerForm, loginForm, User.getUserById(session().get("email"))));
        }
     
        Customer newCustomer = newCustomerForm.get();
        
        newCustomer.save();

        newCustomer.update();

        flash("success", "Customer " + newCustomer.getFirstName() + " has been created");
        
        return redirect(controllers.security.routes.LoginCtrl.login());
    }

    
    @Transactional
    public Result updateUser(String email) {
        User user = User.find.byId(email);
        Form<User> updateUserForm = formFactory.form(User.class).fill(user);
        return ok(accountDetails.render(email, updateUserForm, User.getUserById(session().get("email"))));		
    }


    
    @Transactional
    public Result updateUserSubmit(String email) {

        Form<User> updateUserForm = formFactory.form(User.class).bindFromRequest();

        if(updateUserForm.hasErrors()) {
            return badRequest(accountDetails.render(email, updateUserForm, User.getUserById(session().get("email"))));
        }
        
        User u = updateUserForm.get();
        u.setEmail(email);
                  
        u.update();

        flash("success", "User " + updateUserForm.get().getFirstName() + " " + updateUserForm.get().getFirstName() + " has been updated");
            
        return redirect(controllers.routes.HomeController.index());
    }

}
