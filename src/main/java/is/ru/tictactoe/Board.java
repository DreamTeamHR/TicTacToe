package is.ru.tictactoe;

import java.util.Scanner;

public class Board {
	
	private char[][] board;
	private static final int SIZE = 3;

	public Board() {

		this.board = new char[SIZE][SIZE];

		int count = 0;
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; i < SIZE; i++) {
				board[i][j] = (char)(49 + count);
				count++;
			}
		}
	}

	public void updateBoard(char player) {

		int first = 0;
		int last = 0;
		boolean valid = true;

		do {
			valid = true;
			Scanner choose = new Scanner(System.in);
			int move = choose.nextInt();

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

}