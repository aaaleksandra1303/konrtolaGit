package pl.akademiakodu.interfaces;

public class Cat implements Speakable {

	@Override
	public void giveVoice(int value) {
		if (value == Speakable.QUIET)
			System.out.println("miau miau miau");
		else
			System.out.println("MIAU MIAU MIAU");
	}
	
	public void sleep(){
		System.out.println("Idę spać");
	}

}
