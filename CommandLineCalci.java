class CommandLineCalci {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length < 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            System.out.println("Example: java CommandLineCalculator 10 + 5");
            return;
        }

        // Extracting arguments
        double num1 = Double.parseDouble(args[0]); // Convert first argument to a number
        String operator = args[1]; // Operator as string (+, -, *, /)
        double num2 = Double.parseDouble(args[2]); // Convert third argument to a number

        // Performing the calculation based on the operator
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator! Use +, -, *, or /.");
                return;
        }

        // Displaying the result
        System.out.println("Result: " + result);
    }
}
