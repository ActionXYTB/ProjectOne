/**
 * 
 */
package learing.java.core.operators.bitwise;

/**
 * @author saiba
 *
 */
public class BitwiseAndInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int intA=01, intB=02;
		System.out.printf("Int A: %b, Int B:%b AND Result:%b",intA,intB, excerciseIntAnd(intA, intB));
	}

	public static int excerciseByteAnd(byte inIntA, int inIntB) {
	    return (inIntA & inIntB);
	}





}
