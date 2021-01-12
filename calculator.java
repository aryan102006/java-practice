import java.util.Scanner;

public class calculator {
	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter a number: ");

		double num1 = myScan.nextDouble();
		double num2 = myScan.nextDouble();
		double result;


		System.out.println("Choose an Operator: +, -, *, /");
		char op = myScan.next().charAt(0);

		switch(op){

			case '+':
				result = add(num1, num2);
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("Please Enter a valid operator");
				return;

		} 

		System.out.println((int)num1+ " " + op + " " + (int)num2 + " " + "= " + (int)result);
	}
}
