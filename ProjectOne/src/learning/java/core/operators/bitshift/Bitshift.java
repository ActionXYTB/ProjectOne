/**
 * 
 */
package learning.java.core.operators.bitshift;

/**
 * @author saiba
 *
 */
public class Bitshift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int varBitshift = 0X01; //Hex Value pattern for 1
	
	System.out.println(varBitshift);
	System.out.println(varBitshift>>1);
	long signedLong =-05;
	System.out.println("signedLong: " + (signedLong));
	System.out.println("signedLong: " + (signedLong>>1));
	System.out.println("signedLong: " + (signedLong>>>1));
	short signedShort =-05;
	System.out.println("signedShort: " + signedShort);
	System.out.println("signedShort: " + (signedShort>>1));
	System.out.println("signedShort: " + (signedShort>>>1));
	char signedChar ='A';
	System.out.println("signedChar: " + signedChar);
	System.out.println("signedChar: " + (signedChar>>1));
	System.out.println("signedChar: " + (signedChar>>>1));
	}

}
