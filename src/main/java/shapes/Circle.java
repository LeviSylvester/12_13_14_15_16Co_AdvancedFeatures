package shapes;

public abstract class Circle extends Shape implements Colorable {

    public static Point origin = new Point(0, 0);

    private Point center;
    private Double radius;

    private int x;
    private int y;
    public static final Point ORIGIN;

    static {
        System.out.println("text");
        ORIGIN = new Point(0, 0);
    }

    public void render() { //o implementare a constante din interfata
        System.out.println("Circle rendered with " + DEFAULT_COLOR_CODE);
    }

//    public Point(int x, int y) { //da eroare intentionat, de verificat, de ce :)
//        this.x = x;
//        this.y = y;
//    }

    public int getX() {
//        ORIGIN = null;
        return x;
    }

    public int getY() {
//        ORIGIN = null;
        return y;
    }

    public Circle(Double radius) {
//        super(0);
//        System.out.println("Constructor Circle");
//        this.radius = radius;
        this(radius, 0, new Point(0, 0));
    }

    Circle(Double radius, int colorCode, Point center) {
        super(colorCode);
        this.radius = radius;
        this.center = center;
    }

    //    @Override
    public abstract double area();



    public void fillColor() {
        System.out.println(super.colorCode);
    }

    public Double getRadius() {
        return radius;
    }
    //return Math.PI * 2 * radius;
}
