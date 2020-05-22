package Lab20_5_1;

import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Scanner keyboard;//
		
		int n1, n2;
		//int weight, age;//
		
		 System.out.print("What is your weight in kg? " );
		 int weight = input.nextInt();
		 //int  weight = keyboard.nextInt();//
		 
		 
		 //Delete int keyboard = new Scanner(System.in);//
		 
		 
		// Delete Scanner keyboard;//
		//Delete int weight, age;//
		 
		 System.out.print("What is your age? ");
		 int age = input.nextInt();
		 //age = keyboard.nextInt();//
		 
		 System.out.println("Wow! You are " + (int) (age*6.9) + " in dog years.");
		 
		 System.out.println("Your weight in lbs is " + (int) weight * 2 + " with no decimal point.");
		 //System.out.println("Your weight in lbs is " + (int) weight * 2.2 + " with no decimal point");//
	}

}
