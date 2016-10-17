package pl.akademiakodu.interfaces;

public class DatabaseConnector implements Savable {

	@Override
	public void save() {
		System.out.println("Save to database");
	}

}
