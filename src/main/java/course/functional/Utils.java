package course.functional;

import com.google.common.collect.ImmutableList;
import vehicles.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Utils<E extends Enum<E> & VehicleEnums> { //ACESTA


    //un exemplu de diferenta intre definire in clasa sau in metoda generica:
    /*static */void typeGenericTypeName(E instance) { //IN METODELE NESTATICE II VIZIBIL (IN STATICE NU)
        System.out.println(instance.getClass());
    }
    //DEFAPT DACA POTI, SA LE EVITI (genericele) SA NU FACI PROGRAMARE CONCURENTA (foarte greu debugging-ul)

    /*definirea aceasta <>inainte de metoda main este pentru task-ul 32b*/
    public static <E extends Enum<E> & VehicleEnums, T extends Vehicle> void main(String[] args) throws ClassNotFoundException {//practic noi in afara de main ar trebui s avem o alta metode cu toate acestea si noi doar sa le rulam in main
//Task 31b) Call the method by passing a random Integer generator and print the result on the screen.
        /*random si supplier e si pentru taskul 31b si pt 32b*/
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(EngineType.values().length);
        //for task 31b)
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));
        System.out.println(generateEngineType(supplier));

//Task 32b)call the method by passing a list of all the enum values defined in EngineType & GearBoxType
//and a consumer which prints on the console the description of such an enum element
        Consumer<E> vehicleEnumConsumer = (enumInstance) ->
                System.out.println(enumInstance.getDescription());//daca nu definim inainte de main in <>, getdescription n-o sa se vada

        List<E> enumValues = new ArrayList<>();
        enumValues.addAll(Arrays.asList((E[]) GearBoxType.values()));
        enumValues.addAll(Arrays.asList((E[]) EngineType.values()));
        process(vehicleEnumConsumer, enumValues);


        //Task33
        BiFunction<String, Class<E>, E> myBiFunction = (description, enumType) -> Utils.mapBasedOnDescription(description, enumType);
        System.out.println(useFunction(myBiFunction, "Diesel", (Class<E>) Class.forName("vehicles.EngineType")));//
//    useFunction(myBiFunction, "Diesel", (Class<E>)(EngineType.class));//


        //task 34: create a predicate returning a true if the maxSpeed of a Vehicle/Car is greater than 150
        //use it to select from a list only those instances which meet this criterion
        Predicate<T> isDangerous = (vehicle) -> vehicle.getMaxSpeed() > 150;

        //din libraria guava immutable list:
//        List<Vehicle> vehicles = ImmutableList.<Vehicle>builder()

//        List<? extends Vehicle> vehicles = new ArrayList<>();
        List<T> vehicles = new ArrayList<>(); //fiindca e definit in main, ne pune sa facem cast de tip T
        vehicles.add((T)new Car(1)); //n-ar trebui cast......................trebuie sa se concretizeze undeva??
        vehicles.add((T)new Vehicle(200));//merge, filtreaza pe cel cu viteza 200

//        System.out.println(getSafeVehicles((List<T>)vehicles, isDangerous));
        System.out.println(getSafeVehicles(vehicles, isDangerous));


        //task 36:
        process(System.out::println, enumValues);
        System.out.println(useOtherFunction(Integer::parseInt, "9"));
        useOtherFunction(Integer::parseInt, "e39");
    }
    //for task36
    static Integer useOtherFunction(Function<String, Integer> integerParser, String input) {
        return integerParser.apply(input); //or use a more complicated :) method as created for regex lesson
    }

    //Task 31a) Create a method which uses an Integer supplier to generate random EngineType values.
    static EngineType generateEngineType(Supplier<Integer> supplier) {
        Integer ordinalValue = supplier.get();
        for (EngineType engineType : EngineType.values()) {
            if (engineType.ordinal() == ordinalValue) {
                return engineType;
            }
        }
        return null;
    }
//Task 32:a)
//sa cream o metoda care foloseste un consumer care sa proceseze o lista de valori (toate elementele din lista)
//lista de valori care trebuie procesata poate sa fie oricare din enumurile definite la engine type si gearbox type


    //incepem prin a face exact cum e formulat, scriem sintaxa
    //<trebuie sa definim, sa botezam tipul generic>
    // de ex. la Map<K,V> vezi ca K si V este definit deja prin toata clasa (interfata?)
    //Consumer (metoda accept) are in el metoda pe care trebuie sa o faca (prin consumer transmitem comportament, metoda)
    //trebuie sa iteram prin enumuri sa proceseze one by one

    static <E extends Enum<E> & VehicleEnums> void process(Consumer<E> processor, List<E> valuesToBeProcessed) {
        for (E valueToBeProcessed : valuesToBeProcessed) {
            processor.accept(valueToBeProcessed);
        }
    }

    //deci avem o metoda la care daca dam comportamentul(consumer processor) si conditia(values to be processed), cand se intalneste, o sa faca lucrul acela


    //task 33: create a use function method (in function - utils) which could take as parameter the implementation you have provided for task29c (generics - utils)and the parameters needed to call it
    static <E extends Enum<E> & VehicleEnums> E useFunction(BiFunction<String, Class<E>, E> enumMapFunction,
                                                            String description,
                                                            Class<E> enumType) { //here we can apply method reference
//        enumMapFunction.apply("Diesel", (Class<E>) EngineType.class);
        return enumMapFunction.apply(description, enumType);
//        enumMapFunction.apply(description, enumType);
    }

    //task 34: create a predicate returning a true if the maxSpeed of a Vehicle/Car is greater than 150
    //use it to select from a list only those instances which meet this criterion
    //method:
    static <T extends Vehicle> List<T> getSafeVehicles(List<T> allVehicles, Predicate<T> isDangerous) {
        List<T> safeVehicles = new ArrayList<>();
        for (T vehicle : allVehicles) {
            if (!isDangerous.test(vehicle)) {
                safeVehicles.add(vehicle);
            }
        }
        return safeVehicles;
    }


    //29c) (copied from generics/utils cause needed and not seen)
    static <E extends Enum<E> & VehicleEnums> E mapBasedOnDescription(String description, Class<E> enumType) {
        for (E type : enumType.getEnumConstants()) {
            if (type.getDescription().equalsIgnoreCase(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException(String.format("Cannot map '%s' to any known enum", description));
    }
}

