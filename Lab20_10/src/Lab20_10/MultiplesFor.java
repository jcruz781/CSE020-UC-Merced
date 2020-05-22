package Lab20_10;
import java.util.Scanner;


public class MultiplesFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	System.out.println("This program prints out multiples of a given number till a specified maximum.");
	System.out.println();
	
	System.out.print("Please enter the maximum number: ");
      int max = input.nextInt();
      
    System.out.print("Please enter the number whose mulitiples to print: ");
       int mul = input.nextInt();
    System.out.println();
     
    System.out.println("Muliples of " + mul + " from 1 till " + max + " are:"); 
    
    int i = 1;
    int sum;
    
    for(i = i; mul * i <= max; i++) {
      sum = (i % max) * mul;
      System.out.println("Number " + sum);
      
	}
    
	}

}
