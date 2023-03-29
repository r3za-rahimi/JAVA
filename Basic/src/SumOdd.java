package src;

public class SumOdd {


    public static int sumOdd(int start, int end) {
        int result = 0;

        if (start < 0 || end < 0 || end < start) {

            return -1;

        } else {


            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {

                    result += i;

                }


            }


        }


        return result;
    }


    private static boolean isOdd(int number) {

        boolean result = false;

        if (number < 0) {
            result = false;

        } else if (number % 2 != 0) {

            result = true;
        }

        return result;
    }
}
