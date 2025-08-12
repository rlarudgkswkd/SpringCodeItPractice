package org.example.Head02_OOPpragramming.topic01AndTopic02.example03;

public class Product {
    private String productId;
    private String name;
    private double price;

    // 생성자
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter 메서드

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

    @Override
    public String toString() {
        return "Product{" +
                "제품ID='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
