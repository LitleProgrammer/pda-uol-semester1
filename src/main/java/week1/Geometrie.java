package week1;

public class Geometrie {
    public static void main(String[] args) {
        int a = 15;
        int b = 24;

        int area = area(a, b);
        System.out.println("Fläche: " + area);

        int circumference = circumference(a, b);
        System.out.println("Umfang: " + circumference);

        int fit = fit(a, b);
        System.out.println("Anzahl: " + fit);
    }

    public static int area(int a, int b) {
        int area = a * b;

        return area;
    }

    public static int circumference(int a, int b) {
        int circumference = 2 * (a + b);

        return circumference;
    }

    public static int fit(int a, int b) {
        int x = 5;
        int y = 4;

        int counter = 0;

        for (int i = 0; i < a / x; i++) {
            for (int j = 0; j < b / y; j++) {
                counter++;
            }
        }

        return counter;
    }
}
