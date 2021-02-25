package com.company;

import com.company.shapes.*;
import com.company.shapes.Point;
import com.company.shapes.Shape;

import java.awt.*;
import java.util.Random;

public final class ShapeRandomizer {
    private ShapeRandomizer() { }

    private static final int limit = 1000;

    private static void randomizeShape(com.company.shapes.Shape shape) {
        Random rnd = new Random();
        shape.setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
    }

    private static void randomizeOutlineShape(OutlineShapes shape) {
        Random rnd = new Random();
        shape.setOutLineColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
        shape.setOutlineWidth(rnd.nextInt(3));
    }

    private static com.company.shapes.Point generatePoint() {
        Random rnd = new Random();
        Point p = new Point.builder()
                .setX(rnd.nextInt(limit))
                .setY(rnd.nextInt(limit))
                .build();

        randomizeShape(p);

        return p;
    }

    private static Line generateLine() {
        Random rnd = new Random();
        Line l = new Line.builder()
                .setX1(rnd.nextInt(limit))
                .setY1(rnd.nextInt(limit))
                .setX2(rnd.nextInt(limit))
                .setY2(rnd.nextInt(limit))
                .build();

        randomizeShape(l);
        return l;
    }

    private static Triangle generateTriangle() {
        Random rnd = new Random();
        Triangle t = new Triangle.builder()
                .setX1(rnd.nextInt(limit))
                .setY1(rnd.nextInt(limit))
                .setX2(rnd.nextInt(limit))
                .setY2(rnd.nextInt(limit))
                .setX3(rnd.nextInt(limit))
                .setY3(rnd.nextInt(limit))
                .build();

        randomizeShape(t);
        randomizeOutlineShape(t);
        return t;
    }

    private static Rect generateRect() {
        Random rnd = new Random();
        Rect r = new Rect.builder()
                .setLeft(rnd.nextInt(limit))
                .setTop(rnd.nextInt(limit))
                .setRight(rnd.nextInt(limit))
                .setBottom(rnd.nextInt(limit))
                .build();

        randomizeShape(r);
        randomizeOutlineShape(r);
        return r;
    }

    private static Ellipse generateEllipse() {
        Random rnd = new Random();
        Ellipse e = new Ellipse.builder()
                .setX(rnd.nextInt(limit))
                .setY(rnd.nextInt(limit))
                .setRadius(rnd.nextInt(limit))
                .build();

        randomizeShape(e);
        randomizeOutlineShape(e);
        return e;
    }

    static Shape createNextShape() {
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
}
