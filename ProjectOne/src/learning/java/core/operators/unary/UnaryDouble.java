package learning.java.core.operators.unary;

public class UnaryDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

exercisePostFix(6.8);
exercisePreFix(6.3);
// TODO Auto-generated method stub

  double varPostfix = (double) (3.5);
  varPostfix++;
  System.out.println(varPostfix);

  double varPrefix = (double) 6.3;
varPrefix--;
System.out.println(varPrefix);
}

private static void exercisePostFix(double d) {
d++;
System.out.println(""+ d);
}
private static void exercisePreFix(double d) {
	--d;
System.out.println(""+ d);
}

 
}	
	
			

