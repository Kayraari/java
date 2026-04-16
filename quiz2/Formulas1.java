package quiz2;

public class Formulas1 extends Foundation {
	protected double z;
	public Formulas1(double x, double y, double z) {
		super(x,y);
		this.z=z;
	}

	@Override
	public double delta() {
		System.out.println("Delta: "+(x+y*z));
		return (x+y*z);
	}	
	@Override
	public double alpha() {
		System.out.println("Alpha: "+(x*y*z));
		return (x*y*z);
	}
		
	public double theta() {
		System.out.println("Theta: "+(x+y)*z);
		return (x+y)*z;
	}
	 
	
	
}
