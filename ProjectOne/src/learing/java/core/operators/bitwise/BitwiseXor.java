/**
 * 
 */
package learing.java.core.operators.bitwise;

/**
 * @author saiba
 *
 */
public class BitwiseXor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		byte byteA=05, byteB=07;
		System.out.printf("Byte A: %b, Byte B:%b AND Result:%b",byteA,byteB, excerciseByteXor(byteA, byteB));
	}

	public static byte excerciseByteXor(byte inByteA, byte inByteB) {
	    return (byte)(inByteA ^ inByteB);
	}



}
