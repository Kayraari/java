package w6;

public class Truck extends Vehicle{
	private String geartype;
	
	public Truck(String brand, int manufactruingyear, double horsepower, String geartype) {
		super(brand, manufactruingyear, horsepower);
		this.geartype=geartype;
	}
	
	public String getgeartype() {
		return geartype;
	}
	public int environmentalimpact() {
		return 5;
	}
	
	public double taxcalculator() {
		if(geartype.equalsIgnoreCase("Manual")) {
			return 2 * gethorsepower();
		} else {
			return 2.5 * gethorsepower();
		}
	}
	public String toString() {
		return super.toString()+"Gear Type: "+ geartype+ "Tax Value: "+ taxcalculator()+"Vehicle Type: Truck";
	}
	
	
}
