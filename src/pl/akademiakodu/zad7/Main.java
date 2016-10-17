package pl.akademiakodu.zad7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		Person p = new Person("Justyna","Walicka");
		Person p2 = new Person("Ela","Jaśkowiak");
		ArrayList<Person> people = (ArrayList<Person>) Person.getAllPeople();
		for ( Person person:people){
			System.out.println(person.fullName());
		}
		ArrayList<String> peopleString = (ArrayList<String>) Person.getAllFulNames();
		for ( String s:peopleString){
			System.out.println(s);
		}
	}
}
