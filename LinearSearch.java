import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to input the names of students
        System.out.println("Enter the names of students separated by spaces:");
        String[] students = sc.nextLine().split("\\s+");

        // Ask the user for the student's name they are searching for
        System.out.println("Enter the name of the student to search for:");
        String targetName = sc.nextLine();

        // Call the search method and print the result
        String result = searchStudent(students, targetName);
        System.out.println(result);
        sc.close(); 
    }

    // Linear search method
    public static String searchStudent(String[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(targetName)) {
                return "Student '" + targetName + "' found at position " + (i + 1);
            }
        }
        return "Student '" + targetName + "' not found.";
    }
}
