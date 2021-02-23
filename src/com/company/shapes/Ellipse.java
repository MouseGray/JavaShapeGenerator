package com.company.shapes;

public class Ellipse extends OutlineShapes {
    private int x;
    private int y;
    private int radius;

    public Ellipse() {
        this.name = "Ellipse";
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
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
