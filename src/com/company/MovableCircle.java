package com.company;

public class MovableCircle extends Circle implements Movable{

    MovablePoint pos;

    public MovableCircle(double radius, Point pos) {
        super(radius);
        this.pos.assign(pos);
    }

    public MovableCircle(String color, boolean filled, double radius, Point pos) {
        super(color, filled, radius);
        this.pos.assign(pos);
    }

    @Override
    public void move(Point pos) {
        this.pos.assign(pos);
    }
}
