//package com.company;
//this program have running bicycle with break and break functionality

import java.util.Scanner;

class Vehicle {
    public void property(){
        System.out.println("This is a Vehicle");
    }
}
interface Bicycle{
     void applyBrake(int decrement);
     void speedUp(int increment);
}
class AvonCycle extends Vehicle implements Bicycle {
     int speed ;

    @Override
    public void property() {
        super.property();
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Speed = "+ speed + "km/h");
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed = "+ speed + "km/h");
    }

}
public class MultipleInheritance_23 {
    public static void main(String[] args) {
    Scanner S = new Scanner(System.in) ;
    AvonCycle avonCycle1 = new AvonCycle();
    avonCycle1.speed=4;
    System.out.println("Bicycle Speed is "+ avonCycle1.speed + " km/h");
    boolean i=true;
    while (i){
        System.out.print("Enter 1 for SpeedUp and 2 for Break and 3 for Stop : ");
        int decision = S.nextInt();
        if(decision ==1 ){
            avonCycle1.speedUp(4);
            //calling applying speedUp method
        }
        if(decision == 2){
            avonCycle1.applyBrake(2);
            //calling applying break method
        }
        if(decision ==3) {
            avonCycle1.speed = 0;
            i=false;
        }
    }

    }
}
