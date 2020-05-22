package Lab20_11;
import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	    System.out.println("This program will find the average of any set of numbers.");
		System.out.println();
	    
		System.out.println("Please choose number of values to average: ");
	    int max = input.nextInt();
	    
	       
	    if(max == 0)
	       {
	    	   System.out.print("No numbers to average. Exiting program.");
	    	  
	    	   }
	       else
	       {
	           System.out.print("Please choose column width for output formatting:");
	           int width = input.nextInt();
	           
	           int[] arr= new int[max];
	           double avg = 0;
	           
	           for(int i=0;i < max;i++)
	           {
	         System.out.print("Please enter value #"+(i+1)+": ");
	           arr[i]= input.nextInt();
	           avg += arr[i];
	           }
	          
	           avg/=(arr.length);
	           System.out.println("The numbers being averaged are....");
	           
	           for(int i=0;i<max;i++)
	           {
	        	   System.out.print(arr[i]+" ");
	           if((i+1) % width == 0)
	               System.out.println();
	           }
	           System.out.println();
	           System.out.println("Average is: "+ avg);
	       }
	   }


	}

