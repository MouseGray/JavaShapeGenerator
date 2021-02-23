package com.company.shapes;

public class Point extends Shape {
    private int x;
    private int y;
    private int radius;

    public Point() {
        this.name = "Point";
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tx=" + x + "\n" +
                "\ty=" + y + "\n" +
                "\tradius=" + radius + "\n";
    }
}
