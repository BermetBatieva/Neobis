package com.company.Part2;

import java.util.Date;
import java.util.List;

public class Sale {
    private int id;
    private  Customer customer;
    private Seller seller;
    private List<Product> products;
    private Date dateOfSale;

    Sale(){
    }

    Sale(int id,Customer customer,Seller seller,List<Product> products,Date dateOfSale ){
        this.id = id;
        this.customer = customer;
        this.seller = seller;
        this.products = products;
        this.dateOfSale = dateOfSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
}
