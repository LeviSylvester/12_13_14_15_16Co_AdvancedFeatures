package course.io;

import shapes.Circle;

import java.io.*;

public class SerializeDeserializeApp {
    //reprezentarea in cod masina (bytecode)
    //in java orice obiect este marcat ca serializable
    //transcient keyword skips certain file from serialization

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Circle circle = new Circle(Double.parseDouble("5"));
        Circle circle = new Circle(Double.parseDouble("5"))
        {
            @Override
            public double area() {
                return 0;
            }
        };
        //transcient keyword skips certain file from serialization
        serialize(circle, "file.txt");
        deserialize("file.txt");




    }
    //method to deserialize:
    static Circle deserialize(String sourceFile) throws IOException, ClassNotFoundException {
        try(InputStream fileInputStream = new FileInputStream(sourceFile)){
            ObjectInputStream deserializer = new ObjectInputStream(fileInputStream);
            /*Object*/Circle circle = (Circle) deserializer.readObject();
            System.out.println(circle);
            return circle;
        }
    }
    static void serialize(Serializable toSerialize, String destFile) throws IOException {
        //vom scrie in fisier
        try (OutputStream fileOutputStream = new FileOutputStream(destFile)) {
            //declaram un obiect
            ObjectOutputStream serializer = new ObjectOutputStream(fileOutputStream);
            serializer.writeObject(toSerialize);
        }
    }
}
