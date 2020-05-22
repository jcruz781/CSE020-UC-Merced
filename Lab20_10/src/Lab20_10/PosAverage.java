package Lab20_10;
import java.util.Scanner;

public class PosAverage {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  double total = 0.0;
	  int num;
	  int count = 1;
	  
	  System.out.println("Enter 0 or less to stop entering numbers.");
	  
	  
	  do {
		  System.out.print("Enter number #" + count + ": ");
		  num = input.nextInt();
		  total = total + num;
		  count++;
	  } while(num > 0);
	  total = total - num;
	  System.out.println("Average is " + (total / (count - 2)));
  }
}
