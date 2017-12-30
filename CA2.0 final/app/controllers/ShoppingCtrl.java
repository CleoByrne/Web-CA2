package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import models.users.*;
import models.Product;
import models.shopping.*;

import controllers.security.*;

@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)

public class ShoppingCtrl extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

	private Customer getCurrentUser() {
		return (Customer)User.getUserById(session().get("email"));
	}

    @Transactional
    public Result showCart() {
        return ok(shoppingCart.render(getCurrentUser(),env));
    }
    
    @Transactional
    public Result addToCart(Long id) {
        
        Product p = Product.find.byId(id);
        
        Customer customer = (Customer)User.getUserById(session().get("email"));
        
        if (customer.getCart() == null) {
            customer.setCart(new ShoppingCart());
            customer.getCart().setCustomer(customer);
            customer.update();
        }

        customer.getCart().addProduct(p);
        customer.update();
            
        return redirect(routes.ShoppingCtrl.showCart());
    }
    
    @Transactional
    public Result addOne(Long itemId) {
        OrderItem item = OrderItem.find.byId(itemId);
        item.increaseQty();
        item.update();
        return redirect(routes.ShoppingCtrl.showCart());
    }

    @Transactional
    public Result removeOne(Long itemId) {
        OrderItem item = OrderItem.find.byId(itemId);
        Customer c = getCurrentUser();
        c.getCart().removeItem(item);
        c.getCart().update();
        return redirect(routes.ShoppingCtrl.showCart());
    }

    @Transactional
    public Result removeItem(Long itemId) {
        OrderItem item = OrderItem.find.byId(itemId);
        Customer c = getCurrentUser();
        c.getCart().deleteItem(item);
        c.getCart().update();
        return redirect(routes.ShoppingCtrl.showCart());
    }

    @Transactional
    public Result emptyCart() {
        Customer c = getCurrentUser();
        c.getCart().removeAllItems();
        c.getCart().update();
        return redirect(routes.ShoppingCtrl.showCart());
    }

    @Transactional
    public Result placeOrder() {
        Customer c = getCurrentUser();

        ShopOrder order = new ShopOrder();
        
        order.setCustomer(c);
        
        order.setItems(c.getCart().getCartItems());
        
        order.save();
       
        for (OrderItem i: order.getItems()) {
            i.setOrder(order);
            i.setCart(null);
            i.update();
        }
        
        order.update();
        
        c.getCart().setCartItems(null);
        c.getCart().update();
        
        return ok(orderConfirmed.render(c, order));
    }
    
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

}