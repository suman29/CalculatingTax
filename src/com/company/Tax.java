package com.company;

public class Tax {
    String userInput, productName;
    int quantity;
    double price, totalTax;
    boolean imported;


    public Tax(String userInput) {
        this.userInput = userInput;
    }

    public double parseUserInputAndCalculateTax() {
        String input[] = userInput.split("\\s+");
        totalTax = 0;

        if (input.length == 4) {
            quantity = Integer.parseInt(input[0]);
            productName = input[1];
            price = Float.parseFloat(input[3]);
            imported = false;
            while (quantity > 0) {
                FoodBooksMedicines product = new FoodBooksMedicines(productName, price, imported);
                totalTax += product.priceOnApplyingTax();
                quantity--;
            }
        } else if (input.length == 5) {
            quantity = Integer.parseInt(input[0]);
            productName = input[2];
            price = Float.parseFloat(input[4]);
            imported = true;
            while (quantity > 0) {
                FoodBooksMedicines product = new FoodBooksMedicines(productName, price, imported);
                totalTax += product.priceOnApplyingTax();
                quantity--;
            }

        } else if (input.length == 6) {
            quantity = Integer.parseInt(input[2]);
            productName = input[3];
            price = Float.parseFloat(input[5]);
            imported = false;
            while (quantity > 0) {
                OtherCommodities product = new OtherCommodities(productName, price, imported);
                totalTax += product.priceOnApplyingTax();
                quantity--;
            }

        } else {
            quantity = Integer.parseInt(input[2]);
            productName = input[4];
            price = Float.parseFloat(input[6]);
            imported = false;
            while (quantity > 0) {
                OtherCommodities product = new OtherCommodities(productName, price, imported);
                totalTax += product.priceOnApplyingTax();
                quantity--;
            }

        }

        return totalTax;
    }
}
