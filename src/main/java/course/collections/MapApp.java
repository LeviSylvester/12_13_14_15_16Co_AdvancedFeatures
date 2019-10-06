package course.collections;

import shapes.Point;
import shapes.UncomparablePoint;

import java.util.HashMap;
import java.util.Map;

public class MapApp {

    public static void main(String[] args) {
        Map<UncomparablePoint, String> descriptionByPoint /*cheie, descrierea*/ = new HashMap<>();

        UncomparablePoint p1 = new UncomparablePoint(1, 2);
        UncomparablePoint p2 = new UncomparablePoint(5, 100);
        UncomparablePoint p3 = new UncomparablePoint(7, 9);
        UncomparablePoint p4 = new UncomparablePoint(7, 9);

        descriptionByPoint.put(p1, "Punctul1");
        descriptionByPoint.put(p2, "Punctul2");
        descriptionByPoint.put(p3, "Punctul3");
        descriptionByPoint.put(p4, "Punctul4");
//        descriptionByPoint.putIfAbsent(p4, "Punctul4"); //e aceeasi problema daca n-am avea hash code si equals, dar e vorba de chei
        //aici nu conteaza ordinea
        //la linkedhashmap ordinea ar fi exact ordinea de intrare

        System.out.println(descriptionByPoint);
    }
}
