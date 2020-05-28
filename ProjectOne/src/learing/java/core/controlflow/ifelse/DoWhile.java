/**
 * 
 */
package learing.java.core.controlflow.ifelse;

import java.util.Scanner;

/**
 * @author saiba
 *
 */
public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if the loop doesnt continue break; 
		
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
		int i=1;
		do {
			if(i<=inputIntValue) {
				System.out.printf("%d, ", i );
				i+=inputSkipValue;
			}
			else {
				break;
			}
		}while(true);
	}
}


