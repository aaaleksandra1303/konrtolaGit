package pl.akademiakodu.zad1;

public class Main {

	public static void main(String[] args){
		Person p = new Person();
		p.setName("Adam");
		p.setSurname("Kowalski");
		p.setAge(21);
		p.setGender("male");
		Person secondPerson = new Person("Adam","Kowalski",21,"male");
		System.out.println(p.getName());
		System.out.println(secondPerson.getName());
		secondPerson.setName("Wojciech");
		System.out.println(secondPerson.getName());
	
		// konstruktor domyślny
		//p.age
	}
	
}
