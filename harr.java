import java.util.Scanner;

public class harr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int n =ch.length;
        System.out.println("The length of given string is: "+n);
        System.out.print("The second half of the string is: ");
        for(int i = (n/2);i<n ; i++){
            System.out.print(ch[i]);
        }
        sc.close();
    }
}