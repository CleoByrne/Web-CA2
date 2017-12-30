package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.Product;
import models.users.*;

@Entity
public class OrderItem extends Model {

    @Id
    private Long id;

    @ManyToOne
    private ShopOrder order;
    
    @ManyToOne
    private ShoppingCart cart;
    
    @ManyToOne
    private Product product;
    
    private int quantity;
    private double price;
    private Double salePrice;
    private Integer onSale;

    public  OrderItem() {
    }
    
    public OrderItem(Product p) {
            product = p;
            quantity = 1;
            price = p.getPrice();
            salePrice = p.getSalePrice();
            onSale = p.getOnSale();
    }
    
    public void increaseQty() {
        quantity += 1;
    }
    
    public void decreaseQty() {
        quantity -= 1;
    }
    
    public double getItemTotal() {
        double total=0;
        if(onSale == 0){
            total =  this.price * this.quantity;
        }
        else if(onSale == 1) {
            total = this.salePrice * this.quantity;
        }
        return total;
    }
	
    public static Finder<Long,OrderItem> find = new Finder<Long,OrderItem>(OrderItem.class);

    public static List<OrderItem> findAll() {
        return OrderItem.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShopOrder getOrder() {
        return order;
    }

    public void setOrder(ShopOrder order) {
        this.order = order;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public int getOnSale() {
        return onSale;
    }

    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }

}

