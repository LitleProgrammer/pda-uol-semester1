package week6.stardb;

public class StarsDatabase {
    private Star[] stars = new Star[] {
            new Star("Sirius", "TYC 5949-2777-1", 8.6, -1.46, "Main sequence"),
            new Star("Alpha Centauri", "TYC 9007-5849-1", 4.37, -0.27, "Main sequence"),
            new Star("Rigel", "TYC 5331-1752-1", 860, 0.13, "Blue supergiant"),
            new Star("Almaaz", "TYC 2907-1275-1", 2000, 2.92, "Yellow supergiant"),
            new Star("Luhman 16", "WISE J1049-5319A", 6.589, 14.94, "Brown dwarf")
    };

    public static void main(String[] args) {

    }

    public void add(Star star) {
        Star[] newStars = new Star[stars.length + 1];

        for (int i = 0; i < stars.length; i++) {
            newStars[i] = stars[i];
        }

        newStars[stars.length] = star;

        stars = newStars;
    }

    public void remove(int index) {
        Star[] newStars = new Star[stars.length - 1];

        int j = 0;
        for (int i = 0; i < stars.length; i++) {
            if (i != index) {
                newStars[j] = stars[i];
                j++;
            }
        }
    }

    //Gibt den Stern oder null zurück
    public Star get(int index) {
        if (stars.length > index) {
            return  stars[index];
        }

        return null;
    }

    public int size() {
        return stars.length;
    }

    //Gibt den gefundenen Stern oder null zurück
    public Star find(String id) {
        for(Star star : stars) {
            if (star.getId().equals(id)) {
                return star;
            }
        }

        return null;
    }

    public Star[] getMagnitudeRange(double low, double high) {
        int starsAmount = 0;
        for (int i = 0; i < stars.length; i++) {
            if (low >= stars[i].getApparentMagnitude() && stars[i].getApparentMagnitude() <= high) {
                starsAmount++;
            }
        }

        Star[] foundStars = new Star[starsAmount];
        int j = 0;
        for (int i = 0; i < stars.length; i++) {
            if (low >= stars[i].getApparentMagnitude() && stars[i].getApparentMagnitude() <= high) {
                foundStars[j] = stars[i];
                j++;
            }
        }

        return foundStars;
    }
}
