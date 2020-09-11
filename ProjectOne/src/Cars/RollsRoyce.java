package Cars;


public interface RollsRoyce {

	public String licensePlate = "7TY-P290";
    public abstract void startCar();
    public abstract void reverse();
    public abstract void speedup();
    public abstract void turnright();
    public abstract void slowdown();
    public abstract void turnleft();
    public abstract void playRadio();
    public abstract void turnOnAc();
    public abstract void turnOnGPS();
    public abstract void StopCar();
    public static void blowhorn() {
    
    	System.out.println("Start Car");
    	System.out.println("Max Speed 155 mph");

    }
}

