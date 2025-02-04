import java.util.Scanner;

public class Avg3D_Column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Program to calculate the Average of each 3D column in a 3D matrix!");

        // Step 1: Ask user for dimensions and create the 3D array
        System.out.print("Enter depth (number of layers): ");
        int depth = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][][] arr = new int[depth][rows][cols]; // 3D array initialization

        // Step 2: Populate the array with user input
        System.out.println("\nEnter elements for the 3D array:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Layer " + (d + 1) + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    arr[d][r][c] = sc.nextInt();
                }
            }
        }

        // Step 3: Print the 3D array
        System.out.println("\n3D Array:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Layer " + (d + 1) + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(arr[d][r][c] + " ");
                }
                System.out.println();
            }
        }

        // Step 4: Calculate and print the average of each 3D column
        System.out.println("\nColumn-wise Averages:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int sum = 0;
                for (int d = 0; d < depth; d++) { // Summing across layers for the same (row, column)
                    sum += arr[d][r][c];
                }
                double avg = (double) sum / depth; // Compute average
                System.out.println("Average of column (" + r + "," + c + "): " + avg);
            }
        }

        sc.close(); // Close Scanner
    }
}
