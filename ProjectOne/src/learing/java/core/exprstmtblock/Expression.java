/**
 * 
 */
package learing.java.core.exprstmtblock;

/**
 * @author saiba
 *
 */
public class Expression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int iAge = 10;
	    iAge = (10 * 10)/100;
	    iAge = (12+20)/10;
	    iAge = (int)(12.0+20)/10;
        System.out.println(iAge);
        
        iAge = ((int)16.0 +20)/10;
        
        System.out.println(iAge);
        
        System.out.println((16.0+20)/10);
        
        long lValue = Long.MAX_VALUE-3333;
        short sValue = (short)(lValue-10);
        System.out.printf("%d %s", lValue, sValue);
	
	}
