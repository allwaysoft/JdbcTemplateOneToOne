package com.tenxperts.spring.jdbc.domain;

public class Order {

    private Long orderId;
    private String user;
    private LineItem item;

    public Order() {
    }

    public Order(Long orderId, String user, LineItem item) {
        this.orderId = orderId;
        this.user = user;
        this.item = item;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LineItem getItem() {
        return item;
    }

    public void setItem(LineItem item) {
        this.item = item;
    }

}
