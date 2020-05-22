package Lab20_11;
import java.util.Scanner;
public class SumSquareArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the maximum number: " );
		int max = input.nextInt();
		System.out.println();
	
		
		if (0 < max) {
		System.out.print("Contents of Arr1 (for-loop), Arr2 (while-loop), Arr3 (do-while-loop) are:");
		System.out.println();
		int[] arr1 = new int[max + 1];
		int[] arr2 = new int[max + 1];
		int[] arr3 = new int[max + 1];
		int i = 0;
		// For-loop to calculate sums
		
		for (i = 1; i <= max; i++)
			arr1[i] = arr1[i - 1] + (i*i);
		     i = 1;
		     
		// While-loop to calculate sums
		     while (i <= max) {
		    	 arr2[i] = arr2[i - 1] + (i*i);
		    	 i++;
		    	 }
		     
		     i = 1;
		     
		     // Do-While-loop to calculate sums
		     do
		     arr3[i] = arr3[i - 1] + (i*i);
		     while (++i <= max);
		     
		     for (i = 0; i <= max; i++)
		    	 System.out.println("Arr1: " + arr1[i] + ", Arr2: " + arr2[i] + ", Arr3: " + arr3[i]);
		     System.out.println();
		     System.out.println("Sum of Squares of numbers from 1 to " + max + " is: " + arr1[max]);
		     input.close();
		     }
		else
			System.out.println("No numbers to sum up. Exiting program.");
		
		
	}
}
	
	

