package com.company.shapes;

public class Line extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private Line(String name, int x1, int y1, int x2, int y2) {
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tstart=[" + "x: " + x1 + " y: " + y1 + "]\n" +
                "\tend=[" + "x: " + x2 + " y: " + y2 + "]\n";
    }

    public static class builder {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

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

        public Line build() {
            return new Line("Line", x1, y1, x2, y2);
        }
    }
}
