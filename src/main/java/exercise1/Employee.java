package exercise1;

public abstract class Employee {
	private final String name;
	private int workedHours=0;
	private int sales=0;

	protected Employee(String name){
		this.name=name;
	}
	public abstract int computeSalary();


	public void sell() {
		sales++;
	}

	protected int getSales() {
		return sales;
	}

	public void workOneHour() {
		this.workedHours++;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public String getName() {
		return name;
	}
}
