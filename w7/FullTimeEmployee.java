package w7;

public class FullTimeEmployee extends Employee {
	protected double benefits;
	protected double overtimehours;
	public FullTimeEmployee(String name, String employeeid, double salary, double benefits) {
	super(name, employeeid, salary);
	this.benefits=benefits;	
	}

	@Override 
	public void calculateSalary() {
		salary+=benefits;
		double hourlypay=salary/160;
		salary= hourlypay*overtimehours;
	}
	@Override
	public void displayEmployeeDetails() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+ employeeid);
		System.out.println("Calculated Total Salary: "+ salary+" TL");
		System.out.println("Benefits: "+ benefits);
		System.out.println("Tax rate: "+taxrate+"%");
		System.out.println("Deduction Amount: "+deduction+"TL");
		System.out.println("Remaining Salary: "+remainingsalary+"TL");
		
	}

}
