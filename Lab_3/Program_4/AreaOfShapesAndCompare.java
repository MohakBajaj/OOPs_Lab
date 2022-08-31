package Lab_3.Program_4;

import java.util.Scanner;

public class AreaOfShapesAndCompare {
    // take two input shape and compute area of shape and compare the two shapes

    String shape1, shape2;

    Scanner sc = new Scanner(System.in);

    public AreaOfShapesAndCompare() {
        // Taking two input shapes
        System.out.println("Enter the shape 1: ");
        shape1 = sc.next();
        System.out.println("Enter the shape 2: ");
        shape2 = sc.next();
    }

    double[] areas = new double[2];

    public void computeArea() {
        // Compute the Area
        if (shape1.equalsIgnoreCase("circle")) {
            System.out.println("Enter the radius of circle: ");
            double radius = sc.nextDouble();
            areas[0] = Math.PI * radius * radius;
        } else if (shape1.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter the length of rectangle: ");
            double length = sc.nextDouble();
            System.out.println("Enter the breadth of rectangle: ");
            double breadth = sc.nextDouble();
            areas[0] = length * breadth;
        } else if (shape1.equalsIgnoreCase("square")) {
            System.out.println("Enter the side of square: ");
            double side = sc.nextDouble();
            areas[0] = side * side;
        } else if (shape1.equalsIgnoreCase("triangle")) {
            System.out.println("Enter the base of triangle: ");
            double base = sc.nextDouble();
            System.out.println("Enter the height of triangle: ");
            double height = sc.nextDouble();
            areas[0] = base * height / 2;
        } else {
            System.out.println("Invalid input");
        }
        if (shape2.equalsIgnoreCase("circle")) {
            System.out.println("Enter the radius of circle: ");
            double radius = sc.nextDouble();
            areas[1] = Math.PI * radius * radius;
        } else if (shape2.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter the length of rectangle: ");
            double length = sc.nextDouble();
            System.out.println("Enter the breadth of rectangle: ");
            double breadth = sc.nextDouble();
            areas[1] = length * breadth;
        } else if (shape2.equalsIgnoreCase("square")) {
            System.out.println("Enter the side of square: ");
            double side = sc.nextDouble();
            areas[1] = side * side;
        } else if (shape2.equalsIgnoreCase("triangle")) {
            System.out.println("Enter the base of triangle: ");
            double base = sc.nextDouble();
            System.out.println("Enter the height of triangle: ");
            double height = sc.nextDouble();
            areas[1] = base * height / 2;
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }

    public void compareArea() {
        // Compare the area of two shapes
        if (areas[0] > areas[1]) {
            System.out.println("Area of " + shape1 + " is greater than " + shape2);
        } else if (areas[0] < areas[1]) {
            System.out.println("Area of " + shape1 + " is less than " + shape2);
        } else {
            System.out.println("Area of " + shape1 + " is equal to " + shape2);
        }
    }

    public static void main(String[] args) {
        AreaOfShapesAndCompare aos = new AreaOfShapesAndCompare();
        aos.computeArea();
        aos.compareArea();
    }
}