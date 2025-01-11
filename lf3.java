import java.util.Scanner;

public class lf3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first Number :");
		int a=sc.nextInt();

		System.out.println("Enter second Number :");
		int b=sc.nextInt();

		System.out.println("Enter third Number :");
		int c=sc.nextInt();

		int largest=a;

		if (b>largest){
		largest=b;
		}
		if (c>largest){
		largest=c;
		}
		System.out.println("GOAT is "+largest);
		sc.close();
	}
}