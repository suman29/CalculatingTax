package com.company;

public class OtherCommodities {
    double price;
    String name;
    boolean imported;

    public OtherCommodities(String name, double price, boolean imported) {
        this.price = price;
        this.name = name;
        this.imported = imported;
    }

    public double priceOnApplyingTax() {
        price+=0.10*price;
        if(imported)
        return (price+=0.05*price);
        return price;
    }

    @Override
    public String toString() {
        if(imported)
            return ("1 imported "+name+":"+price);
        else
            return ("1 "+name+":"+price);
    }
}
