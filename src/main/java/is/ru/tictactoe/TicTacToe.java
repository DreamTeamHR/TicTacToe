package is.ru.tictactoe;

public class TicTacToe {
	
	private Board board;
	private Player player;
	private char currPlayer;
	private int move;
	private boolean winner;
	private boolean draw;
	
	public TicTacToe() {
		board = new Board();
		player = new Player();
		currPlayer = player.getPlayer1();
		move = 0;
		winner = false;
		draw = false;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public Player getPlayers() {
		return player;
	}
	
	public void playerMove(int move, char currPlayer) {
		
		board.updateBoard(move, currPlayer);
	}
	
	public void changePlayer(char currPlayer) {
		
		if(currPlayer == player.getPlayer1()) {
			this.currPlayer = player.getPlayer2();
		}
		else {
			this.currPlayer = player.getPlayer1();
		}
	}
	
	public char getCurrPlayer() {
		return currPlayer;
	}
	
	public boolean getWinner() {
		return board.getWinner();
	}
	
	public boolean isWinner() {
		
		if(board.checkRows()) {
			return true;
		}
		if(board.checkColumns()) {
			return true;
		}
		if(board.checkCross()) {
			return true;
		}
		return false;
	}
	
	public boolean isDraw() {
		return board.checkFull();
	}

}