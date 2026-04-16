package quiz2;

public abstract class Foundation {
	protected double x;
	protected double y;
	
	public Foundation(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	abstract double delta();
	abstract double alpha(); 

}
