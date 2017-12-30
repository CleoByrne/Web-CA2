package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Product extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String category;

    @Constraints.Required
    private String descriptionS;

    @Constraints.Required
    private String descriptionL;

    @Constraints.Required
    private int	stock;

    @Constraints.Required
    private double price;

    private Double salePrice;

    @Constraints.Required
    private Integer onSale;

    @Constraints.Required
    private String spec1;

    @Constraints.Required
    private String spec2;

    @Constraints.Required
    private String spec3;

    public  Product() {
    }

    public  Product(Long id, String name, String category, String descriptionS, String descriptionL, int stock, double price, Double salePrice, Integer onSale, String spec1, String spec2, String spec3){
        this.id = id;
        this.name = name;
        this.category = category;
        this.descriptionS = descriptionS;
        this.descriptionL = descriptionL;
        this.stock = stock;
        this.price = price;
        this.salePrice = salePrice;
        this.onSale = onSale;
        this.spec1 = spec1;
        this.spec2 = spec2;
        this.spec3 = spec3;
    }

    public static final Finder<Long, Product> find = new Finder<>(Product.class);

    public static final List<Product> findAll(){
        return Product.find.all();
    }
	
    public static Finder<Long,Product> findById = new Finder<Long,Product>(Product.class);

    public static final Product findById(Long id){
        return Product.find.byId(id);
    }

    // // Find all Products in the database
    // // Filter product name 
    // public static List<Product> findAll(String filter) {
    //     return Product.find.query().where()
    //                     // name like filter value (surrounded by wildcards)
    //                     .ilike("name", "%" + filter + "%")
    //                     .orderBy("name asc")
    //                     .findList();
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getDescriptionS() {
        return descriptionS;
    }

    public void setDescriptionS(String descriptionS) {
        this.descriptionS = descriptionS;
    }

    public String getDescriptionL() {
        return descriptionL;
    }

    public void setDescriptionL(String descriptionL) {
        this.descriptionL = descriptionL;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getOnSale(){
        return onSale;
    }

    public void setOnSale(Integer onSale){
        this.onSale = onSale;
    }

    public String getSpec1() {
        return spec1;
    }

    public void setSpec1(String spec1) {
        this.spec1 = spec1;
    }

    public String getSpec2() {
        return spec2;
    }

    public void setSpec2(String spec2) {
        this.spec2 = spec2;
    }

    public String getSpec3() {
        return spec3;
    }

    public void setSpec3(String spec3) {
        this.spec3 = spec3;
    }

    
}

