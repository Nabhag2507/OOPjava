import java.util.Scanner;

public class avg{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();

		int[] arr=new int [size];
		int add=0;

		for (int i=0;i<size;i++){
			System.out.println("Enter no :"+(i+1));
			arr[i]=sc.nextInt();
			add=add+arr[i];
		}
		double x=add/5;
		System.out.println("Your average is :"+xWrite a program that creates and initializes a four integer element array. Calculate and display the average of its values.);
	}
}