package sc2002_lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the total number of 2D shapes:");
        int totalShapes = sc.nextInt();

        for (int i = 0; i < totalShapes; i++) {
            System.out.println("Choose a 2D shape to add:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");

            int choice = sc.nextInt();
            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2:
                    System.out.print("Enter base and height of the triangle: ");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                case 3:
                    System.out.print("Enter length and breadth of the rectangle: ");
                    double length = sc.nextDouble();
                    double breadth = sc.nextDouble();
                    shape = new Rectangle(length, breadth);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            if (shape != null) {
                shapes.add(shape);
            }
        }

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        System.out.println("The total area of the 2D figure is: " + totalArea);
    }
}
