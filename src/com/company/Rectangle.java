package com.company;

public class Rectangle extends Figure implements Drawable{
    private int side1;
    private int side1ide2;

    public Rectangle(String name,int side1) {
        super.setName(name);
        this.side1 = side1;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide1ide2() {
        return side1ide2;
    }

    public int calculatePerimeter() {
        return 2*(side1+side1ide2);
    }

    @Override
    public String draw() {
        return "\uD83D\uDD33";
    }
}
