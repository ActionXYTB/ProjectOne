/**
 * 
 */
package learing.java.core.operators.relational;

/**
 * @author saiba
 *
 */
public class Relational {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//< > <= >= instanceof
		int iAngadAge, iSaiAge;
		iAngadAge = 12;
		iSaiAge = 11;
		
		System.out.println( " Calling excerciseGreaterThan method for integers: " + iAngadAge + " " + iSaiAge + " -- result: " + excerciseGreaterThan(iAngadAge, iSaiAge));
		//System.out.println( (iAngadAge *10) > (iSaiAge*10));
		
		
		
	}
    
	public static boolean excerciseGreaterThan(int firstValue, int secondValue) {
		
		if (firstValue > secondValue)
			return true; 
		else 
			return false; 
	}
  public static boolean excerciseLessThan(int firstValue, int secondValue) {
	
	if (firstValue < secondValue)
		return true;
	else
		return false;
}
  public static boolean excerciseLessThanorEqualto(int firstValue, int secondValue) {
	
	if (firstValue <= secondValue)
		return true;
		else
			return false;
}
  public static boolean excerciseMoreThanorEqualto(int firstValue, int secondValue) {
	  
	  if (firstValue >= secondValue)
		  return true;
	  else
		  return false;
  }	  
  }



