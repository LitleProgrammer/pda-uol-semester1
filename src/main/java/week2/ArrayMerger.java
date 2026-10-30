package week2;

public class ArrayMerger {
    public static void main(String[] args) {
        int [] array1 = {1, 3, 3, 5, 6, 9};
        int [] array2 = {2, 3, 5, 7, 8, 9, 10};

        // Ergebnis-Array mit der Länge beider Arrays erstellen
        int [] result = new int[array1.length + array2.length];

        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        //Solange beide Arrays noch Elemente enthalten
        while (pos1 < array1.length && pos2 < array2.length) {

            //Kleineres Element auswählen
            if (array1[pos1] <= array2[pos2]) {
                result[pos3] = array1[pos1];
                pos1++;
            } else {
                result[pos3] = array2[pos2];
                pos2++;
            }

            //Zur nächsten freien Position im result Array
            pos3++;
        }

        //Alle restlichen Zahlen aus Array1 in result übertragen
        while (pos1 < array1.length) {
            result[pos3] = array1[pos1];
            pos1++;
            pos3++;
        }

        //Alle restlichen Zahlen aus Array2 in result übertragen
        while (pos2 < array2.length) {
            result[pos3] = array2[pos2];
            pos2++;
            pos3++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
        System.out.println();
    }
}
