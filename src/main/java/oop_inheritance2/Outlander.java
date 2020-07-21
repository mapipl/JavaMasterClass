package oop_inheritance2;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocoty = getCurrentVelocity() + rate;
        if (newVelocoty == 0) {
            stop();
            changeGear(1);
        } else if (newVelocoty > 0 && newVelocoty <= 10) {
            changeGear(1);
        } else if (newVelocoty > 10 && newVelocoty <= 20) {
            changeGear(2);
        } else if (newVelocoty > 20 && newVelocoty <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocoty > 0) {
            changeVelocity(newVelocoty, getCurrentDirection());
        }

    }
}

