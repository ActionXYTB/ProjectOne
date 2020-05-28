package learing.java.core.operators.bitwise;

public class BitwiseOr {
	public class BitwiseOr {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        
			
			byte byteA=01, byteB=02;
			System.out.printf("Byte A: %b, Byte B:%b AND Result:%b",byteA,byteB, excerciseByteOr(byteA, byteB));
		}

		public static byte excerciseByteOr(byte inByteA, byte inByteB) {
		    return (byte)(inByteA | inByteB);
		}

	
	
	
	
	
	}
