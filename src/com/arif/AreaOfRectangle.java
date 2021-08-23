package com.arif;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double l = in.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        double w = in.nextDouble();
        double area = l * w;
        System.out.print("Area of rectangle is : " + area);
    }
}
