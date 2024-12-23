import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        System.out.println("! Rectangular pattern printing using nested loops !");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i < n; i++) {
            for (int j = 1; j < n+3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("! Numerical pattern printing using nested loops !");
        System.out.print("Enter a number: ");
        int m = sc.nextInt();
        for (int i=1; i < m + 1; i++) {
            int j = 1;
            while(j < i + 1) {
            System.out.print(j);
            j++;
            }
            System.out.println("");
        }
        sc.close();
    }
}