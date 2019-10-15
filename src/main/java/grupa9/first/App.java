package grupa9.first;

public class App {
    static Person firstPerson = new Person();
    static grupa9.second.Person secondPerson = new grupa9.second.Person();

    public static void main(String[] args) {
        System.out.println(firstPerson.age + firstPerson.gender + firstPerson.id + firstPerson.name);
        System.out.println(secondPerson.age + secondPerson.gender + secondPerson + secondPerson.name);
    }


}
