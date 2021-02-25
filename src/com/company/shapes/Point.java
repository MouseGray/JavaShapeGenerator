package com.company.shapes;

public class Point extends Shape {
    private int x;
    private int y;

    private Point(String name, int x, int y) {
        this.name = "Point";
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tx=" + x + "\n" +
                "\ty=" + y + "\n";
    }

    public static class builder {
        private int x;
        private int y;

        public builder setX(int x) {
            this.x = x;
            return this;
        }

        public builder setY(int y) {
            this.y = y;
            return this;
        }

        public Point build() {
            return new Point("Point", x, y);
        }
    }
}
