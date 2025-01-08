package de.phsete;

public class User {
    
    private Basket basket;
    private String name;

    public User(String name, Warehouse warehouse) {
        this.name = name;
        this.basket = new Basket(warehouse);
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
