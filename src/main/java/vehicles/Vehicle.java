package vehicles;

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


//    rewrite (from photo), what you wrote initially
    protected int maxSpeed;
    protected int currentSpeed;

    public Vehicle() {
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void increaseSpeed(){
        currentSpeed++;
        if(currentSpeed>maxSpeed){
            throw new VehicleCrashedException("Vehicle crashed exception");
        }
    }

    public class VehicleCrashedException extends RuntimeException {
        public VehicleCrashedException(String message) {
            super(message);
        }
    }
}
