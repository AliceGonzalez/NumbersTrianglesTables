package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                result.append("*");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++){
            result.append("*");
        }
        return result.toString();
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
