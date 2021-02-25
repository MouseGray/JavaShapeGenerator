package com.company.shapes;

public final class Triangle extends OutlineShapes {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int x3;
    private final int y3;

    private Triangle(Builder builder) {
        super(builder);
        this.x1 = builder.x1;
        this.y1 = builder.y1;
        this.x2 = builder.x2;
        this.y2 = builder.y2;
        this.x3 = builder.x3;
        this.y3 = builder.y3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tleft=["   + "x: " + x1 + " y: " + y1 + "]\n" +
                "\ttop=["    + "x: " + x2 + " y: " + y2 + "]\n" +
                "\tright=["  + "x: " + x3 + " y: " + y3 + "]\n";
    }

    public static final class Builder extends OutlineShapes.Builder<Builder> {
        private int x1;
        private int y1;
        private int x2;
        private int y2;
        private int x3;
        private int y3;

        public Builder() {
            super("Triangle");
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

        public Builder setX3(int x3) {
            this.x3 = x3;
            return this;
        }

        public Builder setY3(int y3) {
            this.y3 = y3;
            return this;
        }

        public Triangle build() {
            return new Triangle(this);
        }

        @Override
        Builder getThis() {
            return this;
        }
    }
}
