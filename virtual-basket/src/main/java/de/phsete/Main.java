package de.phsete;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        User testUser = new User("Philipp", warehouse);
        Basket testBasket = testUser.getBasket();
        testBasket.scan("A0002");
        testBasket.scan("A0001");
        testBasket.scan("A0002");
        testBasket.printContents();
        testBasket.addDiscount(Deals.discountPercent(testBasket, 10, warehouse.getProduct("A0001")));
        System.out.printf("Total: %.2f\r\n", testBasket.total());

        User testUser2 = new User("Martina", warehouse);
        Basket testBasket2 = testUser2.getBasket();
        testBasket2.scan("A0002");
        testBasket2.scan("A0001");
        testBasket2.scan("A0002");
        testBasket2.printContents();
        testBasket2.addDiscount(Deals.discountBuyOneGetOneFree(testBasket2, warehouse.getProduct("A0002")));
        System.out.printf("Total: %.2f\r\n", testBasket2.total());
    }
}