package com.arif;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        double side = in.nextDouble();
        double area = (1.73 * side * side) / 4;
        System.out.print(area);
    }
}
