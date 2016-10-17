package pl.akademiakodu.interfaces;

public class Dog implements Speakable {

	@Override
	public void giveVoice(int value) {
		if (value == Speakable.QUIET)
			System.out.println("hau hau hau");
		else
			System.out.println("HAU HAU HAU");
	}
	
	public void eat(){
		System.out.println("jem");
	}
}
