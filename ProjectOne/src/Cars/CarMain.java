package Cars;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarRollsRoyce carRR = new CarRollsRoyce();
		
		carRR.startCar();
		carRR.reverse();
		carRR.speedup();
		carRR.turnright();
		carRR.slowdown();
		carRR.turnleft();
		carRR.playRadio();
		carRR.turnOnAc();
		carRR.turnOnGPS();
		carRR.StopCar();
	
		CarMcLaren carML = new CarMcLaren();
	
	
		carML.openButterFlyDoors();
		carML.closeButterFlyDoors();
		
		CarHonda carHDA = new CarHonda();
		
		carHDA.RollDownWindows();
	    carHDA.Honk();
	}

}
