package com.company;

public class Triangle extends Figure implements Drawable{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(String name,int side1, int side2, int side3) {
        super.setName(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3B";
    }
}