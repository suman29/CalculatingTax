package com.company;

public class Main {
    ConsoleInput input;
    ConsoleOutput output;
    Tax tax;

    public void start() {
        input = new ConsoleInput();
        output = new ConsoleOutput();
        tax = new Tax(input.takeUserInputForMainMenu());
        output.display(tax);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.start();

    }
}
