package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int results = 0;

        return null;
    }

    public static String getOddNumbers(int start, int stop) {
        return null;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int stop) {

        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        //Use for loop
        StringBuilder sb= new StringBuilder();
        for(int i=start; i<stop; i += step)
            sb.append(i);
        return sb.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {

        return null;
    }
}