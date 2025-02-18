import java.util.Scanner;

class Program {
    static int[][][] arr;  // 3D jagged array declaration
    
    // Method to initialize the 3D jagged array
    static void setArray(Scanner scan) {
        System.out.print("Enter the number of schools: ");
        int schools = scan.nextInt();
        arr = new int[schools][][]; // Initialize first dimension (depth)
        
        for (int i = 0; i < schools; i++) {
            System.out.print("Enter the total classes in school " + (i + 1) + ": ");
            int classes = scan.nextInt();
            arr[i] = new int[classes][]; // Initialize second dimension (rows)
            
            for (int j = 0; j < classes; j++) {
                System.out.print("Enter the number of students in class " + (j + 1) + " of school " + (i + 1) + ": ");
                int strength = scan.nextInt();
                arr[i][j] = new int[strength]; // Initialize third dimension (columns)
            }
        }
    }

    // Method to populate the 3D array
    static void populateArray(Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("Enter data for School " + (i + 1) + ", Class " + (j + 1) + ", Student " + (k + 1) + ": ");
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
    }

    // Method to display the 3D array contents
    static void displayArray() {
        System.out.println("\nDisplaying Stored Data:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("School " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("  Class " + (j + 1) + ": ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println(); // Move to next line for better formatting
            }
        }
    }
}

// Main class to run the program
class Jagged_3D_Array {
    public static void main(String[] args) {
        System.out.println("Jagged 3D Array Program!");
        Scanner sc = new Scanner(System.in);
        
        Program.setArray(sc);  // Initialize the array
        Program.populateArray(sc);  // Populate the array with user input
        Program.displayArray();  // Display the stored data
        
        sc.close(); // Close Scanner to prevent memory leak
    }
}
