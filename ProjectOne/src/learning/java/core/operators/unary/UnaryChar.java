/**
 * 
 */
package learning.java.core.operators.unary;

/**
 * @author saiba
 *
 */
public class UnaryChar {

	/**
	 * @param <X>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
		exercisePostFix('X');
		exercisePreFix('B');
		// TODO Auto-generated method stub
		
	      char varPostfix = 'c';
		  varPostfix++;
		  System.out.println(varPostfix);
		
		 char varPrefix = 'S';
		 varPrefix--;
		System.out.println(varPrefix);
	}
	
	private static void exercisePostFix(char D) {
		D++;
		System.out.println(""+ D);
	}
    private static void exercisePreFix(char B) {
			--B;
	System.out.println(""+ B);
    }
 
   	  
	}	
		