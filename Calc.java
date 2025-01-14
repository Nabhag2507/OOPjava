import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choise");
		int c=sc.nextInt();

		int a=c*2;

		System.out.println(a);

		sc.close();
	}
}