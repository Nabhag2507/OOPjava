import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int counter=0;

		for (int i=1;i<=n;i++){
			if (n%i == 0){
				counter+=1;
			}
		}
		if (counter == 2){
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is not prime");
		}
		sc.close();
	}
}