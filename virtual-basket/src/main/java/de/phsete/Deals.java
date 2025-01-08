package de.phsete;

public final class Deals {
    public static Double discountPercent(Basket basket, int percent, Product conditionProduct) {
        Double discount = 0.0;
        for (Product product : basket.getProducts()) {
            if(product == conditionProduct) {
                discount += (product.getPrice() * 0.01 * percent);
            }
        }
        return discount;
    }

    public static Double discountBuyOneGetOneFree(Basket basket, Product conditionProduct) {
        int count = 0;
        int discountCount = 0;
        for (Product product : basket.getProducts()) {
            if(product == conditionProduct) {
                count ++;
                if(count % 2 == 0) {
                    discountCount++;
                }
            }
        }
        return conditionProduct.getPrice() * discountCount;
    }
}
