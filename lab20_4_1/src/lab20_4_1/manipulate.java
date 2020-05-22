package lab20_4_1;
import java.util.Scanner;

public class manipulate
{
	
	  public static void main(String[] args) {
		  
	  Scanner input = new Scanner(System.in);
	  
	  int n1, n2;
	  
	  System.out.println("Input two integers:");
	     n1 = input.nextInt();
	     n2 = input.nextInt();
	     
	  int sum = n1+n2;
	  int dif = n1-n2;
	  int prod = n1*n2;
	  int cast = n1%n2;
	  
	  System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
	  System.out.println("Difference of " + n1 + " and " + n2 + " is " + dif);
	  System.out.println("Product of " + n1 + " and " + n2 + " is " + prod);
	  System.out.println("Integer cast of " + "(" + n1 + " / " + n2 + ")" + " is " + (int)(n1/n2));
	  System.out.println("Integer cast of " + "(" + n1 + " % " + n2 + ")" + " is " + cast);
	  
	  System.out.println("\nInput two shorts (-32,768 to 32,767):");
	  n1 = input.nextInt();
	  n2 = input.nextInt();
	  
	  int sum2 = n1+n2;
	  int dif2 = n1-n2;
	  int prod2 = n1*n2;
	  int cast2 = n1%n2;
	  
	  System.out.println("Sum of " + n1 + " and " + n2 + " is " + (short)sum2);
	  System.out.println("Difference of " + n1 + " and " + n2 + " is " + (short)dif2);
	  System.out.println("Product of " + n1 + " and " + n2 + " is " + (short)prod2);
	  System.out.println("Short cast of " + "(" + n1 + " / " + n2 + ")" + " is " + (int)(n1/n2));
	  System.out.println("Short cast of " + "(" + n1 + " % " + n2 + ")" + " is " + (short)cast2);
	  
	  Scanner input1 = new Scanner(System.in);
	  
	  System.out.println("\nInput two floating points:");
	  float n3 = input1.nextFloat();
	  float n4 = input1.nextFloat();
	  
	  float sum3;
	  sum3 = (n3+n4);
	  float dif3;
	  dif3 = (n3-n4);
	  float prod3;
	  prod3 = (n3*n4);
	  float cast3;
	  cast3 = (n3%n4);
	  
	  System.out.println("Sum of " + n3 + " and " + n4 + " is " + sum3);
	  System.out.println("Difference of " + n3 + " and " + n4 + " is " + dif3);
	  System.out.println("Product of " + n3 + " and " + n4 + " is " + prod3);
	  System.out.println("Float cast of " + "(" + n3 + " / " + n4 + ")" + " is " + (float)(n3/n4));
	  System.out.println("Float cast of " + "(" + n3 + " % " + n4 + ")" + " is " + cast3);
	  
	  
	  Scanner input2 = new Scanner(System.in);
	  
	  System.out.println("\nInput two doubles: ");
	  double n5 = input2.nextDouble();
	  double n6 = input2.nextDouble();
	  
	  double sum4;
	  sum4 = (n5+n6);
	  double dif4;
	  dif4 = (n5-n6);
	  double prod4;
	  prod4 = n5*n6;
	  double cast4;
	  cast4 = n5%n6;
	  
	  System.out.println("Sum of " + n5 + " and " + n6 + " is "  + sum4);
	  System.out.println("Difference of " + n5 + " and " + n6 + " is " + dif4);
	  System.out.println("Product of " + n5 + " and " + n6 + " is " + prod4);
	  System.out.println("Double cast of " + "(" + n5 + " / " + n4 + ")" + " is " + (double)(n5/n6));
	  System.out.println("Double cast of " + "(" + n5 + " % " + n4 + ")" + " is " + cast4);
	  
	  
	  }
}