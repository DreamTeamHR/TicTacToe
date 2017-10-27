package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testBoardSize() {
		assertEquals(3, Board.boardSize());
	}
}