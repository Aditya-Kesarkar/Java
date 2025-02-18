import java.util.Scanner;

class Arrays {
    // Method to set array elements
    public static void setArray(Scanner sc) {
        System.out.println("Enter the size of array:");
        int[] arr = new int[sc.nextInt()];  // Create array with user-defined size

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Input array elements
        }
        
        checkPrime(arr); // Call prime-checking function
    }
    
    // Method to check for prime numbers
    public static void checkPrime(int[] arr) {
        int count = 0;
        System.out.println("The prime numbers in the array are:");

        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");  // Print prime numbers
                count++;
            }
        }

        System.out.println("\nThe total primes in the array are: " + count);
    }
    
    // Efficient method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;  // since 0 and 1 are not prime numbers
        for (int i = 2; i * i <= num; i++) {  // Check only up to √num
            if (num % i == 0) return false;
        }
        return true;
    }
}

// Main class
class Check_Prime_Array {
    public static void main(String[] args) {
        System.out.println("Check prime numbers in an array");
        Scanner sc = new Scanner(System.in);
        
        Arrays.setArray(sc); // Call the function 
        sc.close();
    }
}
