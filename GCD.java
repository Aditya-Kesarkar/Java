// Write a JP to find the GCD of given numbers using Recursive functions! and non recursive!
import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        System.out.println("Program to find the GCD of a number using Eucledian algorithm!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers whose GCD is to be found!");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int gcd = GCD.recursiveGcd(m, n);
        System.out.println("Program to find the GCD using Recursive approach!");
        System.out.println("The GCD of " + m + " & " + n + " is " + gcd);
        
        int gcd1 = GCD.getGcd(m, n);
        System.out.println("The GCD of " + m + " & " + n + " is " + gcd1);
    }
}

class GCD {
    // recursive
    public static int recursiveGcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        
        if (b == 0) {
            return a;
        }
        return recursiveGcd(b, a % b);
    }
    
    // non-recursive
    public static int getGcd(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        System.out.println("Program to find the GCD (non-recursive) of a number using Eucledian algorithm!");
        
        while (n != 0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    } 
}