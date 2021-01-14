import java.util.Scanner;

public class factorial {

	public static void fact(int x) {
		int f = 1;
		for (int i = x; i >0; i--) {
			f = f*i;
		}
		System.out.println(f);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int num = scanner.nextInt();

		fact(num);
	}
}
