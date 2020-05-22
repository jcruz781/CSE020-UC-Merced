package lab20_4_1;

import java.util.Scanner;
 public class Interviewer
  {
	 
	 
	 public static void main(String[] args)
	 { 
		 Scanner input  = new Scanner(System.in);
	     int n1;
	     
	     
		 
		 String firstname;
		 System.out.print("What is the persons name?");
		 firstname = input.next();
		 
		 String lastname;
		 lastname = input.next();
		 
		 String home;
		 System.out.print("Where is Jorge's hometown?");
		 home = input.next();
		 
		 String home2;
		 home2 = input.next();
		 
		 
		 String partmajor;
		 System.out.print("What are you Jorge's major?");
		 partmajor = input.next();
		 
		 String partmajor2;
		 partmajor2 = input.next();
		 
		 int year;
		 System.out.print("What year was Jorge born?");
		 year = input.nextInt();
		 
		 String food;
		 System.out.print("What is Jorge's favorite foods?");
		 food = input.next(); 
		 
		 String conjuction;
		 conjuction = input.next();
		
		 String food1;
		 food1 = input.next();
		 
		 float height;
		 System.out.print("What is your height in inches?");
		 height = input.nextInt() * (float)2.54;
		 
		 
		
		 System.out.print("So your name is" + " "+ firstname + " " + lastname + ". ");
		 
		 System.out.print("Your hometown is " + home + " "+ home2 +  ".");
		 
		  System.out.print(" Your major is " + "\n" + partmajor + " " + partmajor2 + ". ");
		 
		 System.out.print("You were born in " + year + ".");
		
		 System.out.print(" Your favorite foods are " + food + " "+ conjuction + "\n" + food1 + ".");
		
		 System.out.print(" Your height in centimeters is " + height + " cm.");
		 
	 }
	 
 }


