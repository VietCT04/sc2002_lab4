package sc2002_lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the total number of 3D shapes:");
        int totalShapes = sc.nextInt();

        for (int i = 0; i < totalShapes; i++) {
            System.out.println("Choose a 3D shape to add:");
            System.out.println("1. Sphere");
            System.out.println("2. Pyramid (Square-based)");
            System.out.println("3. Cuboid");
            System.out.println("4. Cone");
            System.out.println("5. Cylinder");

            int choice = sc.nextInt();
            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = sc.nextDouble();
                    shape = new Sphere(sphereRadius);
                    break;

                case 2:
                    System.out.print("Enter base length and height of the pyramid: ");
                    double baseLength = sc.nextDouble();
                    double pyramidHeight = sc.nextDouble();
                    shape = new Pyramid(baseLength, pyramidHeight);
                    break;

                case 3:
                    System.out.print("Enter length, width, and height of the cuboid: ");
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    double cuboidHeight = sc.nextDouble();
                    shape = new Cuboid(length, width, cuboidHeight);
                    break;

                case 4:
                    System.out.print("Enter radius and height of the cone: ");
                    double coneRadius = sc.nextDouble();
                    double coneHeight = sc.nextDouble();
                    shape = new Cone(coneRadius, coneHeight);
                    break;

                case 5:
                    System.out.print("Enter radius and height of the cylinder: ");
                    double cylinderRadius = sc.nextDouble();
                    double cylinderHeight = sc.nextDouble();
                    shape = new Cylinder(cylinderRadius, cylinderHeight);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            if (shape != null) {
                shapes.add(shape);
            }
        }

        double totalSurfaceArea = 0;
        for (Shape shape : shapes) {
            totalSurfaceArea += shape.calculateArea();
        }

        System.out.println("The total surface area of the 3D figure is: " + totalSurfaceArea);
    }
}
