package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testChangePlayer() { 
		Player p = new Player();
		TicTacToe t = new TicTacToe();
		t.changePlayer('X',p);
		t.changePlayer('O',p);
		t.changePlayer('X',p);
		t.changePlayer('O',p);

		assertEquals('O', t.changePlayer(p.getPlayer1(), p));
	}
	@Test
	public void testIsWinner() {
		TicTacToe t = new TicTacToe();
		assertEquals(false, t.isWinner());
	}
	@Test
	public void testIsDraw() {
		TicTacToe t = new TicTacToe();
		assertEquals(false, t.isDraw());
	}

}
