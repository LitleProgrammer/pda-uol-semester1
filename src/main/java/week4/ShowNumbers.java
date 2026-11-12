package week4;

public class ShowNumbers {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 2};
        int index = 0;

        for (int date : data) {
            System.out.println(date);

            if (index < data.length - 1) {
                System.out.println(", ");
            }

            index++;
        }

        System.out.println();
    }
}
