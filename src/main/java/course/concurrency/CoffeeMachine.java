package course.concurrency;

public class CoffeeMachine {
    private int coffeeCapacity;

    public CoffeeMachine(int coffeeCapacity) {
        this.coffeeCapacity = coffeeCapacity;
    }

    public synchronized void orderCoffee() {
        if(coffeeCapacity > 0) {
            System.out.println("Delivering a coffee");
            coffeeCapacity--;
            System.out.println("Coffees left: " + coffeeCapacity);
        } else {
            System.out.println("Sorry...no more coffee for you...");
        }
    }
}
