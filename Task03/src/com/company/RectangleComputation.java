package com.company;

public class RectangleComputation {
    public static void main(String[] args) {
        double length = 4, width = 6, area, perimeter;
        area = length * width;
        perimeter = (length + width) * 2;

        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);
    }
}
