package com.company;

public class Square  extends Figure implements Drawable{
    private int side1;

    public Square(String name,int side1) {
        super.setName(name);
        this.side1 = side1;

    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }
    public int calculatePerimeter(){
        return 4*side1;


}

    @Override
    public String draw() {
        return "\uD83D\uDFE8";
    }
}
