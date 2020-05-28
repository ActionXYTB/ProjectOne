/**
 * 
 */
package learning.java.core.operators.unary;

/**
 * @author saiba
 *
 */
public class UnaryFloat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		exercisePostFix(5000000);
		exercisePreFix(60000000);
		// TODO Auto-generated method stub
		
	      float varPostfix = 1.5F;
		  varPostfix++;
		  System.out.println(varPostfix);
		
		float varPrefix = (float) 1.7;
		varPrefix--;
		System.out.println(varPrefix);
	}
	
	private static void exercisePostFix(float d) {
		d++;
		System.out.println(""+ d);
	}
    private static void exercisePreFix(float d) {
			--d;
	System.out.println(""+ d);
    }
 
   	  
	}	
			
					
