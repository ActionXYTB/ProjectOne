package learning.java.core.operators.unary;

/**
 * @author Saiba
  */
public class PostFix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercisePostFix(200);
		exercisePreFix(500);
		exercisePostFix(2.8F);
		exercisePreFix((float)6000900);
		exercisePostFix('G');
		exercisePreFix('B');
		exercisePostFix(68D);
		exercisePreFix(6.3);
		exercisePostFix(6766778888999999999L);
		exercisePreFix((long)703434562);

		boolean X = true;
		System.out.println("\nBoolean "+ X);
		System.out.println("Opposite"+ !X);
		/*int varPrefix = 0;
		++varPrefix;
		System.out.println(varPrefix);
		--varPrefix;
		System.out.println(varPrefix);*/
	}
	
	private static void exercisePostFix(int varPostFix) {
		varPostFix++;
		System.out.println("PostIntValue = "+ varPostFix);
	}
    private static void exercisePreFix(int varPreFix) {
			--varPreFix;
	System.out.println("PreIntValue = "+ varPreFix);
	}
	private static void exercisePostFix(float d) {
		d++;
		System.out.println("\nPostFloatValue = "+ d);
	}
    private static void exercisePreFix(float d) {
				--d;
		System.out.println("PreFloatValue = "+ d);
    }
	private static void exercisePostFix(char D) {
		D++;
		System.out.println("\nPostCharValue = "+ D);
	}
    private static void exercisePreFix(char B) {
			--B;
	System.out.println("PreCharValue = "+ B);
    }
    private static void exercisePostFix(double d) {
    	d++;
    System.out.println("\nPostDoubleValue = "+ d);
    }
    private static void exercisePreFix(double d) {
    		--d;
    System.out.println("PreDoubleValue = "+ d);
    }
    private static void exercisePostFix(long d) {
    	d++;
    System.out.println("\nPostLongValue = "+ d);
    }
    private static void exercisePreFix(long d) {
    		--d;
    System.out.println("PreLongValue = "+ d);
    }

         
    }	
			
					
	
	

