package de.phsete;

import java.util.HashMap;
import java.util.Map;

public class Warehouse { 
    // Initial Product List -> Could be read from a Database
    public HashMap<String, Double> INVENTORY = new HashMap<String, Double>() {{
        put("A0001", 12.99);
        put("A0002", 3.99);
    }};

    private HashMap<String, Product> products;

    public Warehouse() {
        this.products = getProductsFromInitial();
    }

    private HashMap<String, Product> getProductsFromInitial() {
        HashMap<String, Product> productList = new HashMap<String, Product>();
        for (Map.Entry<String,Double> entry : this.INVENTORY.entrySet()) {
            String productName = entry.getKey();
            Double productPrice = entry.getValue();
            productList.put(productName, new Product(productName, productPrice));
        }
        return productList;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }

    public Product getProduct(String productName) {
        if(products.containsKey(productName)) {
            return products.get(productName);
        } else {
            System.out.println("Product not found in Warehouse");
            return null;
        }
        
    }
}
