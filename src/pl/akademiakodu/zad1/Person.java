package pl.akademiakodu.zad1;

public class Person extends Object {
	private String name;
	private String surname;
	private int age;
	private String gender;

	public Person(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString(){
		return name+" "+surname;
	}
	
	public Person(String name, String surname, int age, String gender){
		this.name = name;
		// setName(name)
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}
	public Person(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else {
			System.out.println("Wiek musi być większy od 0!");
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
