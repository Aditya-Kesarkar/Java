import java.util.Scanner;
abstract class Shape {
    double area;
    abstract public void calculateArea();
    public void display() {
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    double len, breadth;
    // Constructor to accept input
    public Rectangle(Scanner sc) {
        System.out.println("Enter the length and breadth of the rectangle:");
        len = sc.nextDouble();
        breadth = sc.nextDouble();
    }
    
    public void calculateArea() {
        area = len * breadth; 
    }
}

class Square extends Shape {
    double len;
    // Constructor to accept input
    public Square(Scanner sc) {
        System.out.println("Enter the side length of the square:");
        len = sc.nextDouble();
    }

    public void calculateArea() {
        area = len * len; 
    }
}

class Circle extends Shape {
    double radius;
    // Constructor to accept input
    public Circle(Scanner sc) {
        System.out.println("Enter the radius of the circle:");
        radius = sc.nextDouble();
    }
    
    public void calculateArea() {
        area = Math.PI * radius * radius; 
    }
}

class Abstraction {
    public static void main(String[] args) {
        System.out.println("This program depicts the usage of, Abstraction, Polymorphism, Method-Overriding and overloading");
        Scanner sc = new Scanner(System.in);
        accessMethods(new Rectangle(sc));
        accessMethods(new Square(sc));
        accessMethods(new Circle(sc));
    }
    
    public static void accessMethods(Shape ref) {
        ref.calculateArea();
        ref.display();
        System.out.println("---------------------------------------------------");
    }
}