import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String result = "";
		if (i % 3 == 0) {
				result += "Fizz";
		}
		if (i % 5 == 0) {
			result += "Buzz";
		}
		if (result.equals("")) {
			result = Integer.toString(i);
		}
		System.out.println(result);
	}
}	
