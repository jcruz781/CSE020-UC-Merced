package Lab20_09;
import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = 1;
		int solution = 0;
		
		
		
		System.out.print("Please enter the maximum number: ");
		int max = input.nextInt();
		System.out.print("Please enter the number whose multiple to print: ");
		int num = input.nextInt();
		System.out.println();
		
		System.out.println("Multiples of " + num + " from 1 till " + max + " are:");
		
		while (solution <= (max - num)) {
			
			solution = num * count;
			System.out.println("Number " + solution);
			count++;
			}
		}
	}
		
		
	