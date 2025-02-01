import java.util.Scanner;

public class Lab5cc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original arr: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter number: ");
        int n=sc.nextInt();
        int[] temp=new int[size];
        int k=0;
        for(int i=0;i<size;i++){
            if (n<=i) {
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<size;i++){
            if(n>i){
                temp[k]=arr[i];
                k++;
            }
        }
        System.out.println("New arr: ");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("Enter element : ");
        int ele=sc.nextInt();
        for(int i=0;i<size;i++){
            if (ele==temp[i]) {
                System.out.println("index : "+i);
                break;
            }
        }
        sc.close();
    }
}
