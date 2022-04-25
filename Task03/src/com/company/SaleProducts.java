package com.company;

public class SaleProducts {
    public static void main(String[] args) {
        int num1 = 3, qty1 = 2000, num2 = 4, qty2 = 6000,num3 = 1, qty3 = 8500,num4 = 3, qty4 = 10000,num5 = 6, qty5 = 2000;
        int total1, total2, total3, total4, total5;
        total1 = num1 * qty1;
        total2 = num2 * qty2;
        total3 = num3 * qty3;
        total4 = num4 * qty4;
        total5 = num5 * qty5;

        System.out.println("SP1: Gia: " + qty1 + "," + "Sl: " + num1 + "," + "Tong gia sp1: " + total1);
        System.out.println("SP2: Gia: " + qty2 + "," + "Sl: " + num2 + "," + "Tong gia sp1: " + total2);
        System.out.println("SP3: Gia: " + qty3 + "," + "Sl: " + num3 + "," + "Tong gia sp1: " + total3);
        System.out.println("SP4: Gia: " + qty4 + "," + "Sl: " + num4 + "," + "Tong gia sp1: " + total4);
        System.out.println("SP5: Gia: " + qty5 + "," + "Sl: " + num5 + "," + "Tong gia sp1: " + total5);
    }
}
