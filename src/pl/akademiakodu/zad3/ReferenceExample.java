package pl.akademiakodu.zad3;

public class ReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		
		a = b;
		b = 25;
		System.out.println("a to "+a+" b to "+b);
		
		Player ania = new Player("Ania","Kowal",15);
		Player piotr = new Player("Piotr","Kondej",124);
		
		ania = piotr;
		piotr.setName("Józef");
		piotr.setUsername("jozefos");
		piotr.setNumberOfPoints(18);
		System.out.println("ania to "+ania+" piotr to "+piotr);
		

		
		
	}

}
