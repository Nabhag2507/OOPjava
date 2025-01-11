import java.util.Scanner;

public class tem { 
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);

	    System.out.println("Enter temp in celsius :");
	    double c=sc.nextInt();

	    // System.out.println("")
		// double celsius = 10.0, fahrenheit = 0.0; 
		
		double fahrenheit = (c * 1.8) + 32; 
		System.out.println( 
			" value of temperature in fahrenheit:"
			+ fahrenheit); 
			sc.close();
	} 
}
