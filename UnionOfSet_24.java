package com.company;

import java.util.Scanner;

public class UnionOfSet_24 {


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in) ;
                System.out.println("Enter no. of values in set 1");
                int set1Len = sc.nextInt();
                System.out.println("Enter no. of values set2");
                int set2Len = sc.nextInt();
                System.out.println("Enter values in 1st set");
                char[] set1 = inputSet(set1Len);           // calling input function
                System.out.println("Enter values in 2nd set");
                char[] set2 = inputSet(set2Len);            //calling input function
                char[] result = union(set1,set2);           //calling union function
                System.out.println("Your Union Set is : ");
                displaySet(result);                       //calling display function
            }

            //function for input set
            public static char[] inputSet(int len){
                Scanner sc = new Scanner(System.in) ;
                char[] set=new char[len];
                for (int i=0;i<len;i++){
                    set[i]= sc.next().charAt(0);
                }
                return set;
            }

            //function for union
            public static char[] union(char[] set1,char[] set2){
                int i=0,j=0;
                boolean bool ;

                //loop for counting no of elements in union for array declaration
                for (char element2 : set2){
                    bool = true;
                    for (char element1: set1){
                        if(element1==element2){
                            bool=false;i++;
                        }
                    }
                    if (bool){
                        i+=2;
                        bool=false;
                    }

                }

                char[] result = new char[i]; //array declare for set union
                for(char element1: set1){
                    result[j++]=element1;
                    //storing all element of set1 in result
                }
                for (char element2 : set2){
                    //loop for checking element in set2 is present in result set
                    bool = true;
                     for (char element1: result){
                         //skip iteration if already present
                        if(element1==element2){
                            bool=false;
                            break;
                        }
                    }
                    if (bool){
                        //add element if not present
                        result[j++]=element2;
                        bool=false;
                    }

                }
                return result; //return the result set
            }

            //display set function
            public static void displaySet(char[] result){
                System.out.print("{  ");
                for (char element : result){
                    System.out.print(element + " , ");
                }
                System.out.print("}");
            }
        }

