package com.company;

import java.util.Scanner;

public class ReverseNumber8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;//scanner object for input
        System.out.println("Enter The Number for Reverse");
        long num = sc.nextLong();
        boolean bool = true;
        long revNum = 0;
        while(bool){
            revNum =revNum*10 + num%10;
            //adding remainder of number when divided by 10
            num /=10;               //deleting the unit place of number
            if(num==0){
                bool=false;         //checking if number is finished or not
            }
        }
        System.out.println(revNum);

    }
}
