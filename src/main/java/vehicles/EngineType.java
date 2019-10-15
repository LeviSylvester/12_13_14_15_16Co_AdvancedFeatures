package vehicles;

import java.util.Random;
import java.util.function.Supplier;

//task29: a) Create an enum with constants describing possible engine types and having a description (in Vehicles)
public enum EngineType implements VehicleEnums {
    DIESEL("Diesel"),
    PETROL("Petrol"),
    HYBRID("Hybrid"),
    ELECTRIC("Electric");
    private final String description;
    EngineType(String description) {
        this.description = description;
    }
    @Override
    public String getDescription() {
        return description;
    }


}
