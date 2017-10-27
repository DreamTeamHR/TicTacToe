package is.ru.tictactoe;

import java.util.Scanner;
//import java.lang.System;

public class Board {
	
	private static char[][] board;
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

	public static boolean checkRows() {
		
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
				System.out.println("Player2 wins!");
				return true;
			}
			else if(countX == 3) {
				System.out.println("Player1 wins!");
				return true;
			}
			else {
				countO = 0;
				countX = 0;
				return false;
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
				System.out.println("Player2 wins!");
				return true;
			}
			else if(countX == 3) {
				System.out.println("Player1 wins!");
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
			System.out.println("Player2 wins!");
			return true;
		}
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			System.out.println("Player2 wins!");
			return true;
		}
		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			System.out.println("Player1 wins!");
			return true;
		}
		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			System.out.println("Player1 wins!");
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
			System.out.print("It's a draw!");
			return true;
		}
		else {
			return false;
		}
	}

}