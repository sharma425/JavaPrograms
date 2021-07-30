package com.company;
import java.util.Scanner;
public class alphabet_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print ("Input a character: ");
        char c = sc.next ().charAt (0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            //condition to check if the char is belong to vovel or not
            System.out.println("Your input Alphabet is a 'Vovel'");
        }
        else {
            System.out.println("your input Alphabet is a 'Consonant'");
        }

    }
}
