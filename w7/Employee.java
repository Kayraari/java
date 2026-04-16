package w7;

public abstract class Employee implements IPayment {
	protected String name;
	protected String employeeid;
	protected double salary;
	protected double taxrate;
	protected double deduction;
	
	double remainingsalary= salary-deduction;
	
	
	public Employee(String name, String employeeid, double salary) {
	this.name=name;
	this.employeeid=employeeid;
	this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid=employeeid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary=salary;
	}
	
	abstract void calculateSalary(int i);
	abstract void displayEmployeeDetails();
	
	public void calculateTax(double d) {
		if(salary<30000) {
			double taxrate=10;
			deduction = salary*9/10;
		} else if(salary>=30000) {
			double taxrate=20;
			deduction =salary*8/10;
		}
		
	
		
	}


	

}
