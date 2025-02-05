import java.util.Scanner;
// Brute-Force Approach!

/* class FindPairs {
    private int[] arr;  // Instance variable to hold the array

    // Method to take user input for the array
    public void arrayInput(Scanner sc) {
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        arr = new int[size]; // Initialize array with user-defined size
        
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to find and display pairs with a given target sum
    public void displayPairs(Scanner sc) {
        System.out.print("Enter the target value: ");  
        int target = sc.nextInt();
        int count = 0;

        System.out.println("The pairs whose sum equals " + target + " are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println("Total pairs found: " + count);
    }
}

public class Array_Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating an instance of FindPairs
        FindPairs pairsFinder = new FindPairs();
        
        // Calling methods to take input and find pairs
        pairsFinder.arrayInput(sc);
        pairsFinder.displayPairs(sc);
        
        sc.close(); // Close scanner to prevent resource leaks
    }
}  */

// 2-Pointer Approach!

class FindPairs {
    private int[] arr;  // Instance variable to hold the array

    // Method to take user input for the array
    public void arrayInput(Scanner sc) {
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        arr = new int[size]; // Initialize array with user-defined size
        
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to find and display pairs(using 2-Pointer Approach) 
    public void displayPairs(Scanner sc) {
        System.out.print("Enter the target value: ");  
        int target = sc.nextInt();
        int count = 0;

        System.out.println("The pairs whose sum equals " + target + " are: ");
        int le = 0;
        int ri = arr.length - 1;
        int sum = arr[le] + arr[ri];
        while (le < ri) {
            if (sum == target) {
                System.out.println("(" + arr[le] + ", " + arr[ri] + ")");
                    count++;
                    le++;
                    ri--;
            } 
            else if (sum < target) {
                le++;
            }
            else {
                ri--;
            }
        }
        System.out.println("Total pairs found: " + count);
    }
}

public class Array_Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating an instance of FindPairs
        FindPairs pairsFinder = new FindPairs();
        
        // Calling methods to take input and find pairs
        pairsFinder.arrayInput(sc);
        pairsFinder.displayPairs(sc);
        
        sc.close(); // Close scanner to prevent resource leaks
    }
}
