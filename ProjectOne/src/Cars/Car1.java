package Cars;


public abstract class Car1 implements RollsRoyce {

	public int maxSpeed; 
	 
	
	public void start() {
		
		System.out.println("starting engine...");
	}
 
	public void stop() {
		
		System.out.println("stopping engine...");
	}
  
	public int getMaxSpeed() {
		return maxSpeed;
	}

}
