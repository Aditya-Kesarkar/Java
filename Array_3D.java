import java.util.Scanner;

class Program {
    static int[][][] arr;
    
    static void setArray(Scanner scan) {
        System.out.print("Enter the number of schools: ");
        int schools = scan.nextInt();
        System.out.print("Enter the total classes in schools: ");
        int classes = scan.nextInt();
        System.out.print("Enter the strength of each class: ");
        int strength = scan.nextInt();
        arr = new int[schools][classes][strength];
    } 
    
    static void populateArray(Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                        System.out.println("Enter data at depth: " + i + ", row: " + j + ", column: " + k);
                        arr[i][j][k] = scan.nextInt();
                }
            }
        }
        
    }
    
    static void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                        System.out.println("Value at depth: " + i + ", row: " + j + ", column: " + k + ": " + arr[i][j][k]);
                }
                System.out.println();
            }
        }
    }
    
}

class Array_3D {
    public static void main(String[] args) {
        System.out.println("3-D array!");
        Scanner sc = new Scanner(System.in);
        Program.setArray(sc);
        Program.populateArray(sc);
        Program.displayArray();
    }
}