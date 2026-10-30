package week1;

public class Alter {
    public static void main(String[] args) {
        int ageAlice = 80;
        int ageBob = 80;

        if (ageAlice < ageBob) {
            System.out.println("Alice ist " + ageAlice * 365 + " Tage alt");
        } else {
            System.out.println("Bob ist " + ageBob * 365 + " Tage alt");
        }
    }
}
