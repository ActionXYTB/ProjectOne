/**
 * 
 */
package learing.java.core.operators.Switch;

import java.util.Scanner;

/**
 * @author saiba
 *
 */
public class SwitchDemoFallThrough {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.ArrayList<String> futureMonths =
	            new java.util.ArrayList<String>();

	        //int month = 3;
		Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
	        switch (month) {
	            case 1:  futureMonths.add("January");
	            break;
	            case 2:  futureMonths.add("February");
	            break;
	            case 3:  futureMonths.add("March");
	            case 4:  futureMonths.add("April");
	            case 5:  futureMonths.add("May");
	            case 6:  futureMonths.add("June");
	            case 7:  futureMonths.add("July");
	            case 8:  futureMonths.add("August");
	            case 9:  futureMonths.add("September");
	            case 10: futureMonths.add("October");
	            case 11: futureMonths.add("November");
	            case 12: futureMonths.add("December");
	                     break;
	            default: break;
	        }

	        if (futureMonths.isEmpty()) {
	            System.out.println("Invalid month number");
	        } else {
	            for (String monthName : futureMonths) {
	               System.out.println(monthName);
	            }
	        }
	    }
	
	}


