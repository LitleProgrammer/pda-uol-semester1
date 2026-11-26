package week6.auto;

public class Tire {

    private double profileDepth;
    private boolean flat;

    public Tire() {

    }

    public Tire(double profileDepth, boolean flat) {
        this.profileDepth = profileDepth;
        this.flat = flat;
    }

    public double getProfileDepth() {
        return profileDepth;
    }

    public void setProfileDepth(double profileDepth) {
        this.profileDepth = profileDepth;
    }

    public boolean isFlat() {
        return flat;
    }

    public void setFlat(boolean flat) {
        this.flat = flat;
    }
}
