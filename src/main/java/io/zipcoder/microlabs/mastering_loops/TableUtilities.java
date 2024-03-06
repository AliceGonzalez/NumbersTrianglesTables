package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                String cell = String.format("%3d |", i * j);
                result.append(cell);
            }
                   result.append("\n");
        }
        return result.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                String cell = String.format("%3d |", i * j);
                result.append(cell);
            }
            result.append("\n");
        }
        return result.toString();

    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 20; i++){
            for(int j = 1; j <= 20; j++){
                String cell = String.format("%3d |", i * j);
                result.append(cell);
            }
            result.append("\n");
        }
        return result.toString();
    }
}
