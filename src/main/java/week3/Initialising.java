package week3;

public class Initialising {

    //Rückgabewert int[] statt void
    public static int[] init(int[] values, int initValue) {
        int[] result = new int[values.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = initValue;
        }

        return result; //Änderung: reutrn statt gleichsetzen
    }
}
