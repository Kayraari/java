package w7;

public class PartTimeEmployee extends Employee{
	protected double hourlyrate;
	protected int hoursworked;
	
	public PartTimeEmployee(String name, String employeeid, double salary, double hourlyrate, int hoursworked) {
		super(name, employeeid, salary);
		this.hourlyrate=hourlyrate;
		this.hoursworked=hoursworked;
	}
	@Override
	public void calculateSalary() {
		salary = hourlyrate * hoursworked;
	}
	@Override
	public void displayEmployeeDetails() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+ employeeid);
		System.out.println("Hourly rate: "+hourlyrate);
		System.out.println("Total Hours worked: "+ hoursworked);	
		System.out.println("Calculated Total Salary: "+salary+" TL");
		System.out.println("Tax Rate "+ taxrate+"%");
		System.out.println("Deduction Amount: "+ deduction+"TL");
		System.out.println("Remaining Salary: "+ remainingsalary+"TL");
		
	}

}
