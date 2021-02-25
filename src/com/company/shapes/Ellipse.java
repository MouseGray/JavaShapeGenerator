package com.company.shapes;

public final class Ellipse extends OutlineShapes {
    private final int x;
    private final int y;
    private final int radius;

    private Ellipse(Builder builder) {
        super(builder);
        this.x = builder.x;
        this.y = builder.y;
        this.radius = builder.radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tx=" + x + "\n" +
                "\ty=" + y + "\n" +
                "\tradius=" + radius + "\n";
    }

    public static final class Builder extends OutlineShapes.Builder<Builder> {
        private int x;
        private int y;
        private int radius;

        public Builder() {
            super("Ellipse");
        }

        public Builder setX(int x) {
            this.x = x;
            return this;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }

        public Builder setRadius(int radius) {
            this.radius = radius;
            return this;
        }

        public Ellipse build() {
            return new Ellipse(this);
        }

        @Override
        Builder getThis() {
            return this;
        }
    }
}
