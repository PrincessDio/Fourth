package com.company;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public boolean isEqual(Point point) {
        return point.x == x && point.y == y;
    }
}
