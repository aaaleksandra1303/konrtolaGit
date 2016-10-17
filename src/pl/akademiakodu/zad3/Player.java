package pl.akademiakodu.zad3;

public class Player {
	private String name;
	private String username;
	private int numberOfPoints;

	public Player(String name, String username, int numberOfPoints) {
		this(name, username);
		this.numberOfPoints = numberOfPoints;
	}
	
	public Player(String name, String username) {
		this.name = name;
		this.username = username;
		this.numberOfPoints = 0;
	}

	@Override
	public String toString(){
		return name+" "+username+" liczba punktów "+numberOfPoints;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

}
