package com.company.shapes;

import java.awt.*;

public abstract class Shape {
    private final String name;
    private final Color color;

    protected Shape(Builder<?> builder) {
        this.name = builder.name;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return  name + "\n" +
                "\tcolor=" + "[r: " + color.getRed() + " g: " + color.getGreen() + " b: " + color.getBlue() + "]\n";
    }

    public static abstract class Builder<T extends Builder<T>> {
        private String name;
        private Color color;

        protected Builder(String name) {
            this.name = name;
        }

        abstract T getThis();

        protected T setName(String name) {
            this.name = name;
            return this.getThis();
        }

        public T setColor(Color color) {
            this.color = color;
            return this.getThis();
        }
    }
}
