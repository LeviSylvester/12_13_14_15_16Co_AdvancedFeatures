package course.enums;

import java.util.Arrays;
import java.util.Scanner;

public enum PrinterType /*implements ...*/ {
    DOT_MATRIX("Imprimanta matriceala", 100),
    INK_JET("Imprimanta cu cerneala", 500),
    LASER("Imprimanta laser", 2000),
    _3D("Imprimanta 3D", 0);

    private final String description; //best practice sa fie final la enum
//    public static Scanner scanner = new Scanner(System.in);

    private final int printCapacity; //in liste nu putem avea primitive, doar obiecte, deci daca folosim liste, atunci wrapper


    PrinterType(String description, int printCapacity) {
        this.description = description;
        this.printCapacity = printCapacity;
    }

    public String getDescription() {
        //this.ordinal() //returneaza un int
        //this.name() //returneaza name, nu poate sa fie suprascrisa
        return this.description;
    }

    public int getPrintCapacity() {
        return printCapacity;
    }

    //intrebat in consola alegeti imprimanta
    //o metoda pt clasa aceasta, sa returneze imprimanta dorita

//    public static char getOptionFromInput() {
//        return scanner.next().charAt(0);
//    }

//    public static void selectPrinter(PrinterType printer){
//        boolean cancel = false;
//        System.out.println("Select a) dotmatrix, b) inkjet, c) laser, d)_3D e) exit:");
//        while(!cancel){
//            switch(getOptionFromInput()){
//                case 'a':
//                    patient.setDisease(Clinic.scanner.next());
//                    break;
//                case 'b':
//                    patient.setPhoneNumber(Clinic.scanner.next());
//                    break;
//                case 'b':
//                    patient.setPhoneNumber(Clinic.scanner.next());
//                    break;
//                case 'c':
//                    cancel = true;
//                    break;
//                default:
//                    type("Invalid input, try again!");
//            }
//        }
//    }

    public static PrinterType matchPrinterType(String printerDesciption) {
        for (PrinterType printerType : PrinterType.values()) {
//            printerType.name()
//                    Arrays.asList(PrinterType.values()).contains()
            if (printerDesciption.equalsIgnoreCase(printerType.getDescription())) {
                return printerType;
            }
        }
        //            return null;
        throw new UnknownPrinter(String.format("Nu exista: '%s'", printerDesciption));
    }

    public PrinterType mapPrinterType(String printDescription) {
        return matchPrinterType(printDescription);
    }

    public static class UnknownPrinter extends RuntimeException {
        public UnknownPrinter(String message) {
            super(message);
        }
    }


}
