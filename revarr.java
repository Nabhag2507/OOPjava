import java.util.Scanner;

public class revarr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();

		int[] arr=new int [size];
		int[] arr1=new int [size];

		int add=0;

		for (int i=0;i<size;i++){
			System.out.println("Enter no :"+(i+1));
			arr[i]=sc.nextInt();
		}
		for (int i=size-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}