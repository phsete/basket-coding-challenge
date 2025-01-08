package de.phsete;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;
    private Warehouse warehouse;
    private Double discount;

    public Basket(Warehouse warehouse) {
        this.products = new ArrayList<Product>();
        this.warehouse = warehouse;
        this.discount = 0.0;
    }

    public void scan(String productName) {
        this.products.add(warehouse.getProduct(productName));
    }

    public Double total() {
        Double totalSum = 0.0;
        for (Product product : products) {
            totalSum += product.getPrice();
        }
        return totalSum - this.discount;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addDiscount(Double discount) {
        this.discount += discount;
    }

    public void printContents() {
        System.out.println("Basket Contents:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
