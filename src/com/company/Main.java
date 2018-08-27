package com.company;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int appAGE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name");
        name = sc.next();
        Calendar time = Calendar.getInstance();
        int hour = Calendar.HOUR_OF_DAY;
        if (hour > 12 || hour < 17) {
            System.out.println("Good Day" + "" + name);
        } else {
            System.out.println("Good morning" + name);
        }
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        Random rand = new Random();
        appAGE = rand.nextInt(90 - 18) + 18;
        int diff = appAGE - age;
        if (appAGE > age) {
            System.out.println("I am " + appAGE + " years old, which is " + diff + "\t" +"years older than you");
        } else {
            System.out.println("I am " + appAGE + " years old, which is " + diff +  "\t"+ "years younger than you");
        }
        System.out.println("Twice my age would be " + 2 * appAGE);
        if(appAGE % 2 == 0)
        {
            System.out.println("My age is an even number");
        }
        else if(appAGE % 2 == 1)
        {
            System.out.println("My age is an odd number");

        }
    }
}
