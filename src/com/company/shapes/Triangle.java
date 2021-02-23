package com.company.shapes;

import com.company.shapes.OutlineShapes;

public class Triangle extends OutlineShapes {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public Triangle() {
        this.name = "Triangle";
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 0;
    }

    public void setFirstPoint(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public void setSecondPoint(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    public void setThirdPoint(int x, int y) {
        this.x3 = x;
        this.y3 = y;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tleft=["   + "x: " + x1 + " y: " + y1 + "]\n" +
                "\ttop=["    + "x: " + x2 + " y: " + y2 + "]\n" +
                "\tright=["  + "x: " + x3 + " y: " + y3 + "]\n";
    }
}
