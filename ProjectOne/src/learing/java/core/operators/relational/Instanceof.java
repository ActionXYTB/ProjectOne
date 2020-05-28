/**
 * 
 */
package learing.java.core.operators.relational;

/**
 * @author saiba
 *
 */
public class Instanceof {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		
		    public  static void main(String[] args) {
		 
		        Vehicle vehicle = new Vehicle();
		        Car car = new Car();
		        MotorCycle moto = new MotorCycle();
		 
		        if (vehicle instanceof Vehicle)
		        {
		        	System.out.println("vehicle is instanceof Vehicle: ");
		        }
		        else
		        {
		        	System.out.println("vehicle is not instanceof Vehicle: ");
		        }
		        
		        if (car instanceof Vehicle)
		        {
		        	System.out.println("car instanceof Vehicle: ");
		        }
		        else
		        {
		        	System.out.println("car is not instanceof Vehicle: ");
		        }
		        
		        if (moto instanceof MotorCycle)
		        {
		        	System.out.println("moto is instanceof MotorCycle: ");
		        }
		        else
		        {
		        	System.out.println("moto is not instanceof MotorCycle: ");
		        }
		               		 
		        if (vehicle instanceof Car)
		        { 
		        	System.out.println("vehicle is instanceof Car: ");
		        }
		        else
		        {	
		        	System.out.println("vehicle is not instanceof Car: ");
		        
		        if (car instanceof Car)
		        {	
		        	System.out.println("(car=null) is instanceof Car: ");
		        }
		        else
		        {
		        	System.out.println("(car=null) is not instanceof Car: ");
		        	
		        }
		        
		        
		        
		        } 
		        
		    }
		 
		
		 
		class Vehicle {
		}
		 
		class Car extends Vehicle {
		}
		 
		class MotorCycle extends Vehicle {
		}
		 
		
	}


