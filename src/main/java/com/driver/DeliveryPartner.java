package com.driver;

public class DeliveryPartner {

    private String id;
    private int numberOfOrders;

    public DeliveryPartner(String id) {
        this.id = id;
        this.numberOfOrders = 0;
    }

    public String getId() {
        return this.id;
    }

    public Integer getNumberOfOrders(){
        return this.numberOfOrders;
    }

    public void setNumberOfOrders(Integer numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
}