import java.util.Scanner;

// Class to handle employee age management using a 2D array
class EmployeeAge {
    int[][] arr; // 2D array to store employee ages
    
    // Method to input employee ages
    void inputAges(Scanner sc) {
        System.out.println("Enter the number of rows and columns for the 2D array: ");
        int rows = sc.nextInt(); // Number of rows
        int cols = sc.nextInt(); // Number of columns
        arr = new int[rows][cols]; // Initialize the 2D array

        // Nested loop to populate employee ages
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the age of employee at row " + i + " and column " + j + ": ");
                int age = sc.nextInt();
                
                // Validate input for age
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
public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        EmployeeAge eAge = new EmployeeAge(); // Create an instance of EmployeeAge
        
        // Input and display ages
        eAge.inputAges(sc); 
        eAge.displayAges();
    }
}
