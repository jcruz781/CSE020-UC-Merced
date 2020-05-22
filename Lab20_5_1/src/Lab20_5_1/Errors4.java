package Lab20_5_1;

import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {
		
				// int n1, n2; //
				
				Scanner input = new Scanner(System.in);
				//Scanner kbd;//
				
				int n1, n2;
				
				System.out.println("This program asks the user for two integers and calculates their sum as an integer.");
				
				
				//kbd = new Scanner(System.in);//
				
				System.out.print("Enter the first number: ");
				n1 = input.nextInt();
				//n1 = kbd.nextInt();//
				
				System.out.print("Enter the second number: ");
				n2 = input.nextShort();
				
				//n2 = kbd.nextShort();//
				
				System.out.println("The sum of the numbers is " + (int)(n1+n2));
				//System.out.println("The sum of the numbers is " + (float)(n1+n2));//
	}

}
