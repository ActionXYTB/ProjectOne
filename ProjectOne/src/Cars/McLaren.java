package Cars;

public interface McLaren {

	public String licensePlate = "XHD-9456";
    public abstract void openButterFlyDoors(); 
    public abstract void closeButterFlyDoors();
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
    
    	System.out.println("openButterFlyDoors");
    	System.out.println("Max Speed 204 mph");

    }
}


