import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		String prompt = reader.nextLine();
		char character = prompt.charAt(0);
		System.out.println(character);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		boolean input = reader.nextBoolean();
		System.out.println(!input);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		int integerin = reader.nextInt();
		if (integerin > 5) { 
		System.out.println(true); }
		else 
		{ System.out.println(false); }
	}

	public static void q4() {
		//Write question 4 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		double doublein = reader.nextDouble();
		if (doublein >= -2 && doublein <=2) {
		System.out.println(true);	}
		else
		{	System.out.println(false);	}
	}

	public static void q5() {
		//Write question 5 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		String prompt = reader.nextLine();
		if (prompt.equals("Hello World")) {
		System.out.println(true);	}
		else
		{	System.out.println(false);	}
	}

	public static void q6() {
		//Write question 6 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		int int1 = reader.nextInt();
		System.out.print("In: ");
		int int2 = reader.nextInt();
		if (int1 <= int2) {
			System.out.println(true); }
		else
		{	System.out.println(false);	}
		}
	

	public static void q7() {
		//Write question 7 code here
		Scanner reader = new Scanner(System.in);
		System.out.print("In: ");
		double double1 = reader.nextDouble();
		System.out.print("In: ");
		double double2 = reader.nextDouble();
		if (double1 > double2) {
			System.out.println(true); }
		else
		{	System.out.println(false);	}
		}
	}


