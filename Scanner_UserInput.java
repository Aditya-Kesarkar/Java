import java.util.Scanner;

class Scanner_UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating object of Scanner class
        System.out.println("Enter a byte value."); // Display a msg to the user
        byte a = scan.nextByte(); // Reading the byte value & storing in byte type variable
        System.out.println("Enter a short value."); 
        short b = scan.nextShort();
        
        System.out.println("Enter an int value."); 
        int c = scan.nextInt();
        
        System.out.println("Enter a long value."); 
        long d = scan.nextLong();
        
        System.out.println("Enter an float value."); 
        float e = scan.nextFloat();
        
        System.out.println("Enter a double value."); 
        double f = scan.nextDouble();
        
        System.out.println("Enter a boolean value."); 
        boolean g = scan.nextBoolean();
        
        System.out.println("Enter a char value."); 
        char h = scan.next().charAt(0);  // Reading a char in java
        
        System.out.println("Enter a string word value."); 
        String i = scan.next(); //  for word input use next(), it can't read space 
        System.out.println("Enter a string sentence value."); 
        String j = scan.nextLine(); //  for word input use next(), it can read spaces or anything.
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}