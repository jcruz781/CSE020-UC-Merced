package Lab20_3;
import java.util.Scanner;

 public class Errors3 {
// public class Errors3 //

 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
// Scanner kbd = new Scanner System.in; //
	
	int numerator;
	//Int numerator; //
	
	int denominator;
	// integer denominator; //
	
	System.out.println("This program divides two numbers.");
// System.println("This program divides two numbers.");	
	System.out.println("Enter the numerator: ");
// System.print("Enter the numerator: "); //
	
	numerator = input.nextInt();
// numerator = kbd.nextInt();
	  System.out.print("Enter the denominator: ");
	  denominator = input.nextInt();
// denomintaor = kbd.nextInt();	
	
	 System.out.print(numerator);
// system.out.print(numerator);
	 System.out.print("/");
	 System.out.print(denominator);
// system.out.Print(denominator);
	 System.out.print(" = ");
	 System.out.println((double) numerator/denominator);
// System.out.Println((double)  numerator/denominator);	 
 }
 
}
