package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.Product;
import models.users.*;

@Entity
public class ShoppingCart extends Model {

    @Id
    private Long id;
    
    @OneToMany(mappedBy = "cart", cascade = CascadeType.PERSIST)
    private List<OrderItem> cartItems;
    
    @OneToOne
    private Customer customer;

    public  ShoppingCart() {
    }
    
    public void addProduct(Product p) {
        
        boolean itemFound = false;
        for (OrderItem i : cartItems) {
            if (i.getProduct().getId() == p.getId()) {
                i.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            OrderItem newItem = new OrderItem(p);
            cartItems.add(newItem);
        }
    }
    
    public void removeItem(OrderItem item) {
        for (Iterator<OrderItem> iter = cartItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                }
                else {
                    i.delete();
                    iter.remove();
                    break;
                }             
            }
		}
    }

    public void deleteItem(OrderItem item) {
        for (Iterator<OrderItem> iter = cartItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                i.delete();
                iter.remove();
                break;          
            }
		}
    }
    
    public void removeAllItems() {
        for(OrderItem i: this.cartItems) {
            i.delete();
        }
        this.cartItems = null;
    }

    public double getCartTotal() {
        
        double total = 0;
        
        for (OrderItem i: cartItems) {
            total += i.getItemTotal();
        }
        return total;
    }
	
    public static Finder<Long,ShoppingCart> find = new Finder<Long,ShoppingCart>(ShoppingCart.class);

    public static List<ShoppingCart> findAll() {
        return ShoppingCart.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<OrderItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

