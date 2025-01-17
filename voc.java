import java.util.Scanner;

public class voc{
	public static void main(String[] args) {
		System.out.println("Enter some words");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vcou=0,ccou=0;
		char ch;


		for(int i=0;i<=str.length()-1;i++){
			ch=str.charAt(i);
			if (ch == 'a' || ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||
				ch == 'A' || ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
					vcou++;
			}
			else if(ch == " "){
				
			}
			else{
				ccou++;
			}
		}
		System.out.println("Vowels :"+vcou);
		System.out.println("Consonent :"+ccou);
	}
}