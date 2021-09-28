package com.company;

public class MovableRectangle extends Rectangle implements Movable {

    MovablePoint lowerLeftCorner;
    MovablePoint upperRightCorner;

    public MovableRectangle() {
        super();
        lowerLeftCorner = new MovablePoint();
        upperRightCorner = new MovablePoint();
    }

    public MovableRectangle(double width, double length) {
        super(width, length);
        lowerLeftCorner = new MovablePoint();
        upperRightCorner = new MovablePoint();
    }

    public MovableRectangle(double width, double length, Point lowerLeftCorner) {
        super(width, length);
        this.lowerLeftCorner.assign(lowerLeftCorner);
        upperRightCorner.assign(new Point(lowerLeftCorner.x + length,
                                        lowerLeftCorner.y + width));
    }

    public MovableRectangle(String color, boolean filled, double width, double length, Point lowerLeftCorner) {
        super(color, filled, width, length);
        this.lowerLeftCorner.assign(lowerLeftCorner);
        upperRightCorner.assign(new Point(lowerLeftCorner.x + length,
                                        lowerLeftCorner.y + width));
    }

    @Override
    public void move(Point vector) {
        lowerLeftCorner.move(vector);
        upperRightCorner.move(vector);
    }

    public boolean speedTest() {
        return upperRightCorner.isEqual(new Point(lowerLeftCorner.x + length,
                                                lowerLeftCorner.y + width));
    }
}
