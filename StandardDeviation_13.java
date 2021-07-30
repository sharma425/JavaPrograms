package com.company;

import java.util.Scanner;

public class StandardDeviation_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Total numbers of Samples for Standard Deviation : ");
        int i= sc.nextInt();            //user input sample number
        double [] sample =new double[i];
        double sum = 0;
        System.out.println("Enter the "+i+" numbers one-by-one");
        for (int j=0;j<i;j++){      //loop for sum
            sample[j]=sc.nextInt();
            sum = sum + sample[j];
        }
        double mean = sum/i;
        double standardDeviation = standardDeviation(sample,mean);
        //function call for standard deviation
        System.out.println("Standard Deviation of Sample is : "+ standardDeviation);
    }
    public static double standardDeviation(double[] arr, double mean){
        double  sD = 0.0;
        int length = arr.length;

        for(double num :arr) {      //loop for array element
            sD += Math.pow(num - mean , 2);
            //logic for standard deviation
        }
            return Math.sqrt(sD/length);
        //using math class for squareroot


    }
}
