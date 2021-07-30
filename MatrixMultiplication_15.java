package com.company;

import java.util.Scanner;

public class MatrixMultiplication_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the Order of your matrix -");
        int order = sc.nextInt();
        //defining 2D arrays
        float [][] matrix1 = new float[order][order];
        float [][] matrix2 = new float[order][order];
        float [][] matrix3 = new float[order][order];

        System.out.println("Enter The Values in 1st Matrix : ");
        for (int i=0;i<order;i++){              //loop for row
            for (int j=0;j<order;j++) {          //loop for column
                System.out.println("Enter value of row " + i + " and column " + j+" : ");
                matrix1[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Enter The Values in 2nd Matrix : ");
        for (int i=0;i<order;i++){              //loop for row
            for (int j=0;j<order;j++) {          //loop for column
                System.out.println("Enter value of row " + i + " and column " + j +" : ");
                matrix2[i][j] = sc.nextFloat();
            }
        }
        System.out.println("The values in the multiplication Matrix are : ");
        for (int i= 0;i<order;i++){             //loop for row
            for (int j=0;j<order;j++){           //loop for column
                matrix3[i][j] = 0;
                for(int k=0;k<order;k++){
                    //loop for row by column multiplication
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                    System.out.printf("%5.2f  ",matrix3[i][j]);
                    //printing matrix element
            }
            System.out.println();
        }

    }
}
