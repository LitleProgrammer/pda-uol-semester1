package week3;

public class ArrayCalculations {
    public static void main(String[] args) {

    }

    public double circleArea(int r) {
        return r * r * Math.PI;
    }

    public int calculator(int num1, int num2, char symbol) {
        switch (symbol) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }

    public int sumArrays(int[] array1, int[] array2) {
        int sum = 0;

        for (int i : array1) {
            sum += i;
        }

        for (int i : array2) {
            sum += i;
        }

        return sum;
    }

    public static int calculate(int[][] values) {
        // Array durchlaufen und prüfen, ob alle Werte zwischen 0 und 9 liegen
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {

                // Falls ein Wert kleiner als 0 oder größer als 9 ist
                if (values[i][j] < 0 || values[i][j] > 9) {
                    return -1;
                }
            }
        }

        // Ergebnis berechnen
        int sum = 0;

        // Für jede mögliche Zahl von 0 bis 9
        for (int i = 0; i <= 9; i++) {
            int count = 0;

            // Zählen, wie oft die Zahl im Array vorkommt
            for (int j = 0; j < values.length; j++) {
                for (int k = 0; k < values[j].length; k++) {
                    if (values[j][k] == i) {
                        count++;
                    }
                }
            }

            // Anzahl mit (Zahl + 1) multiplizieren
            sum += count * (i + 1);
        }

        return sum;
    }

    public static int[] addArrays(int[] a, int[] b) {
        // Das Ergebnis muss so lang sein wie das längere Array
        int length = Math.max(a.length, b.length);

        // Neues Array für die Ergebnisse erstellen
        int[] result = new int[length];

        // Alle Positionen durchlaufen
        for (int i = 0; i < length; i++) {

            // Wert aus dem ersten Array holen, falls vorhanden
            int valueA = 0;
            if (i < a.length) {
                valueA = a[i];
            }

            // Wert aus dem zweiten Array holen, falls vorhanden
            int valueB = 0;
            if (i < b.length) {
                valueB = b[i];
            }

            // Beide Werte addieren
            result[i] = valueA + valueB;
        }

        return result;
    }

    public static int[][][] add3DArrays(int[][][] a, int[][][] b) {

        // Ergebnis hat so viele Ebenen wie das längere Array
        int length = Math.max(a.length, b.length);
        int[][][] result = new int[length][][];

        // Alle Ebenen durchlaufen
        for (int i = 0; i < length; i++) {

            // Falls beide Arrays an dieser Stelle eine Ebene haben
            if (i < a.length && i < b.length) {

                // Zweidimensionale Arrays addieren
                result[i] = add2DArrays(a[i], b[i]);

            } else if (i < a.length) {

                // Falls nur a eine Ebene hat, übernehmen wir diese
                result[i] = a[i];

            } else {

                // Falls nur b eine Ebene hat, übernehmen wir diese
                result[i] = b[i];
            }
        }

        return result;
    }

    public static int[][] add2DArrays(int[][] a, int[][] b) {

        // Ergebnis hat so viele Zeilen wie das längere Array
        int length = Math.max(a.length, b.length);
        int[][] result = new int[length][];

        // Alle Zeilen durchlaufen
        for (int i = 0; i < length; i++) {

            if (i < a.length && i < b.length) {

                // Eindimensionale Arrays mit Methode e) addieren
                result[i] = addArrays(a[i], b[i]);

            } else if (i < a.length) {

                // Falls nur a eine Zeile hat
                result[i] = a[i];

            } else {

                // Falls nur b eine Zeile hat
                result[i] = b[i];
            }
        }

        return result;
    }
}
