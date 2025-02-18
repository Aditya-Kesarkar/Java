import java.util.Scanner;

public class Permutations {
    // Method to generate permutations
    public static void generatePermutations(String str, String result) {
        // Base Case: If str is empty, print the current permutation
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        // Recursive Case: Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Choose one character
            char chosenChar = str.charAt(i);

            // Form a substring without the chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursively generate permutations for the remaining substring
            generatePermutations(remaining, result + chosenChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to generate permutations:");
        String input = sc.nextLine();

        System.out.println("All permutations of the string \"" + input + "\":");
        generatePermutations(input, "");
        sc.close();
    }
}
