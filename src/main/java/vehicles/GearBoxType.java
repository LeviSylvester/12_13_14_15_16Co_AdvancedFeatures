package vehicles;

//task29: b) Create an enum with constants describing possible ger box types and having a description (in Vehicles)
public enum GearBoxType implements VehicleEnums {
    MANUAL("Manual"),
    AUTOMATIC("Automatic");
    private final String description;
    GearBoxType(String description) {
//        this.name() vedem unde ne duce daca avem nevoie la generice
//                this.ordinal()
        this.description = description;
    }
    @Override
    public String getDescription() {
        return description;
    }



    //c) see at \course\generics\Utils.java
}


