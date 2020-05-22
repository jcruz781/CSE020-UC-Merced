package Lab20_10;
import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int num = 0;
		int total = 0;
		
		System.out.print("Please enter the max amount of number to add: ");
		count = input.nextInt();
		
		do {
			System.out.println("Number " + num);
			total = total + count;
			num++;
			count--;
		} while(count >= 0);
		System.out.println("The sum of all the numbers is " + total);
		
	}

}
