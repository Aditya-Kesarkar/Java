class Calculator
{
	// no return value + no arguments
	public static void add()
	{
		int a = 10, b = 20;
		System.out.println("Addition of two No's (10 & 20) is : " + (a+b));	
	}

	// no return value + arguments
	public static void sub(int a, int b)
	{
		System.out.println("Subtraction of two No's " + a  + " & " + b + " is : " + (a-b));
	}

	// return value + arguments
	public static int mul(int a, int b)
	{
		int prod = a*b;
		return prod;	
	}

	// return value + no arguments
	public static double div()
	{
		double a = 10.0, b = 5.0;
		double quot = a/b;
		return quot;
	}
}

public class Calci
{
	public static void main(String[] args)
	{
		Calculator.add();
		Calculator.sub(10, 5);
		int prod = Calculator.mul(20, 10);
		System.out.println("Product = " + prod);
// 		System.out.println("Multiplication of two No's " + a  + " & " + b + " is : " + (a-b));
		double q = Calculator.div();
		System.out.println("Quotient = " + q);
// 		System.out.println("Division of two No's " + a  + " & " + b + " is : " + (a-b));
	}
}