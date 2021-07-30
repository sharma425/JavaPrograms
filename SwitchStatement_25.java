package com.company;

import java.util.Scanner;

public class SwitchStatement_25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Which Age Interval You belongs to : ");
        System.out.println("1 : For 5-18\n2 : For 19-25\n3 : For 26-50\n4 : For 51-60\n5 : For 61-80");
        int age = sc.nextInt();
        switch(age){
            case 1:
                System.out.println("School Age");
                break;
            case 2:
                System.out.println("College Age");
                break;
            case 3:
                System.out.println("Earning Age");
                break;
            case 4:
                System.out.println("World Tour Time");
                break;
            case 5:
                System.out.println("Retirement Time");
                break;
            default:
                 System.out.println("Enjoy Your Life");
        }
    }
}
