package com.company;

import java.util.Scanner;

public class CharCheck_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;       //scanner object for input
        System.out.print ("Input a character: ");
        char ch = sc.next ().charAt (0);        //input character
        if((ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'B' )) {
            //check char is belong to capital or small albhabets
            System.out.println("Your input Character is a 'Alphabet'");
        }
        else {
            System.out.println("Your input Character is not a 'Alphabet'");
        }
    }
}
