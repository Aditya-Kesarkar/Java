import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
    
    // Use Scanner to take user input
    
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        int power = powers (number);
        
        Armstrong(number, power);
    
    }
    
    public static int powers(int num) {
        int count = 0;
        
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
    
    public static void Armstrong(int num, int power) {
        int digit = 0, sum = 0, temp = num;
    
        while (temp > 0) {
        digit = temp % 10;
        temp = temp / 10;
        
        int pow = powerUp (digit, power);
        sum = sum + pow;
        }
        
        if (sum == num) {
        System.out.println(num + " is an Armstrong number.");
        } 
        else System.out.println(num + " is not an Armstrong number.");
        
    }
    
    public static int powerUp (int num, int power) {
        int res = 1;

    for (int i = 0; i < power; i++) {
        res = num * res;
    }
    return res;
    }
    
}
