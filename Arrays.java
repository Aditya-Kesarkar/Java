import java.util.Scanner;

// Class to manage student marks
class StudentMarks {
    int n; // Number of students
    int[] arr; // Array to store marks of students

    // Constructor to initialize the array
    public StudentMarks(int n) {
        this.n = n;
        this.arr = new int[n];
    }

    // Method to populate data into the array
    public void data(Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            arr[i] = sc.nextInt(); // Take input for each student's marks
        }
    }

    // Method to display the data of the array
    public void displayData() {
        for (int i = 0; i < n; i++) {
            System.out.println("Marks of Student " + (i + 1) + " are: " + arr[i]);
        }
    }
}

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Array program!");
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.println("Enter the number of students:");
        int n = sc.nextInt(); // Number of students

        // Creating an object of StudentMarks with the input size
        StudentMarks stMks = new StudentMarks(n);

        // Populate the array with marks
        stMks.data(sc);

        // Display the marks of all students
        stMks.displayData();
    }
}


// Why did you pass Scanner as a parameter to the data method?
// To ensure the method can read input from the user without creating a new Scanner instance unnecessarily, improving code modularity.

// How would you handle invalid input (e.g., non-numeric values)?
// Add input validation using sc.hasNextInt() before reading input to ensure only integers are accepted.

// Can this program handle dynamic input sizes?
// Yes, the array size is defined at runtime based on user input for the number of students.

// Q: Why are constructors important in Java?
// A: Constructors are special methods used to initialize objects in Java. They are important because:
// Automatic Initialization: They allow for automatic assignment of values to object attributes when an object is created.
// Encapsulation: Constructors enforce encapsulation by setting initial values of private fields.
// Overloading Support: Constructors can be overloaded, enabling flexibility in object creation with varying parameters.
// Code Clarity: By using constructors, the creation and initialization logic is clearly separated, improving readability.

// Q: Why is it necessary to initialize variables before use?
// A: Default Behavior: Java does not automatically initialize local variables (unlike instance variables). Using an uninitialized variable leads to a compile-time error.
// Avoid Undefined Behavior: Uninitialized variables can lead to unpredictable results in the program.
// Logical Consistency: Initializing variables ensures that they have meaningful values, maintaining program correctness.