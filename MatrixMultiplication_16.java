package com.company;

import java.util.Scanner;

public class MatrixMultiplication_16 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in) ;
        System.out.println("Enter the Order of your matrix -");
        int order = S.nextInt();
        float [][] matrix2 = matrixInput(order);
        float [][] matrix1 = matrixInput(order);
        float [][] matrix3 = matrixMultiply(matrix1,matrix2,order);
        matrixDisplay(order,matrix3);
    }
    public static float[][] matrixInput(int order){
        Scanner S = new Scanner(System.in) ;
        float [][] matrix = new float[order][order];
        System.out.println("Enter The Values in 2nd Matrix");
        for (int i=0;i<order;i++){          //loop for row
            for (int j=0;j<order;j++){       //loop for column
                System.out.println("Enter value of row "+i+" and column "+j);
                matrix[i][j]=S.nextFloat();
            }
        }
        return matrix;
    }
    public static float[][] matrixMultiply(float[][] matrix1,float[][] matrix2,int order){
        float [][] matrix3 = new float[order][order];

        for (int i= 0;i<order;i++){         //loop for row
            for (int j=0;j<order;j++){       //loop for column
                matrix3[i][j] = 0;
                for(int k=0;k<order;k++){
                    //loop for row by column multiplication
                    matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return matrix3;
    }
    public static void matrixDisplay(int order,float[][] matrix){
        System.out.println("Multiplication of Two Matrix is : ");
        for (int i= 0;i<order;i++){         //loop for row
            for (int j=0;j<order;j++){       //loop for column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}
