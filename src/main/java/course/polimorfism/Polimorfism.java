package course.polimorfism;

//ctrl+f12...
public class Polimorfism {
    //1.Static - compile-time - method overloading
    //2.Dinamic - run-time - method overriding

//    public static void main(String[] args) {

    public static Double sum(String numbers, String separator) {
//            String stringNumbers = "1, 2, 3, 4, 5, 6";
        String[] values = numbers.split(separator);
//            System.out.println(numbers.toString());
        double sum = 0;
        for (String nr : values) {
            sum += Double.parseDouble(nr); //ctrl+p arata ce parametri asteapta
        }
        return sum;
    }

}

