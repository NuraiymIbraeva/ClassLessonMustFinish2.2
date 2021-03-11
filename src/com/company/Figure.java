package com.company;

public abstract class Figure  {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int calculatePerimeter();

    public abstract String draw();
    }





