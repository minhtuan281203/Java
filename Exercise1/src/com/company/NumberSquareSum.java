package com.company;

public class NumberSquareSum {
    public static void main(String[] args) {
        int startNum = 1, endNum = 100;
        int sum = 0;
        int number = startNum;
        while (number <= endNum) {
            sum += number*number;
            number++;
        }

        System.out.println(sum);
    }
}
