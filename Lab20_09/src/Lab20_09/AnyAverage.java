package Lab20_09;         

import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		double avg = 0.0;
		
		System.out.println("This program will find the average of as many numbers as you like.");
		System.out.println();
	
		System.out.print("Please choose the number of values to average: ");
		int num = input.nextInt(); 
		
		while ( count < num) {
			System.out.println("Please enter the " + (count + 1) + " number:");
			double temp = input.nextDouble();
			avg = avg + temp;
			
			count++;
	}
		System.out.println("The average of all the numbers is: " + (avg/num));
	}
}