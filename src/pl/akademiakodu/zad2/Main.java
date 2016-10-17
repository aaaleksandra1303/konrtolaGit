package pl.akademiakodu.zad2;

public class Main {

	
	public static void main(String[] args){
		Car myCar = new Car("Audi","A4",20005.42);
		Car seat = new Car("Seat","Ibiza",20000);
		myCar.showOnScreen();
		seat.showOnScreen();
	}
}
