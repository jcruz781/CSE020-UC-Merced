package Lab20_5_1;

import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");
		
		//Move up Scanner input = new Scanner(System.in);//
		
		int n1, n2;
		
		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();
		
		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();
		
		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);
		//System.out.print("The average of the numbers is " + average);//
		
		
		Scanner input1 = new Scanner(System.in);
		//Scanner input = new Scanner(System.in);//
		
		//Delete float n1, n2;//
		
		System.out.print("Please enter the first number:");
		//System.out.print("Please enter the first number:");//
		float n3 = input.nextFloat();
		
		System.out.print("Please enter the second number: ");
		float n4 = input.nextFloat();
		
		float average1;
		average1 = (n3+n4)/2;
		//average1 = (n1+n2)/2;//
		
		System.out.println("The average of the numbers is " + average1);
		//System.out.print("The average of the numbers is " + average1);//
		//Delete short s1, s2;//
		Scanner input2 = new Scanner(System.in);
		//Add above//
		
		System.out.print("Please enter the first number: ");
		short s1 = input.nextShort();
		//s1 = input.nextShort();//
		
		System.out.print("Please enter the second number: ");
		short s2 = input.nextShort();
		//s2 = input.nextShort();//
		
		short shortAvg;
		shortAvg = (short) ((short)(s1+s2)/2);
		//shortAvg = (short)(n1+n2)/2;//
		System.out.print("The average of the numbers is " + shortAvg);
		
		
	}

}
