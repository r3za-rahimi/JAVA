package src;

import src.person.Person;
import src.shape.Circle;
import src.shape.Cylinder;

public class Main {
    public static void main(String[] args) {


        // Question 01

        boolean result1 = LeafYearCalculator.isLeapYear(2000);

        System.out.println(result1 + "\u001B[35m");

        // Question 02

        int result2 = SumOdd.sumOdd(100, 1000);

        System.out.println(result2 + "\u001B[33m");

        // Question 03

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to SmithSystem.out.println("fullName= " + person.getFullName());
        System.out.println("fullName= " + person.getFullName() +"\u001B[36m");



        // Question 04


        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());


    }

}