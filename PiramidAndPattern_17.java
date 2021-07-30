package com.company;

import java.util.Scanner;

public class PiramidAndPattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the no of steps for Piramid");
        int count = sc.nextInt();
        int k=0;
        for (int i=count;i>0;i--){
            for(int j=i;j>0;j--){   //loop for printing space
                System.out.print(" ");
            }
            for (int j=2*k+1;j>0;j--){   //loop for printing pattern
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}
