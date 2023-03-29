package ir.mapsa.class15.calculators;

public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {

        return num1 + num2;

    }


    public int minus() {

        if (num2 > num1) {

            return num2 - num1;

        } else {

            return num1 - num2;

        }


    }

    public float divide() {
        if (num2 == 0) {
            System.out.println("cant divide by zero , change your number");
            return 0;
        } else {

            return (float) num1 / num2;

        }
    }

    public int multiple() {

        return num1 * num2;

    }


    public int remain() {

        return num1 % num2;

    }


    public long power() {

        return (long) Math.pow(num1, num2);

    }
}
