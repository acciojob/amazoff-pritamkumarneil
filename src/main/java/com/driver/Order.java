package com.driver;

public class Order {

    private String id;
    private int deliveryTime;
    public Order(){}

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.id=id;
        String[] time =deliveryTime.trim().split(":");
        this.deliveryTime=Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
    }

    public String getId() {
        return this.id;
    }

    public int getDeliveryTime() {return this.deliveryTime;}

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
