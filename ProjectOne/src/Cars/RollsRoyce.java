package Cars;


public interface RollsRoyce {

	public String licensePlate = "7TY-P290";
    public void start();
    public void reverse();
    public void speedup();
    public void turnright();
    public void slowdown();
    public void turnleft();
    public void playRadio();
    public void turnOnAc();
    public void turnOnGPS();
    default void blowhorn() {
    
    	System.out.println("Blowing horn");
    	System.out.println("Max Speed 155 mph");

    }
}

