package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;
import models.Product;


public class ProductCtrl extends Controller {

    private FormFactory formFactory;

    private play.api.Environment env;

    @Inject
    public ProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    @Transactional
	public User getCurrentUser() {
		User u = User.getUserById(session().get("email"));
		return u;
    }

}
