package com.company;

import com.company.shapes.*;
import com.company.shapes.Point;
import com.company.shapes.Shape;

import java.awt.*;
import java.util.Random;

public final class ShapeRandomizer {
    private ShapeRandomizer() { }

    private static final int limit = 1000;

    public static Shape createNextShape() {
        Random rnd = new Random();
        switch(rnd.nextInt(5)) {
            case 0: return generatePoint();
            case 1: return generateLine();
            case 2: return generateTriangle();
            case 3: return generateRect();
            case 4: return generateEllipse();
        }
        return null;
    }

    private static Point generatePoint() {
        Random rnd = new Random();
        return new Point.Builder()
                .setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setX(rnd.nextInt(limit))
                .setY(rnd.nextInt(limit))
                .build();
    }

    private static Line generateLine() {
        Random rnd = new Random();
        return new Line.Builder()
                .setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setX1(rnd.nextInt(limit))
                .setY1(rnd.nextInt(limit))
                .setX2(rnd.nextInt(limit))
                .setY2(rnd.nextInt(limit))
                .build();
    }

    private static Triangle generateTriangle() {
        Random rnd = new Random();
        return new Triangle.Builder()
                .setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setOutLineColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setOutlineWidth(rnd.nextInt(3))
                .setX1(rnd.nextInt(limit))
                .setY1(rnd.nextInt(limit))
                .setX2(rnd.nextInt(limit))
                .setY2(rnd.nextInt(limit))
                .setX3(rnd.nextInt(limit))
                .setY3(rnd.nextInt(limit))
                .build();
    }

    private static Rect generateRect() {
        Random rnd = new Random();
        return new Rect.Builder()
                .setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setOutLineColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setOutlineWidth(rnd.nextInt(3))
                .setLeft(rnd.nextInt(limit))
                .setTop(rnd.nextInt(limit))
                .setRight(rnd.nextInt(limit))
                .setBottom(rnd.nextInt(limit))
                .build();
    }

    private static Ellipse generateEllipse() {
        Random rnd = new Random();
        return new Ellipse.Builder()
                .setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setOutLineColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)))
                .setOutlineWidth(rnd.nextInt(3))
                .setX(rnd.nextInt(limit))
                .setY(rnd.nextInt(limit))
                .setRadius(rnd.nextInt(limit))
                .build();
    }
}
