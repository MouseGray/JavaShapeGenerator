package com.company.shapes;

public final class Line extends Shape {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    private Line(Builder builder) {
        super(builder);
        this.x1 = builder.x1;
        this.y1 = builder.y1;
        this.x2 = builder.x2;
        this.y2 = builder.y2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tstart=[" + "x: " + x1 + " y: " + y1 + "]\n" +
                "\tend=[" + "x: " + x2 + " y: " + y2 + "]\n";
    }

    public static final class Builder extends OutlineShapes.Builder<Builder> {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public Builder() {
            super("Line");
        }

        public Builder setX1(int x1) {
            this.x1 = x1;
            return this;
        }

        public Builder setY1(int y1) {
            this.y1 = y1;
            return this;
        }

        public Builder setX2(int x2) {
            this.x2 = x2;
            return this;
        }

        public Builder setY2(int y2) {
            this.y2 = y2;
            return this;
        }

        public Line build() {
            return new Line(this);
        }

        @Override
        Builder getThis() {
            return this;
        }
    }
}
