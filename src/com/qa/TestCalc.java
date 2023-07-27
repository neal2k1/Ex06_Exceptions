package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Multiply result: " + bc.mult(2, 3));
        try {
            System.out.println("Divide result: " + bc.div(6, 0));
        }
        catch (ArithmeticException e) {
            System.out.println("Error Caught!");
        }


    }
}
