import java.util.Scanner;

// Class to handle employee age management using a jagged array
class JaggedArray {
    int[][] arr; // Jagged array to store employee ages

    // Method to input employee ages
    void inputSize(Scanner sc) {
        System.out.println("Enter the number of rows for the jagged array: ");
        int rows = sc.nextInt(); // Number of rows
        arr = new int[rows][];   // Initialize jagged array

        // Loop to set row sizes
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + i + ": ");
            int cols = sc.nextInt();

            // Validate column size
            while (cols <= 0) {
                System.out.print("Invalid size. Enter a positive number of columns for row " + i + ": ");
                cols = sc.nextInt();
            }
            arr[i] = new int[cols]; // Allocate columns for the current row
        }

        // Nested loop to populate employee ages
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the age of employee at row " + i + " and column " + j + ": ");
                int age = sc.nextInt();

                // Validate age input
                while (age < 0) {
                    System.out.print("Invalid age. Enter a positive value: ");
                    age = sc.nextInt();
                }
                arr[i][j] = age; // Store the validated age
            }
        }
    }

    // Method to display employee ages
    void displayAges() {
        System.out.println("\nDisplaying employee ages:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("The age of employee at row " + i + " and column " + j + " is: " + arr[i][j]);
            }
        }
    }
}

// Main class to execute the program
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        JaggedArray jArr = new JaggedArray(); // Create an instance of JaggedArray

        // Input and display employee ages
        jArr.inputSize(sc); 
        jArr.displayAges();

        sc.close(); // Close the scanner to release resources
    }
}
