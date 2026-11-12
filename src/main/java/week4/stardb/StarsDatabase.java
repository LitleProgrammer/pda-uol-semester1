package week4.stardb;

public class StarsDatabase {

    public static void main(String[] args) {
        Star[] stars = new Star[] {
                new Star("Sirius", "TYC 5949-2777-1", 8.6, -1.46, "Main sequence"),
                new Star("Alpha Centauri", "TYC 9007-5849-1", 4.37, -0.27, "Main sequence"),
                new Star("Rigel", "TYC 5331-1752-1", 860, 0.13, "Blue supergiant"),
                new Star("Almaaz", "TYC 2907-1275-1", 2000, 2.92, "Yellow supergiant"),
                new Star("Luhman 16", "WISE J1049-5319A", 6.589, 14.94, "Brown dwarf")
        };

        //Suche nach der ID TYC 5331-1752-1 und gib den Namen zurück
        System.out.println(getStarNameByID(stars, "TYC 5331-1752-1"));

        printStarsFurther10LJ(stars);
    }

    public static String getStarNameByID(Star[] stars, String id) {
        for(Star star : stars) {
            if (star.getId().equals(id)) {
                return star.getName();
            }
        }

        //Kein stern mit der ID gefunden.
        return "Kein Stern mit der ID gefunden";
    }

    public static void printStarsFurther10LJ(Star[] stars) {
        for (Star star : stars) {
            if(star.getDistance() < 10) {
                System.out.println(star.getName());
            }
        }
    }

}
