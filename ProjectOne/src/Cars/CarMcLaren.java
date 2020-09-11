package Cars;

public  class CarMcLaren implements McLaren {

	public int maxSpeed; 
	 
	
	

  
	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public void openButterFlyDoors() {
		
		System.out.println("opening butterfly doors...");
		
	}

	@Override
	public void startCar() {
		System.out.println("Starting Engine...");
		
	}
	
	@Override
	public void closeButterFlyDoors() {
		
		System.out.println("closing butterfly doors...");
		
	}
	
	
	@Override
	public void reverse() {
		System.out.println("Reversing Car...");
		
	}

	@Override
	public void speedup() {
		System.out.println("Car Accelerating...");
		
	}
	@Override
	public void turnleft() {
		System.out.println("Turning Left...");
		
	}

	@Override
	public void playRadio() {
		System.out.println("Playing Radio...");		
	}

	@Override
	public void turnOnAc() {
		System.out.println("Turning AC on...");
		
	}

	@Override
	public void turnOnGPS() {
		System.out.println("Turning GPS on...");
		
	}

	@Override
	public void StopCar() {
		
		System.out.println("stopping engine...");
		
	}

	@Override
	public void turnright() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void slowdown() {
		// TODO Auto-generated method stub
		
	}

}
	