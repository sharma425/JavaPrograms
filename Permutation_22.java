package com.company;

import java.util.Scanner;

public class Permutation_22 {
    public static void permutation(String str,String ans){
        if (str.length()==0){
            //storing values in ans and printing on the time
            System.out.println(ans + " ");
            return;
        }
        for (int i=0;i<str.length();i++){
            //loop selecting one by one element
            char ch = str.charAt(i);
            String restString = str.substring(0,i)+str.substring(i+1);
            permutation(restString,ans +ch);
            //calling same function recursively
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter Your String For Permutation : ");
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        permutation(s,"");
    }

}
