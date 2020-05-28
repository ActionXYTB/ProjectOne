
/**
 * 
 */

/**
 * @author saiba
 *
 */

import java.util.Scanner;

public class ReverseNumberUsingWhile {
	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, Number, Reminder, Reverse = 0 ,Sum = 0;
		sc = new Scanner(System.in);

		System.out.println("Please Enter any Number you want to Reverse : ");
		Number = sc.nextInt();

		// while (Number > 0) {
			for (i = Number; i > 0; i /= 10) {
			Reminder = i % 10;
			Reverse = Reverse * 10 + Reminder;
			//Number = Number / 10;
		    Sum += Reminder;
		}
		System.out.format("Reverse of entered number is = %d\n", Reverse);
		System.out.format("Sum of entered number digit is = %d\n", Sum);
	}

}
