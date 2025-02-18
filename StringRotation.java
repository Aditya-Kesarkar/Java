import java.util.Scanner;

class Rotate {
    // Right rotate the string by num positions
    public static void right(int num, String str) {
        num = num % str.length(); // Handle rotations greater than string length
        if (num < 0) num += str.length(); // Handle negative rotations
        String str1 = str.substring(str.length() - num) + str.substring(0, str.length() - num);
        System.out.println("The right rotated string for \"" + str + "\" is: " + str1);
    }

    // Left rotate the string by num positions
    public static void left(int num, String str) {
        num = num % str.length(); // Handle rotations greater than string length
        if (num < 0) num += str.length(); // Handle negative rotations
        String str2 = str.substring(num) + str.substring(0, num);
        System.out.println("The left rotated string for \"" + str + "\" is: " + str2);
    }
}

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("String Rotation!");
        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        // Validate string length
        if (st.isEmpty()) {
            System.out.println("Error: String cannot be empty.");
            sc.close();
            return;
        }

        System.out.print("Enter the positions to be shifted: ");
        int num = sc.nextInt();

        System.out.println("Enter:\n\t1 → Right-Rotation\n\t2 → Left-Rotation");
        int opt = sc.nextInt();

        switch (opt) {
            case 1 -> Rotate.right(num, st);
            case 2 -> Rotate.left(num, st);
            default -> System.out.println("Invalid choice! Please select 1 or 2.");
        }

        sc.close();
    }
}
