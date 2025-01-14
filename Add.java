import java.util.Scanner;

public class Add{
	public static void main(String[] args) {
		Scanner cd=new Scanner(System.in);

		System.out.println("Enter first Number :");
		int a=cd.nextInt();

		System.out.println("Enter first Number :");
		int b=cd.nextInt();

		System.out.println("your sum is :"+(a+b));

		cd.close();
	}
}