package is.ru.tictactoe;

public class Player {

	private char player1;
	private char player2;
	
	Player() {
		player1 = 'X';
		player2 = 'O';
	}
	
	public char getPlayer1() {
		return player1;
	}
	
	public char getPlayer2() {
		return player2;
	}

	public void setPlayer1(char player) {
		player1 = player;
	}

	public void setPlayer2(char player) {
		player2 = player;
	}
}


