package course.collections;

import shapes.Point;
import vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 2);
        Point p3 = new Point(5, -1);

        points.add(p1);
        points.add(p2);
        points.add(p3);

//        p1.equals(new Car(200, false));

        System.out.println(points);

        Point test = new Point(1, 2);
        System.out.println(points.remove(test));
        System.out.println(points);

        System.out.println(points.remove(new Point(1, 2)));
        System.out.println(points);

        System.out.println(points.remove(p1));
        System.out.println(points);

        points.add(null);
        System.out.println(points);
        points.remove(null);
        System.out.println(points);
    }
}
