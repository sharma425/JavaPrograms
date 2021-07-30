package com.company;

import java.util.Scanner;

public class PalindromeCheck_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter The Number for Pelindrome check");
        long num = sc.nextLong();
        long mynum = num;
        boolean bool = true;
        long revNum = 0;
        while(bool){            //loop for reverse the number
            revNum =revNum*10 + num%10;
            //adding remainder of number when divided by 10
            num /=10;                  //deleting the unit place of number
            if(num==0){               //checking if number is finished or not
                bool=false;
            }
        }
        if (mynum == revNum){           //condition to check it is pelindrome
            System.out.println("The Number Is Palindrome");
        }
        else {
        System.out.println("The Number Is Not Palindrome");
        }

    }
}
