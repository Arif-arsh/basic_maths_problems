package com.arif;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float Area = 0;
            System.out.println("Enter the radius of circle: ");
            float rad = in.nextFloat();
            Area = (float) (3.14 * rad * rad);
            System.out.println("Area of circle is: " + Area);
    }
}
