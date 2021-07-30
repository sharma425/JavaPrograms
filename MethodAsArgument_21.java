//This program will calculate (a+b)^2
package com.company;

import java.util.Scanner;

public class MethodAsArgument_21 {
    public int add(int a,int b){
        return a+b;
    }
    public int square(int num){

        return num*num;
    }
    public static void main(String[] args) {
        MethodAsArgument_21 obj =new MethodAsArgument_21();
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter The Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter The Value of a : ");
        int b = sc.nextInt();
        int square = obj.square(obj.add(a,b));
        //passing add method as arguent in square method
        System.out.println("("+a+"+"+b+")^2 = "+square);
    }
}
