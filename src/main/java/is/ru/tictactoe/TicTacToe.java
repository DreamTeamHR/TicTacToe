package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	private Board board;
	private Player player;
	private char currPlayer;
	private boolean winner;
	private boolean draw;
	
	public TicTacToe() {
		board = new Board();
		player = new Player();
		currPlayer = player.getPlayer1();
		winner = false;
		draw = false;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public Player getPlayers() {
		return player;
	}
	
	public void playerMove() {
		
		do {
			System.out.print("Choose an available number between 1-9: ");
			board.updateBoard(currPlayer);
			//board.printBoard();
			winner = isWinner();
			draw = isDraw();
			currPlayer = changePlayer(currPlayer, player);
		} while(winner == false && draw == false);
	}
	
	public char changePlayer(char currPlayer, Player player) {
		
		if(currPlayer == player.getPlayer1()) {
			currPlayer = player.getPlayer2();
			return currPlayer;
		}
		else {
			currPlayer = player.getPlayer1();
			return currPlayer;
		}
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
