package com.company;

import java.util.Scanner;

public class AverageUsingArray_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Total numbers of numbers for Average : ");
        int i= sc.nextInt();
        int [] num =new int[i]; //create array
        float sum = 0;
        System.out.println("Enter the "+i+" numbers one-by-one");
        for (int j=0;j<i;j++){          //loop for addition
            num[j]=sc.nextInt();
            sum = sum + num[j];
        }
        System.out.println("Average of the numbers is : "+ sum/i);
    }
    }

