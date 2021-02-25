package com.company.shapes;

public class Rect extends OutlineShapes
{
    private int left;
    private int top;
    private int right;
    private int bottom;

    private Rect(String name, int left, int top, int right, int bottom) {
        this.name = name;
        this.left = left;
        this.top = top;
        this.right = right;
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

    public static class builder {
        private int left;
        private int top;
        private int right;
        private int bottom;

        public builder setLeft(int left) {
            this.left = left;
            return this;
        }

        public builder setTop(int top) {
            this.top = top;
            return this;
        }

        public builder setRight(int right) {
            this.right = right;
            return this;
        }

        public builder setBottom(int bottom) {
            this.bottom = bottom;
            return this;
        }

        public Rect build() {
            return new Rect("Rect", left, top, right, bottom);
        }
    }
}
