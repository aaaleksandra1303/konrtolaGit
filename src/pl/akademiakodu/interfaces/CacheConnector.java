package pl.akademiakodu.interfaces;

public class CacheConnector implements Savable {

	@Override
	public void save() {
		System.out.println("Cachowanie");
	}

}
