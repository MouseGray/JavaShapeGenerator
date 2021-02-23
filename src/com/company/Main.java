package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            ShapeList shapeList = new ShapeList(Integer.parseInt(args[0]));
            System.out.println(shapeList.toString());
        }
        catch (NumberFormatException ex) {
            System.out.println("Incorrect number of shapes.");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Not found number of shapes.");
        }
    }
}
