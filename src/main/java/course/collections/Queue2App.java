package course.collections;

import shapes.Point;
import shapes.UncomparablePoint;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2App {
    public static void main(String[] args) {
        Comparator<UncomparablePoint> comparator = new Comparator<UncomparablePoint>() { //dupa java 8 se poate cu lambda
            @Override
            public int compare(UncomparablePoint p1, UncomparablePoint p2) {
                double p1DistanceToOrigin = Utils.getPointDistanceToOrigin(p1.getX(), p1.getY());
                double p2DistanceToOrigin = Utils.getPointDistanceToOrigin(p2.getX(), p2.getY());
                return Double.compare(p1DistanceToOrigin, p2DistanceToOrigin);
            }
        };
        Queue<UncomparablePoint> uncomparablePoints = new PriorityQueue<>(comparator);

//        UncomparablePoint p1 = new UncomparablePoint(3, 0);

        UncomparablePoint p1 = new UncomparablePoint(1, 2);
        UncomparablePoint p2 = new UncomparablePoint(5, 100);
        UncomparablePoint p3 = new UncomparablePoint(7, 9);

        uncomparablePoints.add(p1);
        uncomparablePoints.add(p2);
        uncomparablePoints.add(p3);

        System.out.println(uncomparablePoints);

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

        while (!uncomparablePoints.isEmpty()){
//            System.out.println(points.remove());
            System.out.println(uncomparablePoints.poll());
//            System.out.println(points.peek());
            System.out.println(uncomparablePoints);
        }
    }
}
