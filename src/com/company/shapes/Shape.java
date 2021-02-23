package com.company.shapes;

import java.awt.*;

public abstract class Shape {
    protected String name;
    protected Color color;

    public Shape() {
        this.color = new Color(255, 255, 255);
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  name + "\n" +
                "\tcolor=" + "[r: " + color.getRed() + " g: " + color.getGreen() + " b: " + color.getBlue() + "]\n";
    }
}
