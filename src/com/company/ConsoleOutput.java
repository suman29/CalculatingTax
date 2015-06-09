package com.company;

public class ConsoleOutput {
    public void display(Tax tax) {
        System.out.println("total tax = "tax.parseUserInputAndCalculateTax());
        System.out.println("sales tax = "tax.getSalesTax());
    }
}
