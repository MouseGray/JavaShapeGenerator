package com.company.shapes;

public class Line extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int width;

    public Line() {
        this.name = "Line";
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.width = 0;
    }

    public void setStartPoint(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public void setEndPoint(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tstart=[" + "x: " + x1 + " y: " + y1 + "]\n" +
                "\tend=[" + "x: " + x2 + " y: " + y2 + "]\n" +
                "\twidth=" + width + "\n";
    }
}
