package com.arif;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first fibo number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second fibo number: ");
        int num2 = in.nextInt();
        System.out.print("which fibo number you want to find: ");
        int n = in.nextInt();
        int count = 2;
        while (count <= n) {
            int temp = num2;
            num2 = num2 + num1;
            num1 = temp;
            count++;
        }
        System.out.println(num2);
    }
}
