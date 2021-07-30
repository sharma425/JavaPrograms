package com.company;

import java.util.Scanner;

public class DigitCount7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int count=0;
        boolean bool = true;
        long input = sc.nextLong();
        while(bool){
            input /=10;         //dividing by 10 for deleting last digit
            count++;            //incrementing count variable
            if(input==0){       //checking if number is finished or not
                bool=false;     //make loop condition false
            }

        }
        System.out.println(count);
    }
}
