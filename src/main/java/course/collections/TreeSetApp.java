package course.collections;

import shapes.Point;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        Set<Point> points = new TreeSet<>(/*comparator*/); //fie utilizeaza comparable, sau ii dam ca parametru un comparatpr

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 100);
        Point p3 = new Point(7, 9);
        Point p4 = new Point(7, 9);

        points.add(p1);
        points.add(p2);
        System.out.println(points.add(p3));
        System.out.println(points.add(p4));

        System.out.println(points);

        System.out.println(points.remove(new Point(7, 9)));
        System.out.println(points);

    }
}
