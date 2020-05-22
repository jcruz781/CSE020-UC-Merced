package Lab20_3;

import java.util.Scanner;

public class Errors1 {
	
	public static void main(String[] args) 
	{
	  // {   Missing //
	  System.out.println("Can you spot and fix the errors?");
   // System.out.print("Can you spot and fix the errors?');
      System.out.print("Enter two numbers and I will ");
      System.out.println("add them for you");
   
    
       int n1, n2;
       
       Scanner input = new Scanner(System.in);
   //Scanner keyboard = new Scanner(System.in)
       n1 = input.nextInt();
    //n1 = nextInt();
       n2 = input.nextInt();
    // n2 = nextint();
    		
       System.out.println("The sum of the numbers is");
     // System.println("The sum of the numbers is");
       System.out.println(n1 + n2);
     //System.out.println(n1 - n2); 
    		
}
}

