package pl.akademiakodu.interfaces;

import java.util.ArrayList;

public class Zad1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		// to daje nam użycie interfejsów
		ArrayList<Speakable> animals = new ArrayList<Speakable>();
		animals.add(dog);
		animals.add(cat);
		animals.add(new Dog());
		animals.add(new Cat());
		// KOT będzie miauczał cicho
		// PIES BĘDZIE szczekał głośno
		for (Speakable s : animals) {
			if (s instanceof Cat) {
				((Cat) s).sleep();
				s.giveVoice(Speakable.QUIET);
			}
			if (s instanceof Dog) {
				((Dog) s).eat();
				s.giveVoice(Speakable.LOUD);
			}
		}
	}

}
