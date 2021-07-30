package com.company;

import java.util.Scanner;

public class ArrayCOncathenation_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter no. of values in 1st array");
        int arr1Len = sc.nextInt();
        System.out.println("Enter no. of values in 2nd array");
        int arr2Len = sc.nextInt();
        System.out.println("Enter values in 1st array");
        float[] arr1 = inputArrar(arr1Len);             //defining 2D arrays
        System.out.println("Enter values in 2nd array");
        float[] arr2 = inputArrar(arr2Len);
        float[] result = concat(arr1,arr2,arr1.length+arr2.length);
        System.out.println("Your concatnated Array is : ");
        displayArray(result);
    }
    public static float[] inputArrar(int len){
        Scanner sc = new Scanner(System.in) ;
            float[] arr=new float[len];
        for (int i=0;i<len;i++){
            arr[i]= sc.nextFloat();
        }
        return arr;
    }
    public static float[] concat(float[] arr1,float[] arr2,int len){
        float[] result = new float[len];
        int i=0;
        for (float element : arr1){        //loop for filling 1st array
             result[i]=element;
             i++;
        }
        for (float element : arr2){
            //loop check each 2nd array element present in result or not
            result[i]=element;
            i++;
        }
        return result;
    }
    public static void displayArray(float[] result){
        System.out.print("[  ");
        for (float element : result){
            System.out.print(element + "  ");
        }
        System.out.print("]");
    }
}
