package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testIsWinnerFalse() {
		TicTacToe t = new TicTacToe();
		// 1 | 2 | 3
		// 4 | 5 | 6
		// 7 | 8 | 9
		t.playerMove(1, t.getCurrPlayer()); //X at 1
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(2, t.getCurrPlayer()); //O at 2
		t.changePlayer(t.getCurrPlayer());
		// X | O | 3
		// 4 | 5 | 6
		// 7 | 8 | 9
		t.isWinner(); // there is no winner
		assertEquals(false, t.isWinner());
	}

	@Test
	public void testIsWinnerTrue() {
		TicTacToe t = new TicTacToe();
		// 1 | 2 | 3
		// 4 | 5 | 6
		// 7 | 8 | 9
		t.playerMove(1, t.getCurrPlayer()); //X at 1
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(2, t.getCurrPlayer()); //O at 2
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(4, t.getCurrPlayer()); //X at 4
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(9, t.getCurrPlayer()); //O at 9
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(7, t.getCurrPlayer()); //X at 7
		t.changePlayer(t.getCurrPlayer());
		// X | O | 3
		// X | 5 | 6
		// X | 8 | O
		t.isWinner(); // there is a winner
		assertEquals(true, t.isWinner());
	}

	@Test
	public void testIsDrawFalse() {
		TicTacToe t = new TicTacToe();
		assertEquals(false, t.isDraw());
	}

	@Test
	public void testIsDrawTrue() {
		TicTacToe t = new TicTacToe();
		// 1 | 2 | 3
		// 4 | 5 | 6
		// 7 | 8 | 9
		t.playerMove(1, t.getCurrPlayer()); //X at 1
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(2, t.getCurrPlayer()); //O at 2
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(3, t.getCurrPlayer()); //X at 3
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(6, t.getCurrPlayer()); //O at 6
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(4, t.getCurrPlayer()); //X at 4
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(9, t.getCurrPlayer()); //O at 9
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(5, t.getCurrPlayer()); //X at 5
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(7, t.getCurrPlayer()); //O at 7
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(8, t.getCurrPlayer()); //X at 8
		t.changePlayer(t.getCurrPlayer());
		// X | O | X
		// X | X | O
		// O | X | O
		assertEquals(true, t.isDraw());
	}

	@Test
	public void testgetWinnerPlayer1() {
		TicTacToe t = new TicTacToe();
		// 1 | 2 | 3
		// 4 | 5 | 6
		// 7 | 8 | 9
		t.playerMove(1, t.getCurrPlayer()); //X at 1
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(2, t.getCurrPlayer()); //O at 2
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(4, t.getCurrPlayer()); //X at 4
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(9, t.getCurrPlayer()); //O at 9
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(7, t.getCurrPlayer()); //X at 7
		t.changePlayer(t.getCurrPlayer());
		// X | O | 3
		// X | 5 | 6
		// X | 8 | O
		t.isWinner(); // there is a winner
		assertEquals(true, t.getWinner());
	}

	@Test
	public void testgetWinnerPlayer2() {
		TicTacToe t = new TicTacToe();
		// 1 | 2 | 3
		// 4 | 5 | 6
		// 7 | 8 | 9
		t.playerMove(1, t.getCurrPlayer()); //X at 1
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(2, t.getCurrPlayer()); //O at 2
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(4, t.getCurrPlayer()); //X at 4
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(5, t.getCurrPlayer()); //O at 5
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(9, t.getCurrPlayer()); //X at 9
		t.changePlayer(t.getCurrPlayer());
		t.playerMove(8, t.getCurrPlayer()); //O at 8
		// X | O | 3
		// X | O | 6
		// 7 | O | X
		t.isWinner(); // there is a winner
		assertEquals(false, t.getWinner());
	}


}