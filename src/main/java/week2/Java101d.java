package week2;

public class Java101d {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        System.out.println("Startwert a =" + a);
    
        while (a % b == 0) {
            a = a + a;
            System.out.println("a =" + a);
        }
    
    }
}