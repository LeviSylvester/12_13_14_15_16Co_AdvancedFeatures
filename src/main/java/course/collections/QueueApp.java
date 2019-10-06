package course.collections;

import shapes.Point;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<Point> points = new PriorityQueue<>();


        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 100);
        Point p3 = new Point(7, 9);

        points.add(p1);
        points.add(p2);
        points.add(p3);

        System.out.println(points);

//        points.remove(p1);
//        System.out.println(points);
//        points.remove(p2);
//        System.out.println(points);
//        points.remove(p3);
//        System.out.println(points);

//        for (Point p : points) {
//            points.remove(p);
//            System.out.println(points);
//        }

        while (!points.isEmpty()){
//            System.out.println(points.remove());
            System.out.println(points.poll());
//            System.out.println(points.peek());
            System.out.println(points);
        }
    }
}