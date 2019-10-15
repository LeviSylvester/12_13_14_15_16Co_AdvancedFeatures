package course.functional;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilsReloaded {
    public static void main(String[] args) {
        List<Vehicle> vs = new ArrayList<>();
        vs.add(new Vehicle(1));
        vs.add(new Vehicle(300));
        vs.add(new Vehicle(250));
        vs.add(new Vehicle(50));

        Stream<String> testStream = vs.stream()
                .map(vehicle -> {
                    String strValue = vehicle.toString();
                    System.out.println(strValue);
                    return strValue;
//                    .map(Vehicle::toString)
                });

        System.out.println("Dupa operatii intermediare");

        testStream.collect(Collectors.toList());

        List<String> result = testStream.collect(Collectors.toList());//collectors e o operatie terminala
        //dupa operatie terminala stream-ul se inchide
    }
}
