package w8;

public abstract class Device {
	String model;
	int power;
	public Device(String model, int power) {
		this.model=model;
		this.power=power;
	}
	public void activate() {
		System.out.println("Device is activated with power "+power+".");
	}
	
	public void deactivate() {
		System.out.println("Device is now off.");
	}
	public abstract int compareTo(Device other);
	public abstract boolean equals(Device device);
	
	
	

}
