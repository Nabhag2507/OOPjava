import java.util.Scanner;

public class mf3{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter first number :");
		int a=sc.nextInt();

		System.out.println("Enter second number :");
		int b=sc.nextInt();

		System.out.println("Enter third number :");
		int c=sc.nextInt();

		int max=(a>b)?((a>c)?(a):b):((b>c)?(b):(c));
		
		System.out.println("MAX number is "+max);
	}
}