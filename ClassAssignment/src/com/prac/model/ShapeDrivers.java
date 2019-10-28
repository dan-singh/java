package com.prac.model;
import java.util.Scanner;

public class ShapeDrivers{

public static void main(String[] args) {

    Scanner inputvar = new Scanner( System.in);

    System.out.print("Enter length of rectangle:");
    double length = inputvar.nextDouble();
    System.out.print("Enter width of rectangle:");
    double width = inputvar.nextDouble();

    Rectangle  Perimeter = new Rectangle(length, width);
    Perimeter.getPerimeter();
    Rectangle  Area = new Rectangle(length, width);
    Area.getArea();

    
    Rectangle  rectangle = new Rectangle(length , width );
    System.out.printf("Area: %.1f, Perimeter: %.1f",rectangle.getArea() ,rectangle.getPerimeter());

}
}