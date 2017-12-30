package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;

@Entity

@DiscriminatorValue("customer")

public class Customer extends User{
    
    @Constraints.Required
    private String phoneNumber;

    @Constraints.Required
    private String street1;
    
    @Constraints.Required
    private String street2;
    
    @Constraints.Required
    private String town;

    @Constraints.Required
    private String postCode;

    @Constraints.Required
    private String creditCard;
    
    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private ShoppingCart cart;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
	
	public Customer(String email, String firstName, String lastName, String password, String phoneNumber, String street1, String street2, String town, String postCode, String creditCard)
	{
        super(email, firstName, lastName, password);
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.town = town;
        this.postCode = postCode;
		this.creditCard = creditCard;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }
}