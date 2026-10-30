package week2;

public class Arrays {
    public static void main(String [] args) {
        Arrays arrays = new Arrays();
        int a = (int) arrays.circleArea(2);
        System.out.println("Radius: " + a);

        arrays.stringToUnicode("Test");

        System.out.println("Array summe: " + arrays.sumArray(new int[] {1, 2, 3, 4, 5}));

        System.out.println("Array Durchschnitt: " + arrays.average(new double[] {0.3, 0.8, 3.6, 1.8, 35.92, -6.3}));

        arrays.selectEven(new int[] {1, 2, 3, 4, 5});
    }

    //Gibt die Fläche eines Kreises mit dem Radius r zurück
    public double circleArea(int r) {
        return r * r * Math.PI;
    }

    //Gibt für den String s für jeden Buchstaben den Unicode aus
    public void stringToUnicode(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char buchstabe = chars[i];
            //Wandelt Buchstabe in Unicode
            int code = buchstabe;
            System.out.println(code);
        }
    }

    //Bildet die Summe aller Zahlen in einem Array
    public int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            //Addiert die aktuell ausgewählte Zahl zur Summe
            sum = sum + a[i];
        }
        return sum;
    }

    //FIndet den Durchschnitt aller Zahlen in einem Array
    public double average(double[] arr) {
        //Summiert zuerst die Zahlen
        double sum = 0;
        for (double d : arr) {
            sum = sum + d;
        }

        //Teilt die Summe durch die Länge um den Durchschnitt zu ermitteln
        double avg = sum / arr.length;
        return avg;
    }

    //Hängt 2 Arrays aneinander
    public int[] combine(int[] numbers1, int[] numbers2) {
        int[] combined = new int[numbers1.length + numbers2.length];

        //Packt alle Zahlen aus array1 in combined
        for (int i = 0; i < numbers1.length; i++) {
            combined[i] = numbers1[i];
        }

        //Packt alle Zahlen aus array2 ans Ende von combined
        for (int i = 0; i < numbers2.length; i++) {
            combined[numbers1.length + i] = numbers2[i];
        }

        return  combined;
    }

    //Wählt alle geraden Zahlen aus einem Array aus
    public int[] selectEven(int[] numbers) {
        //Zuerst wird ermittelt, wie viele gerade Zahlen in dem Array sind um die Länge des result arrays zu bestimmen.
        int amountEven = 0;
        for (int number : numbers) {
            //Prüft ob die Zahl gerade ist
            if (number % 2 == 0){
                amountEven++;
            }
        }

        System.out.println("Amount of even numbers: " + amountEven);

        //Erstellt ein array mit der zuvor ermittelten Länge
        int[] evenNumbers = new int[amountEven];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            //Prüft ob die Zahl gerade ist und fügt sie in das evenNumbers array
            if (numbers[i] % 2 == 0) {
               evenNumbers[index] = numbers[i];
               index++;
            }
        }

        System.out.println("Even numbers: ");
        printArray(evenNumbers);

        return evenNumbers;
    }

    //Helfermethode um ein Array in der Konsole auszugeben
    public void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
