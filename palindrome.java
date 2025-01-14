import java.util.Scanner;

public class palindrome{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int rem,rev=0;

		System.out.println("Enter any number :");
		int n = sc.nextInt();

		int temp=n;

		while(n != 0){
			rem = n%10;
			rev=rem+(rev*10);
			n/=10;
		}
		System.out.println(rev);

		if (rev == temp){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}
	}
}