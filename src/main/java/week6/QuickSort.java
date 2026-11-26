package week6;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] values = new int[]{23, 14, 53, 69, 42, 78, 44, 38, 39};
        System.out.println(Arrays.toString(values));
        quickSort(values);
        System.out.println(Arrays.toString(values));

        /*
            [23, 14, 53, 69, 42, 78, 44, 38, 39]
            [ 23, 14, 38, ] 39 [ 42, 78, 44, 53, 69 ]
            [ 23, 14, ] 38 [  ]
            [ ] 14 [ 23 ]
            [ 42, 53, 44, ] 69 [ 78 ]
            [ 42, ] 44 [ 53 ]
            [14, 23, 38, 39, 42, 44, 53, 69, 78]
         */

        int[] values2 = new int[]{22, 10, 15, 18, 35, 29, 30, 37, 23};
        System.out.println(Arrays.toString(values2));
        quickSort(values2);
        System.out.println(Arrays.toString(values2));

        /*
            [22, 10, 15, 18, 35, 29, 30, 37, 23]
            [ 22, 10, 15, 18, ] 23 [ 29, 30, 37, 35 ]
            [ 15, 10, ] 18 [ 22 ]
            [ ] 10 [ 15 ]
            [ 29, 30, ] 35 [ 37 ]
            [ 29, ] 30 [  ]
            [10, 15, 18, 22, 23, 29, 30, 35, 37]
         */


        int[] values3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(values3));
        quickSort(values3);
        System.out.println(Arrays.toString(values3));
        /*
            [1, 2, 3, 4, 5, 6, 7, 8, 9]
            [ 1, 2, 3, 4, 5, 6, 7, 8, ] 9 [  ]
            [ 1, 2, 3, 4, 5, 6, 7, ] 8 [  ]
            [ 1, 2, 3, 4, 5, 6, ] 7 [  ]
            [ 1, 2, 3, 4, 5, ] 6 [  ]
            [ 1, 2, 3, 4, ] 5 [  ]
            [ 1, 2, 3, ] 4 [  ]
            [ 1, 2, ] 3 [  ]
            [ 1, ] 2 [  ]
            [1, 2, 3, 4, 5, 6, 7, 8, 9]
         */
    }

    public static void quickSort(int[] values) {
        quickSort(values, 0, values.length - 1);
    }

    public static void quickSort(int[] values, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int pivotValue = values[rightIndex];

            int i = leftIndex;
            int j = rightIndex - 1;

            while (true) {
                while (i < rightIndex && values[i] <= pivotValue) {
                    i++;
                }

                while (j > i && values[j] >= pivotValue) {
                    j--;
                }

                if (i >= j) {
                    break;
                }

                swap(values, i, j);
            }

            swap(values, i, rightIndex);

            printArray(values, leftIndex, i, rightIndex);

            quickSort(values, leftIndex, i - 1);
            quickSort(values, i + 1, rightIndex);
        }
    }

    private static void swap(int[] values, int index1, int index2) {
        int tmp = values[index1];
        values[index1] = values[index2];
        values[index2] = tmp;
    }

    private static void printArray(int[] values, int left, int pivot, int right) {
        System.out.print("[ ");

        for (int i = left; i < pivot; i++) {
            System.out.print(values[i] + ", ");
        }

        System.out.print("] " + values[pivot] + " [ ");

        for (int i = pivot + 1; i <= right; i++) {
            System.out.print(values[i]);

            if (i < right) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }

}
