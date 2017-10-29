package is.ru.tictactoe;

public class Board {
	
	private static char[][] board;
	private static final int SIZE = 3;
	private boolean winnerIs; //true for player1, false for player2

	public Board() {

		this.board = new char[SIZE][SIZE];
		winnerIs = false;

		int count = 0;
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; i < SIZE; i++) {
				board[i][j] = (char)(49 + count);
				count++;
			}
		}
	}

	public void updateBoard(int move, char player) {

		int first = 0;
		int last = 0;
		boolean valid = true;

		do {
			valid = true;

			if(move >= 1 && move <= 3) {
				first = 0;
				last = move - 1;
			}
			else if(move >= 4 && move <= 6) {
				first = 1;
				last = move - 4;
			}
			else if(move >= 7 && move <= 9) {
				first = 2;
				last = move - 7;
			}
			else {
				valid = false;
			}
			
			if((board[first][last] != 'O' && board[first][last] != 'X') && valid == true) {
				board[first][last] = player;
			}
			else {
				valid = false;
			}
			
		} while(valid == false);
		
	}

	public static int boardSize() {
		return SIZE;
	}
	
	public void winnerX() {
		winnerIs = true; //player 1 wins
	}
	
	public void winnerO() {
		winnerIs = false; //player 2 wins
	}
	
	public boolean getWinner() {
		return winnerIs;
	}

	public boolean checkRows() {
		
		int countO = 0;
		int countX = 0;
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(board[i][j] == 'O') {
					countO++;
				}
				if(board[i][j] == 'X') {
					countX++;
				}
			}
			if(countO == 3) {
				winnerO();
				return true;
			}
			else if(countX == 3) {
				winnerX();
				return true;
			}
			else {
				countO = 0;
				countX = 0;
			}
		}
		return false;
	}
	
	public boolean checkColumns() {
		
		int countO = 0;
		int countX = 0;
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(board[j][i] == 'O') {
					countO++;
				}
				if(board[j][i] == 'X') {
					countX++;
				}
			}
			if(countO == 3) {
				winnerO();
				return true;
			}
			else if(countX == 3) {
				winnerX();
				return true;
			}
			else {
				countO = 0;
				countX = 0;
			}
		}
		return false;
	}
	
	public boolean checkCross() {
		
		if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			winnerO();
			return true;
		}
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			winnerO();
			return true;
		}
		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			winnerX();
			return true;
		}
		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			winnerX();
			return true;
		}
		
		return false;
	}
	
	public static boolean checkFull() {
		
		int fill = 0;
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(board[i][j] == 'O' || board[i][j] == 'X') {
					fill++;
				}
			}
		}
		
		if(fill == 9) {
			return true;
		}
		else {
			return false;
		}
	}

}