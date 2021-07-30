package com.company;

import java.util.Scanner;

public class PrimeCheck_4 {
    static boolean PrimeChecker(int num){
        for(int i=2;i<num/2;i++){
            //checking if no. is divisible by any no. from 2 to n/2
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        boolean B = PrimeChecker(num); //function call to check no is prime
        if (B==true){
            System.out.println("Your Number Is Prime Number");
        } else{
            System.out.println("Your Number Is Not Prime Number");
        }

    }
}
