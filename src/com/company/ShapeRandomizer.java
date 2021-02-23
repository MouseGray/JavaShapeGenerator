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
        com.company.shapes.Point p = new Point();
        randomizeShape(p);

        p.setX(rnd.nextInt(limit));
        p.setY(rnd.nextInt(limit));
        p.setRadius(rnd.nextInt(3));
        return p;
    }

    private static Line generateLine() {
        Random rnd = new Random();
        Line l = new Line();
        randomizeShape(l);

        l.setStartPoint(rnd.nextInt(limit), rnd.nextInt(limit));
        l.setEndPoint(rnd.nextInt(limit), rnd.nextInt(limit));
        l.setWidth(rnd.nextInt(3));
        return l;
    }

    private static Triangle generateTriangle() {
        Random rnd = new Random();
        Triangle t = new Triangle();
        randomizeShape(t);
        randomizeOutlineShape(t);

        t.setFirstPoint(rnd.nextInt(limit), rnd.nextInt(limit));
        t.setSecondPoint(rnd.nextInt(limit), rnd.nextInt(limit));
        t.setThirdPoint(rnd.nextInt(limit), rnd.nextInt(limit));
        return t;
    }

    private static Rect generateRect() {
        Random rnd = new Random();
        Rect r = new Rect();
        randomizeShape(r);
        randomizeOutlineShape(r);

        r.setLeft(rnd.nextInt(limit));
        r.setTop(rnd.nextInt(limit));
        r.setRight(rnd.nextInt(limit));
        r.setBottom(rnd.nextInt(limit));
        return r;
    }

    private static Ellipse generateEllipse() {
        Random rnd = new Random();
        Ellipse e = new Ellipse();
        randomizeShape(e);
        randomizeOutlineShape(e);

        e.setPos(rnd.nextInt(limit), rnd.nextInt(limit));
        e.setRadius(rnd.nextInt(limit));
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
