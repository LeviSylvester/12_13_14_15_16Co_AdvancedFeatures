package shapes;

import course.collections.Utils;

import java.util.Comparator;
import java.util.Objects;

public class UncomparablePoint {

    private final double x;
    private final double y;

    public UncomparablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "UncomparablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) { //ca sa nu-l pot compara cu un car de exemplu
            return true;
        }
        if (!(other instanceof UncomparablePoint)) {
            return false;
        }
//        if(this.getClass().getName().equalsIgnoreCase((other.getClass().getName()))) {return false;} //acelasi lucru
        UncomparablePoint otherPoint = (UncomparablePoint) other;
        return Double.compare(this.x, otherPoint.getX()) == 0 &&
                Double.compare(this.y, otherPoint.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

//    @Override
//    public int hashCode() { //prima regula sa folosim aceeasi date ca si la equals //a doua r. sa-nmultesti cu numar prim
//        int prime = 31;
//        long result =1;
//        result = result * prime + Objects.hash(x);
//        result = result * prime + Objects.hash(y);
//        return (int) (result % (long) Integer.MAX_VALUE);
//    }


    Comparator<UncomparablePoint> com = (point1, point2) -> {
        double p1DistanceToOrigin = Utils.getPointDistanceToOrigin(point1.getX(), point1.getY());
        double p2DistanceToOrigin = Utils.getPointDistanceToOrigin(point2.getX(), point2.getY());
        return Double.compare(p1DistanceToOrigin, p2DistanceToOrigin);
    };
}
