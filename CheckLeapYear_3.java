package com.company;

import java.util.Scanner;

public class CheckLeapYear_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Your Input Year : ");
        int year = sc.nextInt();                //User Input
        if (year%4==0){                      //if remainder is 0 when devided by 4
            System.out.println("Your Input Year is a Leap Year");
        }
        else{
            System.out.println("Your Input Year is not a Leap Year");
        }
    }
}
