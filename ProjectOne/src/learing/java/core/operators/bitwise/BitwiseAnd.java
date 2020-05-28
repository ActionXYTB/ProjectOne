/**
 * 
 */
package learing.java.core.operators.bitwise;

/**
 * @author saiba
 *
 */
public class BitwiseAnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		byte byteA=01, byteB=02;
		System.out.printf("Byte A: %b, Byte B:%b AND Result:%b",byteA,byteB, excerciseByteAnd(byteA, byteB));
	}

	public static byte excerciseByteAnd(byte inByteA, byte inByteB) {
	    return (byte)(inByteA & inByteB);
	}
	


	
}	