package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 8);
        Square square = new Square("Square", 10);
      //  System.out.println(circle.getClass().getSimpleName() + " " + circle.calculatePerimeter());
      //  System.out.println(square.getClass().getSimpleName() + " " + square.calculatePerimeter());

        Dog dog = new Dog();
        System.out.println(dog.getClass().getSimpleName()+ " " + dog.draw() + " "  + dog.callSound());


        Figure[] figures = new Figure[]{circle, square,
                new Triangle("Triangle", 7, 5, 6),
                new Rectangle("Rectangle", 6),
                new Circle("Circle2", 5),
                new Square("Square2", 9)
                // В массиве мы создали новые обьекты
                // В массиве через слово


        };
        for (Figure figure:figures){
            System.out.println(figure.getName()+figure.draw() + " " + figure.calculatePerimeter());
        }

    }}


// getSimpleName Возврощает только имя класса активности
//new Triangle потому что обьекта triangle нету в Maine
//Circle🟠 0    то есть получили figure.getName()+figure.draw()  вот эти имя класса и фигур
//Square🟨 40   также + figure.calculatePerimeter()); также расчитали их периметр и окружение
//Triangle🔻 18
//Rectangle🔳 12
//Circle2🟠 0
//Square2🟨 36


