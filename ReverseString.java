import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String rev = new String();

		String str = scan.nextLine();

		int len = str.length();

		for (int i = len-1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println(rev);
	}
}
