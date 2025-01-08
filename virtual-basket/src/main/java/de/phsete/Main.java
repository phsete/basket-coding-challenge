package de.phsete;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        User testUser = new User("Philipp", warehouse);
        Basket testBasket = testUser.getBasket();
        testBasket.scan("A0001");
        testBasket.printContents();
    }
}