class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 11; i++)
        {
            sum += i;
            System.out.println("Sum of 1 to " + i + ": " + sum);
        }
            
        System.out.println("\n" + "Hence, Sum of 1 to 10: " + sum);
    }
}