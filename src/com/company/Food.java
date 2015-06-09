package com.company;

public class Food {
    double price;
    String name;
    boolean imported;

    public Food(String name, double price, boolean imported) {
        this.name = name;
        this.price = price;
        this.imported = imported;
    }

    public double priceOnApplyingTax() {
        if(imported)
            return (price+=0.05*price);
        return price;
    }
}
