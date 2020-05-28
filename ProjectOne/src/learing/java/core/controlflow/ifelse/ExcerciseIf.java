/**
 * 
 */
package learing.java.core.controlflow.ifelse;

import java.util.Scanner;

/**
 * @author saiba
 *
 */
public class ExcerciseIf {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Int Value 0 or greater ");
		int inputIntValue = scan.nextInt();
		System.out.println("Please Enter a skip Value  0 or greater ");
		int inputSkipValue = scan.nextInt();
		
		if (inputIntValue < inputSkipValue )
		{
			System.out.print("you have entered an invalid values");
			return;
		}
		System.out.printf("Numbers from 0 to %d are: ", inputIntValue);
		for (int i = 1; i <= inputIntValue; i += inputSkipValue) {
			{
				System.out.print(i + " , ");
           
			}

		}

	}

}
