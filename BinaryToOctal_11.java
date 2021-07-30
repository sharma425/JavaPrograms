package com.company;

import java.util.Scanner;

public class BinaryToOctal_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Your Choice : ");
        System.out.println("For Convert Binary to Octal Press 1 ");
        System.out.println("For Convert Octal to Binary press 2");
        int choice = sc.nextInt();
        if(choice == 1){          //code for binary to octal
            System.out.print("Enter Binary number : ");
            long binary = sc.nextLong();
            long octal = convertToOctal(binary);    //calling convertor function
            System.out.print("Octal number is : ");
            System.out.println(octal);
        }
        if(choice == 2){            //code for octal to binary
            System.out.print("Enter Octal number : ");
            int octal = sc.nextInt();
            long binary = convertToBinary(octal);       //calling convertor function
            System.out.print("Binary number is : ");
            System.out.println(binary);
        }

            }
    public static int convertToOctal(long binary)
    {
        int octal = 0, decimal = 0, i = 0;
        //loop for binary to decimal
        while(binary != 0)      //checking if number is finished or not
        {
            decimal += (binary % 10) * Math.pow(2, i);
            //retriving unit place value * 2 power corresponding place and adding 
            ++i;
            binary /= 10;          //deleting the unit place of number
        }
        i = 1;
        //loop for decimal to octal
        while (decimal != 0)       //checking if number is finished or not
        {
            octal += (decimal % 8) * i;
            decimal /= 8;                   
            i *= 10;
        }
        return octal;
    }

    public static long convertToBinary(int octal)
    {
        int decimal = 0, i = 0;
        long binary = 0;
        //loop for octal to decimal
        while(octal != 0)        //checking if number is finished or not
        {
            decimal += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;           //deleting the unit place of number
        }
        i = 1;
        //loop for decimal to bnary
        while (decimal != 0)       //checking if number is finished or not
        {
            binary += (decimal % 2) * i;
            decimal /= 2;               
            i *= 10;
        }
        return binary;
    }
}

