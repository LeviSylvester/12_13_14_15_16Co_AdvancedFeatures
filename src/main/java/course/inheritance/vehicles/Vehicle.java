package course.inheritance.vehicles;

public class Vehicle {
//    private final double MAX_SPEED = 0;
//
//    private Vehicle(double maxSpeed){
//        this.MAX_SPEED = maxSpeed; //da eroare intentionata, sa ne gandim de ce :)
//    }
//
//    public double getMaxSpeed() {
//        return MAX_SPEED;
//    }


//    rewrite (from foto), what you wrote initially
    private int maxSpeed;

    public Vehicle() {
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
