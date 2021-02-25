package com.company.shapes;

public class Ellipse extends OutlineShapes {
    private int x;
    private int y;
    private int radius;

    private Ellipse(String name, int x, int y, int radius) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tx=" + x + "\n" +
                "\ty=" + y + "\n" +
                "\tradius=" + radius + "\n";
    }

    public static class builder {
        private int x;
        private int y;
        private int radius;

        public builder setX(int x) {
            this.x = x;
            return this;
        }

        public builder setY(int y) {
            this.y = y;
            return this;
        }

        public builder setRadius(int radius) {
            this.radius = radius;
            return this;
        }

        public Ellipse build() {
            return new Ellipse("Ellipse", x, y, radius);
        }
    }
}
