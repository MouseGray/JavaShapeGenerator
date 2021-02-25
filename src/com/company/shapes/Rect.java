package com.company.shapes;

public final class Rect extends OutlineShapes
{
    private final int left;
    private final int top;
    private final int right;
    private final int bottom;

    private Rect(Builder builder) {
        super(builder);
        this.left = builder.left;
        this.top = builder.top;
        this.right = builder.right;
        this.bottom = builder.bottom;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tleft="   + left +   "\n" +
                "\ttop="    + top +    "\n" +
                "\tright="  + right +  "\n" +
                "\tbottom=" + bottom + "\n";
    }

    public static final class Builder extends OutlineShapes.Builder<Builder> {
        private int left;
        private int top;
        private int right;
        private int bottom;

        public Builder() {
            super("Rect");
        }

        public Builder setLeft(int left) {
            this.left = left;
            return this;
        }

        public Builder setTop(int top) {
            this.top = top;
            return this;
        }

        public Builder setRight(int right) {
            this.right = right;
            return this;
        }

        public Builder setBottom(int bottom) {
            this.bottom = bottom;
            return this;
        }

        public Rect build() {
            return new Rect(this);
        }

        @Override
        Builder getThis() {
            return this;
        }
    }
}
