package shapes;

public interface Colorable {
    /*public static final*/ int DEFAULT_COLOR_CODE = 0; //p s f nu se scrie dar sa constientizam, ca e acolo

    static void describeBehaviour(){
        System.out.println("This is colourable");
    }

    default void printFillColor(){
        System.out.println("Default colour code is " + DEFAULT_COLOR_CODE);
        System.out.println(String.format("Default colour code is %d.",
                DEFAULT_COLOR_CODE));
    }

    /*abstract*/ void render(); //abstract nu se scrie dar sa constientizam, ca e acolo

    class GenericColor { //e implicit statica

    }
}
