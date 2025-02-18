import java.util.Scanner;

public class Capitalize {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Ask user for input sentence
        System.out.println("Enter a string");
        String str = sc.nextLine();
        char[] arr = str. toCharArray();
        // TODO: Capitalize the first letter of each word
        for (int i = 0 ; i < str.length(); i++) {
            if (i == 0) {
                arr[i] = (char)(arr[i] - 32);
            }
            if (arr[i] == ' ') {
                arr[i+1] = (char)(arr[i+1] - 32);
            }
        }    
        // TODO: Print the updated sentence with first characters of words capitalized
        String str1 = new String(arr);
        System. out.println(str1);
        sc.close();
    }    
}