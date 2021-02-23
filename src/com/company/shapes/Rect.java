package com.company.shapes;

public class Rect extends OutlineShapes
{
    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rect() {
        this.name = "Rect";
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tleft="   + left +   "\n" +
                "\ttop="    + top +    "\n" +
                "\tright="  + right +  "\n" +
                "\tbottom=" + bottom + "\n";
    }
}
