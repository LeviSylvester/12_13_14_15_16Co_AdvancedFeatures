package course.concurrency;

public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(1);
        CoffeeTakerThread t1 = new CoffeeTakerThread(coffeeMachine);
        CoffeeTakerThread t2 = new CoffeeTakerThread(coffeeMachine);
        t1.start();
        t2.start();
    }
}
