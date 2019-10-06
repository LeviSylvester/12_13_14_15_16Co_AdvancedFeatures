package shapes;

import java.util.Objects;

import static course.collections.Utils.getPointDistanceToOrigin;

public class Point implements Comparable {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public String toString() {
//        return "(" + x + ", " + y + ")";
//    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) { //ca sa nu-l pot compara cu un car de exemplu
            return true;
        }
        if (!(other instanceof Point)) {
            return false;
        }
//        if(this.getClass().getName().equalsIgnoreCase((other.getClass().getName()))) {return false;} //acelasi lucru
        Point otherPoint = (Point) other;
        return Double.compare(this.x, otherPoint.getX()) == 0 &&
                Double.compare(this.y, otherPoint.getY()) == 0;
    }

    @Override
    public int compareTo(Object other) {
        double thisDistanceToOrigin = getPointDistanceToOrigin(this.x, this.y);
        Point otherPoint = (Point) other;
        double otherDistanceToOrigin = getPointDistanceToOrigin(otherPoint.getX(), otherPoint.getY());
        return Double.compare(thisDistanceToOrigin, otherDistanceToOrigin);
    }



    //default override for equals and hashcode
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Point point = (Point) o;
//        return Double.compare(point.x, x) == 0 && //& vs && daca se uita la a doua sau nu se mai uita la a doua
//                Double.compare(point.y, y) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }
}
