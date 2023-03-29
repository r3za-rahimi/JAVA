package src;

public class LeafYearCalculator {

    public static boolean isLeapYear(int year) {


        if (year > 9999 || year < 1) {
            return false;

        }

        return (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0);


//         second way

//        else if (year % 4 != 0) {
//
//            return false;
//        } else if (year % 100 != 0) {
//
//            return false;
//        } else if (year % 400 != 0) {
//            return false;
//        } else {
//
//            return true;
//        }


    }


}
