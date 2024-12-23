public class TernaryOperator {
    public static void main(String[] args) {
        // Hardcoded input
        int number = 12; // You can change this value for testing different cases

        // Using Ternary Operator
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}