package com.company;

import java.util.ArrayList;

public class ComputeTaxMultipleItems {
    private ArrayList<Tax> products;
    private double totalTax,salesTax;

    public ComputeTaxMultipleItems(ArrayList<Tax> products) {
        this.products = products;
    }

    public double getTotalTax() {
        for(Tax tax : products) {
            totalTax = totalTax + tax.parseUserInputAndCalculateTax();
            salesTax=salesTax+tax.getSalesTax();
        }
        return  totalTax;
    }
    public double getSalesTax() {
        return salesTax;
    }
}
