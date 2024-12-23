import java.util.Scanner;

public class Factorial_Sum_Factors
{
	public static void main(String[] args) {
		System.out.println("Enter a positive integer!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		factorial(num);
		sc.close();
	}
	
	public static void factorial(int n) { // For the Factorial of the number!
	    int prod = 1;
	    
	    for (int i = 1; i <= n; i++) {
	        prod *= i;
	    }
	    
	    System.out.println("The Factorial of " + n + " is " + prod);
	    sumOf(prod, n);
	}
	
	public static void sumOf(int num, int n) {   // For sum of digits of the factorial!
	    int sum = 0, temp = num;
	    
	    while (temp > 0) {
	        sum += temp % 10;
	        temp = temp / 10;
	    }
	    System.out.println("The sum of " + num + " is " + sum);
	    factors(sum, n);
	}
	
	public static void factors(int sum, int n) {  // For factors of the factorial!
	    int fact = 1;
	    System.out.println("The factors of " + sum + " are:");
	    
	    for (int i = 1; i <= sum; i++) {
	        
	        if (sum % i == 0) {
	            System.out.print(" " + i + " ");
	        }
	    }
	    System.out.println();
	    
	    if (sum % n == 0) {
	       System.out.println(n + " is one of the factors of " + sum);
	        }
	        else System.out.println(n + " is not one of the factors of " + sum);
	}
}