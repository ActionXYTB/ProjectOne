import java.util.Scanner;

public class MainClass {
	private static Scanner sc1, sc2; 
	
public static void main(String[] args) {
		
		sc1 = new Scanner(System.in);
		sc2 = new Scanner(System.in);

		int num1, num2; 
		
		
		System.out.println("Please Enter any 2 Numbers you want to Calculate : ");
		
		 num1 = sc1.nextInt();
		 num2 = sc2.nextInt();
	       
	   Calculator c1 = new Calculator();
	     
	       c1.name = "TI84";  
      
	       System.out.println(c1.name + " " + "Calculated" + " " +  c1.add(num1 , num2) + " " + "for add");
	       System.out.println(c1.name + " " + "Calculated" + " " + c1.subtract(num1, num2) + " " + "for subtract");
	       System.out.println(c1.name + " " + "Calculated" + " " + c1.modulus(num1, num2) + " " + "for modulus");	   
   }
  

}
