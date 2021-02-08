import java.util.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class methods {
	static void maths() {

		String problem1 = "\n232432 + 324244 * 0";
		int sol1 = 232432 + 324244 * 0;					//Output 232432
		String problem2 = "\n100 * 100 + 10";
		int sol2 = 100 * 100 + 10;						//Output 10010
		String problem3 = "\n600 / 1 + 1";
		int sol3 = 600 / 1 + 1;							//Output 601

		String compMath1 = "\nCorrect!";
		String compMath2 = "\nWrong!";

		Scanner mt1 = new Scanner(System.in);
		System.out.println(problem1);
		int int1 = mt1.nextInt();

		if (int1 == sol1) {
			System.out.println(compMath1);
		}
		else {
			System.out.println(compMath2);
		}

		Scanner mt2 = new Scanner(System.in);
		System.out.println(problem2);
		int int2 = mt2.nextInt();

		if (int2 == sol2) {
			System.out.println(compMath1);
		}
		else {
			System.out.println(compMath2);
		}

		Scanner mt3 = new Scanner(System.in);
		System.out.println(problem3);
		int int3 = mt3.nextInt();

		if (int3 == sol3) {
			System.out.println(compMath1);
		}
		else {
			System.out.println(compMath2);
		}

		if (int1 == sol1 && int2 == sol2 && int3 == sol3) {
			System.out.println("You scored 3/3. Good!");
		}
		else if (int1 != sol1 && int2 == sol2 && int3 == sol3) {
			System.out.println("You scored 2/3. Better!");
		}
		else if (int1 != sol1 && int2 != sol2 && int3 == sol3) {
			System.out.println("You scored 1/3. Bad!");
		}
		else if (int1 != sol1 && int2 != sol2 && int3 != sol3) {
			System.out.println("You scored 0/3. Very Bad!");
		}
		else if (int1 == sol1 && int2 != sol2 && int3 != sol3) {
			System.out.println("You scored 1/3. Bad!");
		}	
		else if (int1 != sol1 && int2 == sol2 && int3 != sol3) {
			System.out.println("You scored 1/3. Bad!");
		}
		else if (int1 == sol1 && int2 == sol2 && int3 != sol3) {
			System.out.println("You scored 2/3. Better!");
		}
		else {
			System.out.println("You scored 1/3. Bad!");
		}				
	}
	static void gk() {

		String quest1 = "\nWhich Programming language are you doing now ? \n1. Java \n2. Python";
		int[] ans1 = {1, 2};
		String quest2 = "\nHow to define a user Input ? Name it. \n1. Class \n2. Scanner";
		int[] ans2 = {1, 2};
		String quest3 = "\nName the non-programming language which is used to build webs ?\n1. C# \n2. HTML";
		int[] ans3 = {1, 2};

		String comp1 = "\nCorrect!";
		String comp2 = "\nWrong!";

		Scanner sc1 = new Scanner(System.in);
		System.out.println(quest1);
		int imp1 = sc1.nextInt();

		if (imp1 == ans1[0]) {
			System.out.println(comp1);
		}
		else {
			System.out.println(comp2);
		}

		Scanner sc2 = new Scanner(System.in);
		System.out.println(quest2);
		int imp2 = sc2.nextInt();

		if (imp2 == ans2[1]) {
			System.out.println(comp1);
		}
		else {
			System.out.println(comp2);
		}

		Scanner sc3 = new Scanner(System.in);
		System.out.println(quest3);
		int imp3 = sc3.nextInt();

		if (imp3 == ans3[1]) {
			System.out.println(comp1);
		}
		else {
			System.out.println(comp2);
		}
		if (imp1 == ans1[0] && imp2 == ans2[1] && imp3 == ans3[1]) {
			System.out.println("You scored 3/3. Good!");
		}
		else if (imp1 != ans1[0] && imp2 == ans2[1] && imp3 == ans3[1]) {
			System.out.println("You scored 2/3. Better!");
		}
		else if (imp1 != ans1[0] && imp2 != ans2[1] && imp3 == ans3[1]) {
			System.out.println("You scored 1/3. Bad!");
		}
		else if (imp1 != ans1[0] && imp2 != ans2[1] && imp3 != ans3[1]) {
			System.out.println("You scored 0/3. Very Bad!");
		}
		else if (imp1 == ans1[0] && imp2 != ans2[1] && imp3 != ans3[1]) {
			System.out.println("You scored 1/3. Bad!");
		}	
		else if (imp1 != ans1[0] && imp2 == ans2[1] && imp3 != ans3[1]) {
			System.out.println("You scored 1/3. Bad!");
		}
		else if (imp1 == ans1[0] && imp2 == ans2[1] && imp3 != ans3[1]) {
			System.out.println("You scored 2/3. Better!");
		}
		else {
			System.out.println("You scored 1/3. Bad!");
		}				
	}
	public static void main(String[] args) throws InterruptedException {

		int x = 1;
		int y = 2;
		int z = 10;

		for (int i = 10; i < 11; i++) {
			System.out.println(i);
		}

		Scanner ss1 = new Scanner(System.in);
		System.out.println("\nEnter your name:");
		String import1 = ss1.nextLine();
		System.out.println("\nWelcome! " + import1 + " Let's start.\n");

		System.out.println("Loading  1%");
		Thread.sleep(200);
		System.out.println("Loading 10%");
		Thread.sleep(200);
		System.out.println("Loading 20%");
		Thread.sleep(200);
		System.out.println("Loading 30%");
		Thread.sleep(200);
		System.out.println("Loading 40%");
		Thread.sleep(200);
		System.out.println("Loading 50%");
		Thread.sleep(200);
		System.out.println("Loading 60%");
		Thread.sleep(200);
		System.out.println("Loading 70%");
		Thread.sleep(200);
		System.out.println("Loading 80%");
		Thread.sleep(200);
		System.out.println("Loading 90%");
		Thread.sleep(200);
		System.out.println("Loading 100%");
		Thread.sleep(200);

		System.out.println("\nLoaded Successfully!\n");


		Scanner ss2 = new Scanner(System.in);
		System.out.println("What do you want to choose ?\n1) Maths\n2) Quiz\n");
		int import2 = ss2.nextInt();

		if (import2 == x) {
			System.out.println("\nOk! You have choosen Maths.");
			maths();
		}
		else if (import2 == y) {
			System.out.println("\nOk! You have choosen Quiz. All answers should be in 1 word.");
			gk();
		}
		else {
			System.out.println("\nInvalid Input! Type between 1 or 2.");
			System.out.println("Now Begi")
		}		
	}
}
