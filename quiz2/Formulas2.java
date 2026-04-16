package quiz2;

public class Formulas2 extends Formulas1{
	protected double t;
	
	public Formulas2(double x, double y, double z, double t) {
		super(x,y,z);
		this.t=t;
	}
	@Override
	public double delta() {
		System.out.println("Delta: "+(x+y+z)/t);
		return(x+y+z)/t;
		}
	@Override
	public double alpha() {
		System.out.println("Alpha: "+(x*y+z)*t);
		return (x*y+z)*t;
	}
	public double omega(double n) {
		System.out.println("Omega: "+(x*y)*2*z*n);
		return (x*y)*2*z*n;
	}
	
	

}
