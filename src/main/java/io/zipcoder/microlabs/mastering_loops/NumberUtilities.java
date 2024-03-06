package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += 1) {
            if (!isOdd(i)) {
                sb.append(i);
            }

        }
        return sb.toString();
    }

    public static String getOddNumbers(int start, int stop) {

        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += 1) {
            if (isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    private static boolean isOdd(int n){
        return !((n) % 2 == 0);
    }
    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder sb= new StringBuilder();
        for(int i=start; i<stop; i += step)
            sb.append(i*i);
        return sb.toString();


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
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            sb.append((int) Math.pow(i, exponent));
        }
        return sb.toString();
    }
}