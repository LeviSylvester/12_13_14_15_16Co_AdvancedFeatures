package shapes;

public abstract class Shape {

    private static Color defaultColor;
    protected int colorCode;

//    public Shape() {
//        System.out.println("Constructor Shape");
//    }

    public Shape() {
    }

    public Shape(int colorCode) {
        System.out.println("ColorCode Shape constructor");
    }


    //nested Colour class:
    public static class Color extends Colorable.GenericColor {
        private /*final*/ int red; //final pentru camp oblicatoriu, pt ca trebuie instantiat, dar nu ne lasa, asa ca facem iin modul urmator mai jos cu constructor
        private /*final*/ int green;
        private /*final*/ int blue;

        public Color() {

        }

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

//        public int getcolorCode() {
//            return defaultColor; //will not work
//        }

        @Override //overrides the built-in default toString method
        public String toString() {
            return "Color{" +
                    "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue +
                    '}';
        }


    }

    static Shape.Color getDescriptiveColor(final Shape.Color color) {
//        //local class DescriptiveColor that extends Shape.Color class
//        class DescriptiveColor extends Shape.Color {
//            DescriptiveColor() {
//                super(color.red, color.green, color.blue);
//            }
//            @Override
//            public String toString() {
//                return "Your selected a color with RGB values" + color;
//            }
//        }
//        return new DescriptiveColor();
        return new Shape.Color(color.red, color.green, color.blue) { //clasa anonima
            @Override
            public String toString() {
                return "Your selected a color with RGB values" + color;
            }
        };
    }
}
