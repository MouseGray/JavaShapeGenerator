package com.company.shapes;

import com.company.shapes.OutlineShapes;

public class Triangle extends OutlineShapes {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    private Triangle(String name, int x1, int y1, int x2, int y2, int x3, int y3) {
        this.name = "Triangle";
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tleft=["   + "x: " + x1 + " y: " + y1 + "]\n" +
                "\ttop=["    + "x: " + x2 + " y: " + y2 + "]\n" +
                "\tright=["  + "x: " + x3 + " y: " + y3 + "]\n";
    }

    public static class builder {
        private int x1;
        private int y1;
        private int x2;
        private int y2;
        private int x3;
        private int y3;

        public builder setX1(int x1) {
            this.x1 = x1;
            return this;
        }

        public builder setY1(int y1) {
            this.y1 = y1;
            return this;
        }

        public builder setX2(int x2) {
            this.x2 = x2;
            return this;
        }

        public builder setY2(int y2) {
            this.y2 = y2;
            return this;
        }

        public builder setX3(int x3) {
            this.x3 = x3;
            return this;
        }

        public builder setY3(int y3) {
            this.y3 = y3;
            return this;
        }

        public Triangle build() {
            return new Triangle("Triangle", x1, y1, x2, y2, x3, y3);
        }
    }
}
