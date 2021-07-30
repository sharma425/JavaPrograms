package com.company;

import java.util.Scanner;

public class MatrixAddition_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the Order of your matrix -");
        int order = sc.nextInt();
        float [][] matrix1 = new float[order][order];
        System.out.println("Enter The Values in 1st Matrix");
        //loops for input matrix element
        for (int i=0;i<order;i++){      //loop for row
            for (int j=0;j<order;j++){  //loop for column
                System.out.println("Enter value of row "+i+" and column "+j);
                matrix1[i][j]=sc.nextFloat();
            }
        }
        float [][] matrix2 = new float[order][order];
        System.out.println("Enter The Values in 2nd Matrix");
        //loops for input matrix element
        for (int i=0;i<order;i++){               //loop for row
            for (int j=0;j<order;j++){           //loop for column
                System.out.println("Enter value of row "+i+" and column "+j);
                matrix2[i][j]=sc.nextFloat();
            }
        }
        System.out.println("Addition of Two Matrix is : ");
        float [][] matrix3 = new float[order][order];
        for (int i= 0;i<=order;i++){        //loop for row
            for (int j=0;j<order;j++){       //loop for column
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                //logic for matrix addition
                System.out.print(matrix3[i][j]+" ");
                //printing matrix element
            }
            System.out.println();
        }
    }
}
