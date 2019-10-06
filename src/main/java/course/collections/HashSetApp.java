package course.collections;

import shapes.Point;
import shapes.UncomparablePoint;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<UncomparablePoint> points = new HashSet<>(); //Uncomp sa nu avem nici equals, nici comparable
        //Hashset-ul nu avem nevoie nici de equals nici de comp, dar dif de list, ca nu lasa duplicate si asta-i ordonat, lista nu-i

        UncomparablePoint p1 = new UncomparablePoint(1, 2);
        UncomparablePoint p2 = new UncomparablePoint(5, 100);
        UncomparablePoint p3 = new UncomparablePoint(7, 9);
        UncomparablePoint p4 = new UncomparablePoint(7, 9);

        points.add(p1);
        points.add(p2);
        System.out.println(points.add(p3));
//        System.out.println(points.add(p3));
        System.out.println(points.add(p4)); //outputs true, because it needs hashcode to be implemented
        //deci prima data trebuie implementat hashcode, si dupa aceea equals //trebuie implementate amandoua cand avem de a face cu hashset sau hashmap

        System.out.println(points);

//        System.out.println(points.remove(new UncomparablePoint(7, 9)));
//        System.out.println(points);
    }
}
