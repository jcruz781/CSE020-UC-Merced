package Lab20_10;
import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		
      System.out.println("This program will find the sum of all numbers till a specified maximum."); 
      System.out.println();
      
      
      System.out.print("Please enter the max amount of number to add: ");
      int max = input.nextInt();
     
      int i = 0;
      int total = 0;
		

		
		for(i = 0;i <= max ;i++) {
		   total = total + i;
		System.out.println("Number " + i); 
	}
		   System.out.println("The sum of all the numbers is " + total);

	}
}



