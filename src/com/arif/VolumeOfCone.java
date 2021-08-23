package com.arif;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        double rad = in.nextDouble();
        System.out.print("Enter the height of cone: ");
        double height = in.nextDouble();
        double Vol = (3.14 * rad * rad * height) / 3;
        System.out.println("Volume of cone is : " + Vol);
    }
}
