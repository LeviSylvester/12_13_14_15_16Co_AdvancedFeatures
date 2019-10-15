package course.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseNumbersApp {
    //java treats file as txt or create directly filename with .txt but add as parameter as is
    public static void main(String[] args) throws IOException {
        System.out.println(parseIntegers(getFileComponents("corruptedNumbersFile", ";")));
    }

    static List<Integer> parseIntegers(List<String> components) {
        String corruptedNumberFormat = "[^0-9]*([-+]?[\\d]+)[\\D]*";
        List<Integer> parsedIntegers = new ArrayList<>();
        Pattern corruptedNumberPattern = Pattern.compile(corruptedNumberFormat);
        for (String corruptedNumber : components) {
            //(dewfe)([0-9]{5})
            Matcher matcher = corruptedNumberPattern.matcher(corruptedNumber);
            if (matcher.matches()) {
                String absoluteValue = matcher.group(1);
                int startPosition = corruptedNumber.indexOf(absoluteValue);
                if (startPosition > 0 && corruptedNumber.charAt(startPosition - 1) == '-') {
                    absoluteValue = "-" + absoluteValue;
                }
                parsedIntegers.add(Integer.parseInt(absoluteValue));
            }

//            if(matcher.matches()) {
//
//            }
        }
        return parsedIntegers;
    }

    static List<String> getFileComponents(String filename, String separator) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            String line;
            List<String> components = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                String[] lineComponents = line.split(separator);
                components.addAll(Arrays.asList(lineComponents));
            }

            //or:
//            do {
//                line = fileReader.readLine();
//                if (line != null) {
//                    String[] lineComments = line.split(separator);
//                    components.addAll(Arrays.asList(lineComments))
//                }
//            } while (line!=null);
            return components;
        }
    }
}
