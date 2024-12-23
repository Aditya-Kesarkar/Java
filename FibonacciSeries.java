import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();
        
        // Handle invalid input
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series up to " + terms + " terms:");
            printFibonacciSeries(terms);
            fibonacci(terms);
        }
        
        scanner.close();
    }
    
    public static void printFibonacciSeries(int terms) {
        int first = 0, second = 1; // Initial two numbers of the Fibonacci series
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " "); // Print the current number
            int next = first + second;    // Calculate the next number
            first = second;               // Update the first number
            second = next;                // Update the second number
        }
        System.out.println();
    }
    
    public static void fibonacci(int maxNum) {
    int first = 0, second = 1, next = 0;

    // Start the Fibonacci series
    System.out.print("Fibonacci series up to " + maxNum + ": " + first);

    // Handle the case where the maxNum is at least 1
    if (maxNum > 0) {
        System.out.print(" " + second); // Print the second term
    }

    // Generate the Fibonacci series while the next number is less than maxNum
    while (next < maxNum) {
        next = first + second;

        // Only print if the next term is less than maxNum
        if (next < maxNum) {
            System.out.print(" " + next);
        }

        // Move to the next terms
        first = second;
        second = next;
    }

    System.out.println(); // Move to the next line after printing the series
}

}
