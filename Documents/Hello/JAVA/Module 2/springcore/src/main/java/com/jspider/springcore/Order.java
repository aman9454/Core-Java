package com.jspider.springcore;

import java.util.Date;
import java.util.Map;

public class Order {
    private int orderId;
    private double totalAmount;
    private Date orderDate;
    private Map<Integer, String> products;

    public Order(int orderId, double totalAmount, Date orderDate, Map<Integer, String> products) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.products = products;
    }

    public void display() {
        System.out.println(orderId);
        System.out.println(totalAmount);
        System.out.println(orderDate);
        System.out.println(products);
    }
}
