package ir.mapsa.class15.calculators;

import java.util.Stack;

public class ExtendedCalculator {


    private int[] arrays;

    public ExtendedCalculator(int[] arrays) {
        this.arrays = arrays;
    }

    public int sumArray() {

        int sum = 0;
        for (int x : arrays) {

            sum += x;
        }

        return sum;
    }

    public int getAvrageArray(){

        int sum = 0;

        for (int x : arrays ) {

            sum += x;
        }
        return sum/ arrays.length;
    }





    public int getMaxArray() {

        int hightValue = Integer.MIN_VALUE;
        for (int a : arrays) {
            if (a > hightValue) {

                hightValue = a;
            }


        }
        return hightValue;


    }


    public int getMinValue() {

        Integer min = Integer.MAX_VALUE;

        if (arrays.length != 0) {


            for (int x : arrays) {
                if (x < min) {

                    min = x;
                }

            }
        }
        return min;
    }


    public void showPrimeNumber() {

        Stack<Integer> result = new Stack<>();

        for (int x : arrays) {

            if (checkPrimeNumber(x)) {

                result.push(x);
            }

        }

        if (!result.isEmpty()){

            System.out.println("prime number is : " +result.toString());
        }else {

            System.out.println("there is no prime number");
        }
    }


    private boolean checkPrimeNumber(int num) {

        boolean result = true;
        if (num == 2) {

            return true;

        } else if (num == 0 || num == 1) {


            result = false;

        } else if (num % 2 == 0) {

            result = false;

        } else {

            for (int i = 2; i < ((num+1)/2); i++) {

                if (num % i == 0) {

                    result = false;

                    break;
                }

            }


        }
        return result;

    }

    public void repetitionNumber(int number){

        int flag = 0;
        for (int x : arrays){


            if (x == number){

                flag++;
            }

        }

        System.out.println("" + "\u001B[32m");
        if (flag>= 2){

            System.out.println(" this number repeat for " + flag  + " time");
        }else if(flag== 1){

            System.out.println("Only 1 available");

        } else if (flag ==0) {
            System.out.println(" there is no such number");
        }


    }

}
