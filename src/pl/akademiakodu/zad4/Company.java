package pl.akademiakodu.zad4;

import java.util.ArrayList;
import java.util.List;

import pl.akademiakodu.zad1.Person;

public class Company {

	public static void main(String[] args) {
		Employee michal = new Employee("Michał", "Makaruk", 10000);
		michal.getAge(); // metoda wołana z Person
		michal.getSalary(); // metoda wołana z Employee

		System.out.println(michal);
		Person ania = new Person("Ania", "Konstantynowicz");
		List<Person> people = new ArrayList<Person>();
		people.add(michal);
		people.add(ania);

		for (Person p : people) {
			System.out.println(p.getName());
		}
		// POLIMOFRIZM

		Person zdzislaw = new Employee("Zdzisław", "Python", 22221.2);
		// Person zdzislaw = (Person) new Employee("Zdzisław","Python",22221.2);
		System.out.println(zdzislaw.getName());
		Employee zdzislawEmployee = (Employee) zdzislaw;
		System.out.println(zdzislawEmployee.getSalary());

	}

}
