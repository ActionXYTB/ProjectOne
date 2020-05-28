/**
 * 
 */
package learing.java.core.operators.bitwise;

/**
 * @author saiba
 *
 */
public class BitwiseAndOr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int intA=01, intB=02;
		System.out.printf("Int A: %b, Int B:%b OR Result:%b",intA,intB, excerciseIntOr(intA, intB));
	}

	public static int excerciseIntOr(byte inByteA, byte inByteB) {
	    return (byte)(inByteA & inByteB);
	}

}
