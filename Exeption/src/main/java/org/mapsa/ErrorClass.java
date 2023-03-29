package org.mapsa;

public class ErrorClass {




    public static int printNumber(int x)
    {
        x= x + 500;
        System.out.println(x);
        return x + printNumber(x + 5);
    }


    public static void main(String[] args)
    {
        printNumber(50);
    }

}
