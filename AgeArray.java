import java.util.Scanner;

// Class to handle employee age management
class EmployeeAge {
    static int[] employeeAges; // Static array to store employee ages. "Static methods operate at the class level and can be called without creating an object. They use static variables or other static methods for operation."

    // Static method to take input for employee ages
    public static void inputAges(Scanner sc) {
        System.out.println("Enter the number of employees: ");
        employeeAges = new int[sc.nextInt()]; // Initialize array based on employee count

        // Loop to populate employee ages
        for (int i = 0; i < employeeAges.length; i++) {
            System.out.print("Enter the age of employee " + (i + 1) + ": ");
            employeeAges[i] = sc.nextInt(); // Store age of each employee
        }
    }

    // Non-static method to display employee ages
    public void displayAges() {
        for (int i = 0; i < employeeAges.length; i++) {
            System.out.println("The age of employee " + (i + 1) + " is: " + employeeAges[i]);
        }
    }
}

// Main class to execute the program
public class AgeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        EmployeeAge.inputAges(sc); // Static method call without an object

        EmployeeAge eAge = new EmployeeAge(); // Create an object to call non-static methods "Non-static methods require an object to invoke, as they operate on specific instances of the class."
        eAge.displayAges(); // Non-static method call
    }
}
