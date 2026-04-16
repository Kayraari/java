package w6;

public abstract class Vehicle implements VehicleMethods {
	private String brand;
	private int manufacturingyear;
	private double horsepower;
	
	public Vehicle (String brand, int manufactoringyear, double horsepower) {
		this.brand=brand;
		this.manufacturingyear=manufactoringyear;
		this.horsepower=horsepower;
	}
	public String getbrand() {
		return brand;
	}

	public int getmanufacturingyear() {
		return manufacturingyear;
	}
	public double gethorsepower() {
		return horsepower;
	}
	
	public abstract double taxcalculator();
	
	public String toString() {
		return "Brand: "+ brand + "Manufacturing Year: "+ manufacturingyear+ "Horse Power: "+ horsepower;
	}
	
	
}
