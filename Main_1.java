//package com.company;

import java.util.Scanner;
public class Main_1 {
    public static void main_1(String[] args) {
        Scanner sc = new Scanner(System.in) ;

//        swap two number using temp variable
        System.out.println("Enter two variables for swapping");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Your 1st input variable is " + a);
        System.out.println("Your 2st input variable is " + b);

//        swap two number without using temp variable
        System.out.println("Enter two variables for swapping");
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = y;
        x = x + y;
        y= x-y;
        x=x-y;
        System.out.println("Your 1st output variable is " + x);
        System.out.println("Your 2st output variable is " + y);

    }
}
