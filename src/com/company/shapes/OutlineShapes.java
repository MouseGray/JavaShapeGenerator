package com.company.shapes;

import java.awt.*;

public abstract class OutlineShapes extends Shape {
    private final Color outLineColor;
    private final int outlineWidth;

    protected OutlineShapes(Builder<?> builder) {
        super(builder);
        this.outLineColor = builder.outLineColor;
        this.outlineWidth = builder.outlineWidth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\toutLineColor=" + "[r: " + outLineColor.getRed() + " g: " + outLineColor.getGreen() + " b: " + outLineColor.getBlue() + "]\n" +
                "\toutlineWidth=" + outlineWidth + "\n";
    }

    public static abstract class Builder<T extends Builder<T>> extends Shape.Builder<T> {
        private Color outLineColor;
        private int outlineWidth;

        protected Builder(String name) {
            super(name);
        }

        public T setOutLineColor(Color outLineColor) {
            this.outLineColor = outLineColor;
            return this.getThis();
        }

        public T setOutlineWidth(int outlineWidth) {
            this.outlineWidth = outlineWidth;
            return this.getThis();
        }
    }
}
