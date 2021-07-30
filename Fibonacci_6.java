package com.company;

import java.util.Scanner;

public class Fibonacci_6 {
    public static void main(String[] args) {
        int i=0,j=1;
        Scanner sc = new Scanner(System.in) ;       //scanner object for input
        System.out.println("Enter the limit of Fibonacci series");
        int k = sc.nextInt();                       //input for limit of series
        for(int l=0;l<=k;l++)                      //loop for fibonacci
        {
        System.out.print(i + " "+  j +" " );        //numbers with necessary space
        i+=j;                                       //logic for increment of i
        j+=i;                                       //logic for increment of j
        }
    }
}
