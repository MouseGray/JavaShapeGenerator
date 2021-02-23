package com.company.shapes;

import java.awt.*;

public class OutlineShapes extends Shape {
    protected Color outLineColor;
    protected int outlineWidth;

    public Color getOutLineColor() {
        return outLineColor;
    }

    public void setOutLineColor(Color outLineColor) {
        this.outLineColor = outLineColor;
    }

    public int getOutlineWidth() {
        return outlineWidth;
    }

    public void setOutlineWidth(int outlineWidth) {
        this.outlineWidth = outlineWidth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\toutLineColor=" + "[r: " + outLineColor.getRed() + " g: " + outLineColor.getGreen() + " b: " + outLineColor.getBlue() + "]\n" +
                "\toutlineWidth=" + outlineWidth + "\n";
    }
}
