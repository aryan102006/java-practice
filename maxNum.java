import java.util.Scanner;

public class maxNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to compare: ");

		int x = scan.nextInt();

		System.out.println("Enter numbers: ");
		int a[] = new int[x];
		for (int i = 0; i<x; i++){
			a[i] = scan.nextInt();
		}
		
	}
}
