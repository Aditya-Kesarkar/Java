import java.util.Scanner;

class Vowel_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str = sc.nextLine();
        segregate(str);
    }
    
    public static void segregate(String str) {
        StringBuilder vow = new StringBuilder();
        StringBuilder con = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String vowels = "AEIOUaeiou";
            //string.contains(String.valueOf(ch)); .contains() -> accepts only a char-sequence i.e a String;
            if (vowels.contains(String.valueOf(ch))) {
                vow.append(ch); 
		/ another approach to reverse a string is, 
			String st = "";
		  	for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
		 		st = ch + st; 
			}
		*/  
            }
            else {
                con.append(ch);
            }
        }
        System.out.println("The given input String is: " + str);
        System.out.println("The consonants from the given above String are: " + con.toString());
        System.out.println("The vowels in reverse from the above String are: " + vow.reverse().toString());
    }
}