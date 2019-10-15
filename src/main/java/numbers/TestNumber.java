package numbers;

public class TestNumber {//structuri de date: array, list, linkedlist, doublelinkedlist, set, map, tree...

    public static void main(String[] args) {
        Number[] numbers = new Number[]{
                new Integer(10),
                new Double(3.14),
                new Long(4L)//,
//                "test"
        };
        System.out.println(sum(numbers));
    }

    public static Double sum(Number[] numbers) {
        double sum = 0;
//            for (int i = 0; i < numbers.length; i++) {
//                sum +=Double.parseDouble((numbers[i].toString()));
//            }
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
//        Number[] numbers = {127, 2147483647, 3.40282347F, 1.79769313486231570D};//byte, int, float, double
}

