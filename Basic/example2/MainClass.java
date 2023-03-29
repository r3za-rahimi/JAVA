package ir.mapsa.class15;

import ir.mapsa.class15.calculators.Calculator;
import ir.mapsa.class15.calculators.ExtendedCalculator;
import ir.mapsa.class15.menu.MenuClass;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        MenuClass menu = new MenuClass();


        System.out.println("for calculate just 2 number press 1  ");
        System.out.println("for calculate  many number press 2  " + "\u001B[36m");

        int mainOption = scn.nextInt();

        if (mainOption == 1) {

            System.out.print("enter number 1 ");
            int num1 = scn.nextInt();
            System.out.print("enter number 2 ");
            int num2 = scn.nextInt();

            Calculator cal = new Calculator(num1, num2);


            menu.showMenuForClacuteTwoNum();

            while (MenuClass.op != 0) {
                System.out.println( "\u001B[34m");

                if (MenuClass.op == 1) {
                    System.out.println("sum is : " + cal.sum());
                    menu.showMenuForClacuteTwoNum();
                } else if (MenuClass.op == 2) {
                    System.out.println("minus is : " + cal.minus());
                    menu.showMenuForClacuteTwoNum();
                } else if (MenuClass.op == 3) {
                    System.out.println("divide is : " + cal.divide());
                    menu.showMenuForClacuteTwoNum();
                } else if (MenuClass.op == 4) {
                    System.out.println("multiple is : " + cal.multiple());
                    menu.showMenuForClacuteTwoNum();
                } else if (MenuClass.op == 5) {
                    System.out.println("remainr is : " + cal.remain());
                    menu.showMenuForClacuteTwoNum();
                } else if (MenuClass.op == 6) {
                    System.out.println("power is : " + cal.power());
                    menu.showMenuForClacuteTwoNum();
                } else {
                    System.out.println("enter correct number :/ ");
                    menu.showMenuForClacuteTwoNum();
                }
            }
            menu.goodBye();


        }
        if (mainOption == 2) {


            System.out.println("how many number do you want to add ?" + "\u001B[35m");

            int amount = scn.nextInt();
            int[] array = menu.makeArray(amount);
            ExtendedCalculator exCal = new ExtendedCalculator(array);


            menu.showMenuForArray();

            while (MenuClass.op != 0) {
                System.out.println("" + "\u001B[31m");

                if (MenuClass.op == 1) {
                    System.out.println("sum of numbers is : " + exCal.sumArray());
                    menu.showMenuForArray();
                } else if (MenuClass.op == 2) {
                    System.out.println("average numbers is : " + exCal.getAvrageArray());
                    menu.showMenuForArray();
                } else if (MenuClass.op == 3) {
                    System.out.println("max number is : " + exCal.getMaxArray());
                    menu.showMenuForArray();
                } else if (MenuClass.op == 4) {
                    System.out.println("min number is : " + exCal.getMinValue());
                    menu.showMenuForArray();
                } else if (MenuClass.op == 5) {
                    exCal.showPrimeNumber();
                    menu.showMenuForArray();
                } else if (MenuClass.op == 6) {

                    System.out.println("enter number you want to check:");
                    int number = scn.nextInt();
                    exCal.repetitionNumber(number);
                    menu.showMenuForArray();
                } else {
                    System.out.println("enter correct number :/ ");
                    menu.showMenuForArray();
                }

            }

            menu.goodBye();
        }
    }
}
