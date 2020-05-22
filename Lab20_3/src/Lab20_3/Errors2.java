package Lab20_3;
import java.util.Scanner;

public class Errors2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// Scanner kbd = new Scanner(System.in);	
		int number = 0;
		int theSquare = 0;
		
		System.out.print("Enter a number and I will ");
	//  System.out.print("Enter a number and I will")
		System.out.println("square it for you:  ");
	//  System.out.print("square it for you: );
			
		number =  input.nextInt(); 
	// number = keyboard.nextInt;
			
		theSquare = number * number; 
		// thesquare = number * number;
			
		System.out.print(number + " squared = ");
	// System.out.print(number + " squared = ";
		System.out.println(theSquare);
	// System.out.println("theSquare");	
	}
}