package pl.akademiakodu.interfaces;

public class Employee implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return firstName+" "+lastName+" "+salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary == o.salary)
			return 0;
		if (this.salary > o.salary)
			return 1;
		return -1;
	}

}