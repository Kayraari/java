package w6;

public class Car extends Vehicle {
	private String geartype;
	
	public Car(String brand, int manufacturingyear, double horsepower, String geartype) {
		super(brand, manufacturingyear, horsepower);
		this.geartype=geartype;
	}
	public String getgeartype() {
		return geartype;
	}
	

	 public double taxcalculator() {
		if(geartype.equalsIgnoreCase("Manual")) {
			return 1.2 * gethorsepower();
		}else {
			return 1.5 * gethorsepower();
		}
	}
	 public int environmentalimpact() {
		 return 3;
	 }
	
	public String toString() {
		return super.toString()+"Gear Type: "+geartype+ "Tax Value: "+taxcalculator()+ "Vehicle Type: Car";
	}
}
