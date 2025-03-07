import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;

            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            // Printing Fibonacci Series
            System.out.print(arr[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(", " + arr[i]);
            }
            System.out.println(); // Newline after printing
        }
        sc.close();
    }
}
