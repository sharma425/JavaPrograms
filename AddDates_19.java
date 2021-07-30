//package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Scanner;

public class AddDates_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter first date in 'DD/MM/YYYY' Format");
        String firstDate = sc.next();
        System.out.println("Enter second date in 'DD/MM/YYYY' Format");
        String secondDate = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //set the date format object
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        //instanciate the Calender
        try{
            c1.setTime(sdf.parse(firstDate));
            c2.setTime(sdf.parse(secondDate));
            //set time by parsing input string
        }catch(ParseException e){
            e.printStackTrace();
        }

        //add date,month,year corresponding
        c1.add(Calendar.DATE, c2.get(Calendar.DATE));
        c1.add(Calendar.MONTH,c2.get((Calendar.MONTH)+1));
        c1.add(Calendar.YEAR,c2.get(Calendar.YEAR)-2);
        String newDate = sdf.format(c1.getTime());
        System.out.println("Addition of two Date: "+newDate);
    }
}
