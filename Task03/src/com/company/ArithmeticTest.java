package com.company;

public class ArithmeticTest {
    public static void main(String[] args) {
        int num1 = 98, num2 = 5;
        int sum, different, product, quotient, remainder;

        sum = num1 + num2;
        different = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        remainder = num1 % num2;
        //print a line
        System.out.println("The sum, different, product, quotient, remainder of " + num1 + " and " + num2 + " are: " + sum + ", " + different + ", " + product + ", " + quotient + ", " + remainder);
    }
}
