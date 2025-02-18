import java.util.Scanner;
import java.util.Arrays;

public class Anagrams_withInbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input strings
        System.out.println("Enter two strings to check if they are anagrams:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Normalize strings by removing spaces and converting to lowercase
        // This ensures that the comparison is case-insensitive and ignores extra spaces
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        // Quick check: if lengths differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            // Length check ensures that strings with different lengths cannot be anagrams
            System.out.println("The given strings are NOT anagrams!");
            return;
        }

        // Convert strings to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sorting arrays is a simple approach; for larger strings, a frequency count might be more efficient
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if sorted arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings ARE anagrams! (\"" + str1 + "\" and \"" + str2 + "\")");
        } else {
            System.out.println("The given strings are NOT anagrams!");
        }

        sc.close();
    }
}
