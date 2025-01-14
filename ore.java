import java.util.Scanner;

public class ore{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any Number :");
		int n=sc.nextInt();

		if (n%2 == 0){
			System.out.println("Number is even :)");
		}
		else{
			System.out.println("Number is odd :)");
		}

		sc.close();
	}
}