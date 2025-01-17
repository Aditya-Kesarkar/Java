import java.util.Scanner;

interface Calculator {
    void add(Scanner sc);
    void sub(Scanner sc);
    void multiply(Scanner sc);
    void divide(Scanner sc);
}

class myCalculator implements Calculator {
    @Override
    public void add(Scanner sc) {
        System.out.println("The sum of 10 and 5 is " + (10 + 5));
    }
    @Override
    public void sub(Scanner sc) {
        System.out.println("The sum of 10 and 7 is " + (10 - 7));
    }
    @Override
    public void multiply(Scanner sc) {
        System.out.println("The product of 4 and 3 is " + (4 * 3));
    }
    @Override
    public void divide(Scanner sc) {
        System.out.println("The division of 8 and 2 is " + (8 / 2));
    }
}

class myCalculator2 implements Calculator {
    @Override
    public void add(Scanner sc) {
        int a, b;
        System.out.println("Enter 2 numbers whose sum is needed.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }
    @Override
    public void sub(Scanner sc) {
        int a, b;
        System.out.println("Enter 2 numbers whose difference is needed.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
    }
    @Override
    public void multiply(Scanner sc) {
        int a, b;
        System.out.println("Enter 2 numbers whose product is needed.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
    }
    @Override
    public void divide(Scanner sc) {
        int a, b;
        System.out.println("Enter 2 numbers whose division is needed.");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            System.out.println("The quotient of " + a + " divided by " + b + " is " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Division by Zero, not valid!");
        }
    }
}

public class Interface_AbstractMethods {
    public static void main(String[] args) {
        System.out.println("Interfaces and methods!");
        Scanner sc = new Scanner(System.in);
        Calculator calci = new myCalculator();
        
        getCalci(calci, sc);
        getCalci(new myCalculator2(), sc);
    }
    
    public static void getCalci(Calculator ref, Scanner sc) {
            ref.add(sc);
            ref.sub(sc);
            ref.multiply(sc);
            ref.divide(sc);
    }
}