package week2;

public class Java101e {
    public static void main(String[] args) {
        int a = 5;
        long ergebnis = 1;

        for (int i = 2; i <= a; i++) {
            ergebnis = ergebnis * i;
        }

        System.out.println(a + "! = " + ergebnis);
    }
}
