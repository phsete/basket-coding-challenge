package de.phsete;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;
    private Warehouse warehouse;

    public Basket(Warehouse warehouse) {
        this.products = new ArrayList<Product>();
        this.warehouse = warehouse;
    }

    public void scan(String productName) {
        this.products.add(warehouse.getProduct(productName));
    }

    public void printContents() {
        System.out.println("Basket Contents:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
