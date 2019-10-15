package course.generics;

import com.google.common.collect.ImmutableList;
import vehicles.Car;
import vehicles.Vehicle;
import vehicles.VehicleEnums;

import java.util.List;

public class Utils {

//task26: Create a method which finds the maximum speed values from a list of Vehicles
//generics -> Utils (constructor privat)
    private Utils() {

    }

    public static void main(String[] args) {
//        List<Vehicle> vehicles = new ArrayList<>();
        //add add
        List<Vehicle> vehicles = ImmutableList.<Vehicle>builder()
                .add(new Vehicle(10))
                .add(new Vehicle(100))
                .add(new Vehicle(200))
                .build();

        List<Car> cars = ImmutableList.<Car>builder()
                .add(new Car(10))
                .add(new Car(100))
                .add(new Car(200))
                .build();

        System.out.println(getMaxSpeed(vehicles));
        System.out.println(getMaxSpeed(cars));
//        System.out.println(getMaxSpeed(drivables));
    }

//    static int getMaxSpeed(List<Vehicle> drivables) {
//        int maxSpeed = drivables.get(0).getMaxSpeed();
//        for (Vehicle drivable : drivables) {
//            if (drivable.getMaxSpeed() > maxSpeed) {
//                maxSpeed = drivable.getMaxSpeed();
//            }
//        }
//        return maxSpeed;
//    }

    //nu se poate method overload pentru ca la runtime dispar tipurile <acestea>
//    static int getMaxSpeed(List<Car> drivables) {
//        int maxSpeed = drivables.get(0).getMaxSpeed();
//        for (Vehicle drivable : drivables) {
//            if (drivable.getMaxSpeed() > maxSpeed) {
//                maxSpeed = drivable.getMaxSpeed();
//            }
//        }
//        return maxSpeed;
//    }
    //al doilea T respecta ce este declarat la primul T

    static <T extends Vehicle> int getMaxSpeed(List<T> drivables) {
        int maxSpeed = 0;
        for (T drivable : drivables) {
            if (drivable.getMaxSpeed() > maxSpeed) {
                maxSpeed = drivable.getMaxSpeed();
            }
        }
        return maxSpeed;
    }

}
