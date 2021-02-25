package com.company;

import com.company.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public final class ShapeList {
    private final List<Shape> data = new ArrayList<>();

    public ShapeList(int amount) throws NumberFormatException {
        if (amount < 0) throw new NumberFormatException();
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
