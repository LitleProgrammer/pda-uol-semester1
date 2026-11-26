package week6.stardb;

public class Star {

    private String name;
    private String id;
    private double distance;
    private double apparentMagnitude;
    private String type;

    public Star(String name, String id, double distance, double apparentMagnitude, String type) {
        this.name = name;
        this.id = id;
        this.distance = distance;
        this.apparentMagnitude = apparentMagnitude;
        this.type = type;
    }

    public Star(String name, String id) {
        this.name = name;
        this.id = id;
    }



    public boolean isCloseThan(Star other) {
        if (distance < other.getDistance()) {
            return true;
        }

        return false;
    }

    public double getDistanceInPC() {
        return distance / 3.26;
    }

    public double getAbsoluteMagnitude() {
        return apparentMagnitude - 5 * Math.log10(getDistanceInPC()) + 5;
    }

    public boolean checkType() {
        switch (type) {
            case "Brown dwarf":
                if (apparentMagnitude < 20 && apparentMagnitude > 15) {
                    return true;
                }
                return false;

            case "Red dwarf", "White dwarf":
                if (apparentMagnitude < 15 && apparentMagnitude > 10) {
                    return true;
                }
                return false;

            case "Subdwarf":
                if (apparentMagnitude < 10 && apparentMagnitude > 5) {
                    return true;
                }
                return false;

            case "Main sequence", "Subgiant":
                if (apparentMagnitude < 5 && apparentMagnitude > 0) {
                    return true;
                }
                return false;

            case "Giant", "Bright giant":
                if (apparentMagnitude < 0 && apparentMagnitude > -5) {
                    return true;
                }
                return false;

            case "Blue supergiant", "Yellow supergiant", "Red supergiant", "Hypergiant":
                if (apparentMagnitude < -5 && apparentMagnitude > -10) {
                    return true;
                }
                return false;

            default:
                return false;
        }
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getApparentMagnitude() {
        return apparentMagnitude;
    }

    public void setApparentMagnitude(double apparentMagnitude) {
        this.apparentMagnitude = apparentMagnitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
