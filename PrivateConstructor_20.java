//package com.company;
class MyEmployee {

    // create private constructor
    private MyEmployee() {

        System.out.println("This is a Employee Class Private Constructor.");
    }

    // create a public static method
    public static void instanceMethod() {

        // create an instance of MyEmploy class
        MyEmployee obj = new MyEmployee();
    }

}
public class PrivateConstructor_20 {
    public static void main(String[] args) {
        MyEmployee.instanceMethod();
        //accessing private constructor through public method
    }
}
