package Cars;

public interface Honda {

	public String licensePlate = "RQH-7274";
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
    public abstract void Honk();
    public abstract void RollDownWindows();
    public static void blowhorn() {
    
    	System.out.println("playRadio");
    	System.out.println("Max Speed 169 mph");

    }
	
}

