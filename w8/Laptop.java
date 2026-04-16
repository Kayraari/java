package w8;

public class Laptop extends Device {
	int storage;
	double screenSize;
	boolean hasDedicatedGPU;
	
	
	public Laptop(String model, int power, int storage, double screenSize, boolean hasDedicatedGPU) {
		super(model, power);
		this.storage=storage;
		this.screenSize=screenSize;
		this.hasDedicatedGPU=hasDedicatedGPU;
	}
	
	@Override
	public int compareTo(Device other) {
		Laptop a =(Laptop) other;
		if(a.storage > this.storage) return -1;
		if(a.storage < this.storage) return 1;
		return 0;
	}
	
	@Override
	public boolean equals(Device d) {
		if(!(d instanceof Laptop)) return false;
		Laptop a = (Laptop) d;
		
		return this.model.equals(a.model)&& this.power==a.power && this.storage == a.storage && this.screenSize == a.screenSize && this.hasDedicatedGPU == a.hasDedicatedGPU;
	}
	
	@Override
	public void activate() {
		System.out.println("Laptop "+model+" is now running with power "+power+".");
	}
	
	public void compileCode() {
		System.out.println("Laptop "+model+ " is compiling code.");
	}
	

}
