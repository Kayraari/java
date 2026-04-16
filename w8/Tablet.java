package w8;

public class Tablet extends Device{
	boolean supportsPen;
	double batteryLife;
	
	public Tablet(String model, int power, boolean supportsPen, double batteryLife) {
		super(model, power);
		this.supportsPen=supportsPen;
		this.batteryLife=batteryLife;
	}
	public int compareTo(Device other) {
		Tablet t = (Tablet) other;
		if(t.batteryLife >this.batteryLife) return -1;
		if(t.batteryLife< this.batteryLife) return 1;
		return 0;
	}
	
	@Override
	public boolean equals(Device d) {
		if(!(d instanceof Tablet)) return false;
		Tablet t = (Tablet ) d;
		return this.model.equals(t.model) && this.power==t.power&& this.supportsPen==t.supportsPen && this.batteryLife==t.batteryLife;
	}
	
	
	@Override
	public void activate() {
		System.out.println("Tablet "+model+" is operating with power "+power+".");
	}
	
	public void draw() {
		System.out.println("Tablet "+model+" is being used for drawing.");
	}
	
}
