package pl.akademiakodu.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setConnector(new DatabaseConnector());
		// użyć cachowania do zapisu
		p.save();
		p.setConnector(new CacheConnector());
		p.save();
		p.setList(new ArrayList<String>());
		p.setList(new LinkedList<String>());
		
	}

}
