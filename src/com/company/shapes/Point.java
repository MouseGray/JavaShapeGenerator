package com.company.shapes;

public final class Point extends Shape {
    private final int x;
    private final int y;

    private Point(Builder builder) {
        super(builder);
        this.x = builder.x;
        this.y = builder.y;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tx=" + x + "\n" +
                "\ty=" + y + "\n";
    }

    public static final class Builder extends Shape.Builder<Builder> {
        private int x;
        private int y;

        public Builder() {
            super("Point");
        }

        public Builder setX(int x) {
            this.x = x;
            return this;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }

        public Point build() {
            return new Point(this);
        }

        @Override
        Builder getThis() {
            return this;
        }
    }
}
