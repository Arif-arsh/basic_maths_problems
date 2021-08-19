package com.arif;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double height = in.nextDouble();
        double Area = (base * height) / 2;
        System.out.print("Area of triangle is : " + Area);
    }
}
