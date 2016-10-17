package pl.akademiakodu.zad4;

import pl.akademiakodu.zad1.Person;

public class Employee extends Person {
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	private double commission;

	public Employee(String name, String surname, double salary) {
		super(name, surname);
		this.salary = salary;
	}

	public Employee(String name, String surname, double salary, double commission) {
		this(name, surname, salary);
		this.commission = commission;
	}

	public double annualSalary() {
		return 12 * salary + commission;
	}
	
	@Override
	public void setAge(int age){
		System.out.println("NIe ustawiam wieku");
	}

	@Override
	public String toString(){
		return super.toString()+" "+salary;
	}
	
}
