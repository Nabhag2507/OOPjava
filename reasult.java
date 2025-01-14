import java.util.Scanner;

public class reasult{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter marks of subject no 1 :");
		int a=sc.nextInt();

		System.out.println("Enter marks of subject no 2 :");
		int b=sc.nextInt();

		System.out.println("Enter marks of subject no 3 :");
		int c=sc.nextInt();

		System.out.println("Enter marks of subject no 4 :");
		int d=sc.nextInt();

		System.out.println("Enter marks of subject no 5 :");
		int e=sc.nextInt();

		double avg=((a+b+c+d+e)/5);

		if (avg>=60) {
			System.out.println("you are in division 1:)");
		}

		if (avg>=50 && avg<59) {
			System.out.println("you are in division 2:)");
		}

		if (avg>=40 && avg<49) {
			System.out.println("you are in division 3:)");
		}

		if (avg<40) {
			System.out.println("You are fail:(");
		}

		sc.close();
	}
}