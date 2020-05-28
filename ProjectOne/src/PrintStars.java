import java.util.Scanner;

/**
 * 
 */

/**
 * @author saiba
 *
 */
public class PrintStars {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int i, j;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row to print 3-10 *");
		i = scan.nextInt();
		for (j = i; j > 0; j--) {
			printStars(j);
			System.out.println();
		}

	}

	private static void printStars(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}

}
