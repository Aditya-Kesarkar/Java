class NumberPattern {
    public static void main(String[] args) {
        System.out.println("\t! Pattern Printing !");
        
        int rows = 4;  // Number of rows
        int cols = 4;  // Number of columns
        int number = 1; // Starting number

        for (int i = 1; i <= rows; i++) { // Loop for rows
            for (int j = 1; j <= cols; j++) { // Loop for columns
                if (number < 10) {
                    System.out.print("0" + number + " "); // Print single-digit numbers with a leading 0
                } else {
                    System.out.print(number + " "); // Print numbers as-is
                }
                number++; // Increment the number
            }
            System.out.println(); // Move to the next row
        }
    }
}
