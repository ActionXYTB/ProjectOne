import java.io.File;
	import java.util.Scanner;

	public class CountFileLine {
	
	class Main {
	  public void main(String[] args) {

	    int count = 0;

	    try {
	      // create a new file object
	      File file = new File("test2.txt");

	      // create an object of Scanner
	      // associated with the file
	      Scanner sc = new Scanner(file);

	      // read each line ands
	      // count number of lines
	      while(sc.hasNextLine()) {
	        sc.nextLine();
	        count++;
	      }
	      System.out.println("Total Number of Lines: " + count);

	      // close scanner
	      sc.close();
	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
	}

}
