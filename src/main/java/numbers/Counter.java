package numbers;

public class Counter {
    private int counter = 0;

    public Counter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

//public class Counter {
//private static int count;
//public Counter() {
//count++;
//}
//public static void printCount() {
//System.out.println("Number of instances created so far is: " + count);
//}
//public static void main(String []args) {
//Counter anInstance = new Counter();
//Counter.printCount();
//Counter anotherInstance = new Counter();
//Counter.printCount();
//}
//}
