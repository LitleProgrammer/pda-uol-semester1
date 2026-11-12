package week4;

public class Initialisierung {

    public static void main(String[] args) {
        System.out.println(init()[1]);

    }

    public static int[] init() {
        //Geändert zu 0, da -1 auf die stelle -1 des arrays zugreifen will,welche nicht existiert
        int index = 0;
        int[] values = new int[4];

        values[index++] = Integer.MAX_VALUE - index;
        values[index++] = Integer.MAX_VALUE - index;
        values[index++] = Integer.MAX_VALUE - index;
        values[index++] = Integer.MAX_VALUE - index;

        return values;
    }
}
