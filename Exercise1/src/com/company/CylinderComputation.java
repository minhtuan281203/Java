package com.company;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius = 2;
        double height = 5;
        double surfaceArea, baseArea, Volume;
        final double PI = 3.14159265;
        surfaceArea = 2 * PI * radius * height;
        baseArea = surfaceArea + 2 * PI * radius * radius;
        Volume = PI * radius * radius * height;

        System.out.println("S surface:" + surfaceArea);
        System.out.println("S base:" + baseArea);
        System.out.println("Volume:" + Volume);
    }
}
