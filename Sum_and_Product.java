import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To get sum of the integer partr of a floating point number!");
        float num = sc.nextFloat();
        sumOf(num);
        productOf(num);
    }
    
    public static void sumOf(float num) {
        int num1 = (int)num;
        int sum = 0;
        
        while(num1 > 0) {
            sum += num1 % 10;
            num1 = num1 / 10;
            
        }
        System.out.print(sum);
    }
    
    public static void productOf(float num) {
        int num1 = (int)num;
        int prod = 1;
        
        while(num1 > 0) {
            prod *= num1 % 10;
            num1 = num1 / 10;
            
        }
        System.out.print("The product of the integer part is " + prod);
    }
}