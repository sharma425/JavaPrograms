package com.company;

import java.util.Scanner;

public class ArmStrong_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the lower boundry :");       //Taking input lower boundary
        int lower = sc.nextInt();
        System.out.println("Enter the lower boundry :");        //Taking input upper boundary
        int upper = sc.nextInt();
        System.out.println("Armstrong Numbers Between Intervals : "+ lower +" and "+ upper +" are" );
        for (int i= lower; i<= upper;i++){          //loop for checking each no. one by one
            boolean bool = true;
            int test = 0,j=i;
            while(bool){
                int k=j%10;                       //retriving unit place digit
                test =test + k*k*k;             //perform cubic addition
                j/=10;                          //delete the unit place digit
                if(j==0){                       //checking if number is finished or not
                    bool=false;
                }
            }
            if (test == i){

                System.out.println(test);
            }
        }
    }
}
