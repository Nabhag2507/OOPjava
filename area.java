import java.util.Scanner;

public class area{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Sides of Rectangle");

		int h=sc.nextInt();
		int b=sc.nextInt();

		System.out.println("Area is :"+(h*b));
		sc.close();
	}
}