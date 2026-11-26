package week6.auto;

public class Auto {

    private Tire[] tires;
    private Motor motor;
    private Trunk trunk;
    private int maxSpeed;
    private int amountSeats;
    private int amountDoors;

    public Auto() {

    }

    public Auto(Tire[] tires, Motor motor, Trunk trunk, int maxSpeed, int amountSeats, int amountDoors) {
        this.tires = tires;
        this.motor = motor;
        this.trunk = trunk;
        this.maxSpeed = maxSpeed;
        this.amountSeats = amountSeats;
        this.amountDoors = amountDoors;
    }



    public boolean isFasterThan(Auto other) {
        if (maxSpeed > other.getMaxSpeed()) {
            return true;
        }

        return false;
    }

    public void replaceTire(int index, Tire newTire) {
        Tire[] newTires = new Tire[tires.length];

        for (int i = 0; i < tires.length; i++) {
            if (i == index) {
                newTires[i] = newTire;
            } else {
                newTires[i] = tires[i];
            }
        }

        tires = newTires;
    }



    public Tire[] getTires() {
        return tires;
    }

    public Motor getMotor() {
        return motor;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAmountSeats() {
        return amountSeats;
    }


    public int getAmountDoors() {
        return amountDoors;
    }
}
