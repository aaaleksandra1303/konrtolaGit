package pl.akademiakodu.zad3;

public class Main {

	public static void main(String[] args) {
		Game game = new Game("Warcaby");
		Player player = new Player("Michał", "michalos", 120);
		game.addPlayer(player);
		player.setNumberOfPoints(1000);
		game.addPlayer(new Player("Zosia", "ziss", 150));
		game.addPlayer(new Player("Adam", "adamus", 80));
		game.printWinner();
	}

}
