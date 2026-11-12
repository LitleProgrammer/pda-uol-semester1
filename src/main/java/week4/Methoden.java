package week4;

public class Methoden {

    public static int min(int[] values) {
        //Wenn das Array eer ist geben wir -1 zurück
        if (values.length == 0) {
            return -1;
        }

        int smallest = values[0];

        for (int num : values) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static double product(double[] values) {
        double prod = 1;

        for (double doub : values) {
            prod *= doub;
        }

        return prod;
    }

    public static boolean isLatinLetter(char letter) {
        int unicode = (int) letter;

        if (unicode >= 65 && unicode <= 90) {
            return true;
        }

        if (unicode >= 97 && unicode <= 122) {
            return true;
        }

        return false;
    }

    public static int[][] createIdentityMatrix(int size) {
        int [][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
