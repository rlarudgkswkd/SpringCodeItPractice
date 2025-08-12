package org.example.Head02_OOPpragramming.topic01AndTopic02.example03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    //getter or setter 생성 법 실습
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public Order(String orderId, List<Product> products, boolean isPaid) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = isPaid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    // 오버로딩: 가변인자 사용
    public void addProduct(Product... products) {

        this.products.addAll(Arrays.asList(products));
    }

}