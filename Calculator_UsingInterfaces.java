import java.util.Scanner;

// Calculator Interface with standard method definitions
interface Calculator {
    void add(Scanner sc);
    void sub(Scanner sc);
    void multiply(Scanner sc);
    void divide(Scanner sc);
}

// myCalculator class with predefined calculations
class myCalculator implements Calculator {
    @Override
    public void add(Scanner sc) {
        System.out.println("The sum of 10 and 5 is " + (10 + 5));
    }

    @Override
    public void sub(Scanner sc) {
        System.out.println("The difference of 10 and 7 is " + (10 - 7));
    }

    @Override
    public void multiply(Scanner sc) {
        System.out.println("The product of 4 and 3 is " + (4 * 3));
    }

    @Override
    public void divide(Scanner sc) {
        System.out.println("The quotient of 8 divided by 2 is " + (8 / 2));
    }
}

// myCalculator2 class with user-input-based calculations
class myCalculator2 implements Calculator {
    @Override
    public void add(Scanner sc) {
        System.out.println("Enter two numbers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }

    @Override
    public void sub(Scanner sc) {
        System.out.println("Enter two numbers to subtract:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
    }

    @Override
    public void multiply(Scanner sc) {
        System.out.println("Enter two numbers to multiply:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
    }

    @Override
    public void divide(Scanner sc) {
        System.out.println("Enter two numbers to divide:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b != 0) {
            System.out.println("The quotient of " + a + " divided by " + b + " is " + (a / b));
        } else {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}

// Main class to test the calculators
public class Calculator_UsingInterfaces {
    public static void main(String[] args) {
        System.out.println("Interfaces and Methods Demo!");
        Scanner sc = new Scanner(System.in);

        // Using predefined calculations
        Calculator calci1 = new myCalculator();
        System.out.println("Using myCalculator:");
        performCalculations(calci1, sc);

        // Using user-input-based calculations
        Calculator calci2 = new myCalculator2();
        System.out.println("\nUsing myCalculator2:");
        performCalculations(calci2, sc);

        sc.close();
    }

    // Method to perform calculations using a Calculator object
    public static void performCalculations(Calculator calculator, Scanner sc) {
        calculator.add(sc);
        calculator.sub(sc);
        calculator.multiply(sc);
        calculator.divide(sc);
    }
}
