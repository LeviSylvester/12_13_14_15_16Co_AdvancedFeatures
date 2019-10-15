package course.io;

import java.io.*;

public class TypeApp {

    public static void main(String[] args) throws IOException {
        //ar trebui sa verificam ca nu e gol sau sa prindem indexoutofboundexception
        String filename = args[0];
        typeFile(filename);

    }

    static void typeFile(String filename) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            String line = "";
            while (line != null) {
                line = fileReader.readLine();
                System.out.println(line);
            }
        }
    }
}
////            int ch = 0;
//            int ch; //dupa setarea args nu mai avem nevoie de initializare
//            while ((ch = fileReader.read()) != -1) {
////            while (ch != -1) {
////                ch = fileReader.read();
//                System.out.print((char) ch);
////            }
//            }
//        }
//    }
//}


//    static void typeFile(String filename) throws IOException {
//        try (Reader fileReader = new FileReader(filename)) {
////            int ch = 0;
//            int ch; //dupa setarea args nu mai avem nevoie de initializare
//            while ((ch = fileReader.read()) != -1) {
////            while (ch != -1) {
////                ch = fileReader.read();
//                System.out.print((char) ch);
////            }
//            }
//        }
//    }
//}


//    }