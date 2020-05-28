/**
 * 
 */
package learing.java.core.operators.bitwise;

/**
 * @author saiba
 *
 */
public class LogicalAnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Is Leap? : %b" , excerciseIsLeapYear(2020));
	}
 
	public static boolean excerciseIsLeapYear(int year) {
      if(year/4 == 0 && year/100 ==0 && year/400==0) {
    	  return true;
      }else{
          if(year/100!=0) {
        	  return true;
          }
    }
      
      return false;
	
 }
	
	
