package week1;

public class Tage {
    public static void main(String[] args) {
            int day = 42;

            while (day < 0) {
                day = day + 7;
            }

            while (day >= 7) {
                day = day -7;
            }

            switch (day) {
                case 0:
                    System.out.println("Montag");
                    break;
                case 1:
                    System.out.println("Dienstag");
                    break;
                case 2:
                    System.out.println("Mittwoch");
                    break;
                case 3:
                    System.out.println("Donnerstag");
                    break;
                case 4:
                    System.out.println("Freitag");
                    break;
                case 5 :
                    System.out.println("Samstag");
                    break;
                case 6:
                    System.out.println("Sonntag");
                    break;
                default:
                    System.out.println("Fehler");
                    break;
            }
    }
}
