package course.inheritance.vehicles;

public class Car extends Vehicle {
    private boolean isConvertible = false;
    private double maxSpeed;

    public Car(int maxSpeed, boolean isConvertible) {
        super(maxSpeed);
        this.isConvertible = isConvertible;
    }

    public Car(int maxSpeed) {
//        this(maxSpeed, false);
        super(maxSpeed); //asa este apelat state-ul din superclasa
    }

    public boolean getIsConvertible() {
        this.maxSpeed = 0;

        return isConvertible;
    }
}