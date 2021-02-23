package com.company;

import com.company.shapes.Shape;

import java.util.ArrayList;
import java.util.Random;

public class ShapeList {
    private ArrayList<Shape> data = new ArrayList<>();

    public ShapeList(int amount) {
        if (amount < 0) throw new IllegalArgumentException();

        Random rnd = new Random();
        for(int i = 0; i < amount; i++)
            data.add(ShapeRandomizer.createNextShape());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Shape obj: data)
            result.append(obj);
        return result.toString();
    }
}
