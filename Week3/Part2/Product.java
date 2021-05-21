package com.company.Part2;

public class Product {
    private int id;
    private int yearModel;
    private String brand;
    private double priceModel;
    private String color;

    Product(){
    }

    Product(int id, int yearModel, String brand, double priceModel, String color) {
        this.id = id;
        this.yearModel = yearModel;
        this.brand = brand;
        this.color = color;
        this.priceModel = priceModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPriceModel() {
        return priceModel;
    }

    public void setPriceModel(double priceModel) {
        this.priceModel = priceModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
