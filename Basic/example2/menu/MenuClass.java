package ir.mapsa.class15.menu;

import java.util.Scanner;

public class MenuClass {

    public static int op = 0;
    Scanner scn = new Scanner(System.in);
    public  void showMenuForClacuteTwoNum(){

        System.out.println("" + "\u001B[33m");
        System.out.println("============================");
        System.out.println("|       MENU SELECTION     |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|        1. sum            |");
        System.out.println("|        2. minus          |");
        System.out.println("|        3. divide         |");
        System.out.println("|        4. multiple       |");
        System.out.println("|        5. remain         |");
        System.out.println("|        6. power          |");
        System.out.println("|        0. exit          |");
        System.out.println("============================");

        System.out.print("your option ?  ");
         op = scn.nextInt();
    }


    public int[] makeArray(int amount){


        int[] array = new int[amount];

        for (int i = 0; i < amount; i++) {

            System.out.print("enter number : " + (i + 1) + " ");
            array[i] = scn.nextInt();

        }

        return array;
    }


    public void showMenuForArray(){


        System.out.println("" + "\u001B[33m");
        System.out.println("============================");
        System.out.println("|       MENU SELECTION     |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|     1. Sum numbers       |");
        System.out.println("|     2. Average numbers   |");
        System.out.println("|     3. Get max number    |");
        System.out.println("|     4. Get min number    |");
        System.out.println("|     5.Show prime numbers |");
        System.out.println("|     6.Show repeat number |");
        System.out.println("|        0. exit           |");
        System.out.println("============================");;

        op =  scn.nextInt();
    }

    public  void goodBye(){

        System.out.println(" see you later , bye");
    }
}
