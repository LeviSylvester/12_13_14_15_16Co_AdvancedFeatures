package course.concurrency;

public class CoffeeTakerThread extends Thread {
    private CoffeeMachine coffeeMachine;

    public CoffeeTakerThread(CoffeeMachine coffeeMachine) {
        super();
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        coffeeMachine.orderCoffee();
    }
}
