package com.company;

public class Circle extends Figure implements Drawable  {
    private int radius;

    public Circle(String name,int radius) {
        super.setName(name);
        this.radius = radius;
    }


    public int getRadius(){
        return radius;

    }
    public void setRadius(){
        this.radius=radius;
    }

    public int calculatePerimeter(){
        return(int)(2*Math.PI*radius);
    }



    @Override
    public String draw() {
        return "\uD83D\uDFE0";
    }


}

