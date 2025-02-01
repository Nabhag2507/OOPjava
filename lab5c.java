import java.util.Scanner;

public class lab5c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array :");
		int size = sc.nextInt();

		int[] arr = new int[size];
		// int[] arr1 = new int[size];

		for (int i = 0; i <= size - 1; i++) {
			System.out.print("Enter no " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i <= size - 1; i++) {
			System.out.print(" " + arr[i]);
		}

		System.out.println("");

		System.out.print("From which index do you want to pivot ? :");
		int pivot = sc.nextInt();

		int[] temp1=new int[size];
		int k=0;
		for (int i = pivot; i <= size - 1; i++) {
			temp1[k]=arr[i];
			k++;
			// System.out.print(" " + arr[i]);
		}

		for (int i = 0; i <= pivot - 1; i++) {
			temp1[k]=arr[i];
			k++;
			// System.out.print(" " + arr[i]);
		}
		for(int i=0;i<temp1.length;i++){
			System.out.print(temp1[i]+" ");
		}
		// for (int j=0;j<=size-1;j++){
		// System.out.print(arr1[j]);
		// }
		sc.close();
	}
}