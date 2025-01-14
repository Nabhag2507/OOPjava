import java.util.Scanner;

public class primebr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting number :");
		int a=sc.nextInt();

		System.out.println("Enter ending number :");
		int b=sc.nextInt();

		int max=(a>b)?(a):(b);
		int min=(a<b)?(a):(b);


		for (int i=min;i<=max;i++){
			int counter=0;
			for (int j=1;j<max;j++){
				if(i%j==0){
					counter++;
				}
			}
			if (counter == 2){
				System.out.println(i +" ");
			}
		}
		sc.close();
	}
}