package course.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.exit;

public class ReadPrintApp {
    public static void main(String[] args) {
        //citire pana cand caracterul este space
//        try {
//            int c = 32;
//            do {
//                if (c !=10) {//cand apasam enter, sa nu mai afiseze
//                    System.out.println((char) c);
//
//                }
//                if (c !=10) {
//                    System.out.println("Introduceti un caracter:");
//                }
//                c = System.in.read();
//            } while (c!=32); //32 codul ascii pt space
//        } catch(IOException e) {
//            System.err.println("Exceptie la citire.");
//            exit(-1);
//        }

        //citire pana cand caracterul este space si sa salveze intr-un fisier
        PrintStream defaultOutput = System.out;
//        Scanner scanner = new Scanner(System.in);
        try {
            PrintStream fileOutput = new PrintStream("file.txt"); //se poate si path, daca lasam asa, adauga in proiect
            int c = 32;
            do {
                if (c !=10) {//cand apasam enter, sa nu mai afiseze
                    System.setOut(defaultOutput);
                    System.out.println("Introduceti un caracter:");
//                    System.out.println((char) c);
                }
                c = System.in.read();
                if (c !=10) {
                    System.setOut(fileOutput);
                    System.out.println("Ati introdus " + (char) c + ". Codul ASCII:" + c);
                }
            } while (c!=32); //32 codul ascii pt space
        } catch(IOException e) {
            System.err.println("Exceptie la citire.");
            exit(-1); //sa stim ca a fost o eroare, sa nu fie exit with code 0
        }

    }


}
