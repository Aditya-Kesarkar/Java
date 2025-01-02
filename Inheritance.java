import java.util.Scanner;

// Parent class
class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass for Circle
class Circle extends Shape {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of circle = πr²
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    public double calculateArea(double length, double width) {
        return length * width; // Area of rectangle = length × width
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    public double calculateArea(double base, double height) {
        return 0.5 * base * height; // Area of triangle = 0.5 × base × height
    }
}

// Subclass for Square
class Square extends Shape {
    public double calculateArea(double side) {
        return side * side; // Area of square = side²
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instances of subclasses
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle: " + circle.calculateArea(radius));
                break;

            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Area of Rectangle: " + rectangle.calculateArea(length, width));
                break;

            case 3: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + triangle.calculateArea(base, height));
                break;

            case 4: // Square
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                System.out.println("Area of Square: " + square.calculateArea(side));
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        sc.close();
    }
}
