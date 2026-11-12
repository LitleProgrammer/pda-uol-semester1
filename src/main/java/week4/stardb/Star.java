package week4.stardb;

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
