package com.company.Part2;

public class Customer{
    private int id;
    private String name;
    private String phoneNumber;
    private String address;

    public Customer(){

    }
    public Customer(int id,String name,String phoneNumber,String address){
        this.id = id;
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
