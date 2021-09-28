package com.company;

public class MovablePoint extends Point implements Movable {

    @Override
    public void move(Point pos) {
        this.x += pos.x;
        this.y += pos.y;
    }

    void assign(Point point) {
        x = point.x;
        y = point.y;
    }
}
