package week5;
import java.util.Arrays;

public class Rekursion {

    public static void main(String[] args) {
        stepSum(new int[]{2, 4, 1, 3, 7});
        stepSumRightAlign(new int[]{2, 4, 1, 3, 7});
    }

    public static void stepSum(int[] numbers) {
        if (numbers.length <= 1) {
            System.out.println(Arrays.toString(numbers));
            return;
        }

        int[] addedNums = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            addedNums[i] = numbers[i] + numbers[i + 1];
        }

        stepSum(addedNums);

        System.out.println(Arrays.toString(numbers));
    }

    public static void stepSumRightAlign(int[] numbers) {
        stepSumRightAlign(numbers, 0);
    }

    private static void stepSumRightAlign(int[] numbers, int spaces) {

        if (numbers.length <= 1) {
            System.out.println(" ".repeat(spaces) + Arrays.toString(numbers));
            return;
        }

        int[] addedNums = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            addedNums[i] = numbers[i] + numbers[i + 1];
        }

        stepSumRightAlign(addedNums, spaces + 2);

        System.out.println(" ".repeat(spaces) + Arrays.toString(numbers));
    }

}
