package Lab20_10;

import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		
 System.out.print("Please enter the maximum number : ");
  int max = input.nextInt();

		
		int i = 1;
		int total = 0;
		int squared = 0;
	
		while(i <= max) {
			squared = (i * i);
			System.out.println("Number " + i + " squared is " + squared);
			total = total + (i * i);
			i++;
			
		}
		
		System.out.println();
		System.out.println("The sum of squares of all numbers from 1 till " + max + " is: " + total);
		
		
	}

}
