package pl.akademiakodu.zad7;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String surname;
	private static List<Person> people = new ArrayList<Person>();

	public Person(String name, String surname) {
		this.setName(name);
		this.setSurname(surname);
		Person.people.add(this);
	}

	public String fullName() {
		return getName() + " " + getSurname();
	}

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

	public static List<Person> getAllPeople() {
		return Person.people;
		// w taki sposób odwołujemy się do zmiennej statycznej
	}

	public static List<String> getAllFulNames() {
		List<String> elements = new ArrayList<String>();
		for (Person p : Person.people) {
			elements.add(p.fullName());
		}
		return elements;
	}

}
