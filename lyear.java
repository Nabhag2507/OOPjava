import java.util.Scanner;

public class lyear{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter any year :");
		int y=sc.nextInt();

		if (y%4 == 0 || (y%400 == 0 && y%100 != 0)){
			System.out.println("Entered year is Leap year");
		}
		else{
				System.out.println("Entered year is not Leap year");
		}
		sc.close();
	}
}