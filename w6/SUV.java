package w6;

public class SUV extends Car{
	public SUV(String brand, int manufacturingyear, double horsepower, String geartype) {
		super(brand, manufacturingyear, horsepower, geartype);
	}
	
	public double marketvaluelossrate() {
		double hp= gethorsepower();
		int year= getmanufacturingyear();
		
		if(hp>50&& year>2020) {
			return 1.4;
		}else if(hp>50 && year<=2020) {
			return 2;
		}else {
			return 1.1;
		}
	}
	public int environmentalimpact() {
		return 4;
	}
	
	public String toString() {
		return super.toString().replace("Car","SUV");
	}
	
	
}
