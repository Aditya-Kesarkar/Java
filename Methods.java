class Methods {
    public static void main(String[] args) {
        int n1 = 40, n2 = 20;
        add();
        sub(n1, n2);
        int prod = mul();
        int quot = div(n1, n2);
        int remain = mod(n1, n2);
        System.out.println("\n" + "With the use of variables: " + "\n" +  prod + "\n" + quot + "\n" + remain);
        System.out.println("\n" + "Without the use of variables: " + "\n" +  mul() + "\n" + div(n1, n2) + "\n" + mod(n1, n2));
    }
    
    static void add() // method without parameters and return type i.e void type
    {
        int a = 10, b = 20;
        int result = a + b;
        System.out.println(result);
    }
    
    static void sub( int a, int b) // method with parameters but no return type i.e void type
    {
      int sub = a - b;
      System.out.println(sub);
    }
    
    static int mul() // method without parameters but return type 
    {
        int a = 5, b = 10;
        int product = a * b;
        return product;
    }
    
    static int div (int a, int b) // method with parameters and return type
    {
        int quotient = a / b;
        return quotient;
    }
    
    static int mod (int a, int b)
    {
        int remain = a % b;
        return remain;
    }
}