import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its reverse (Decimals not allowed) : ");    // say 1234 ! 
        int number = sc.nextInt();
        reverseNum(number);
        sc.close();
    }
    
    public static void reverseNum(int num) {
        int reverse = 0; 
        int temp = num;
        
        while (temp > 0) {
            reverse += temp % 10; // to get the last digit and append it to reverse!    --> 1234 % 10 = 4 !!
            temp = temp / 10; // to remove the last digit and storing remaining digits ! --> 1234 / 10 = 123 !! 
            
            if (temp > 0) {
                reverse = reverse * 10; 
                /* to continue reversed sequence, --> 4 * 10= 40 ,then reverse is 40, later in "while" reverse (40) + 3 = 43 , --> in if 43 * 10 = 430 and so on till the reverse i.e 4321 is reached !  */
            }
        }
        System.out.println("The reverse of the number " + num + " is " + reverse);
        
        if (num == reverse) {
            System.out.print(" and is a Palandromic number!");
        }
        else System.out.print(" and is not a Palandromic number!");
    } 
}