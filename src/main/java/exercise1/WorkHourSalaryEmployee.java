package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private int hourRate=0;

	public WorkHourSalaryEmployee (String name,int hourRate){
		super(name);
		this.hourRate=hourRate;
	}
	public int computeSalary(){
		return getWorkedHours()*hourRate;
	}
}
