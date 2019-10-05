package course.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class App {
    static {
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "INFO");
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(/*stringText*/App.class);

    public static void main(String[] args) /*throws IOException*/ {
//        double result = 5/0;
        try {
            System.out.println(division(1, 2));
            System.out.println(division(1, 0));
        } catch (IOException e) {
//            System.out.println("catch");
            LOGGER.error("A fost prinsa exceptia cu mesajul '{}'.", e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    static double division(int a, int b) throws IOException {

        try {
            LOGGER./*info*/debug("Urmeaza impartirea lui {} la {}", a, b); //trace este mai jos decat debug
            return a / b;
        } catch (ArithmeticException e) {
            throw new IOException("Impartire la 0", e);
        } finally {

        }
    }
}
