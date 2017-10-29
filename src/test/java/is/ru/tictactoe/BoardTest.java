package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testBoardSize() {
		assertEquals(3, Board.boardSize());
	}

	@Test
	public void testCheckColumns() {
		Board b = new Board();
		b.updateBoard(1, 'X');
		b.updateBoard(4, 'X');
		b.updateBoard(7, 'X');
		assertEquals(true, b.checkColumns());
	}
	
	@Test
	public void testCheckRows() {
		Board b = new Board();
		b.updateBoard(1, 'X');
		b.updateBoard(2, 'X');
		b.updateBoard(3, 'X');
		assertEquals(true, b.checkRows());
	}

	@Test
	public void testCheckCross() {
		Board b = new Board();
		b.updateBoard(1, 'X');
		b.updateBoard(5, 'X');
		b.updateBoard(9, 'X');
		assertEquals(true, b.checkCross());
	}

	@Test
	public void testCheckFull() {
		Board b = new Board();
		b.updateBoard(1, 'X');
		b.updateBoard(2, 'X');
		b.updateBoard(3, 'X');
		b.updateBoard(4, 'X');
		b.updateBoard(5, 'X');
		b.updateBoard(6, 'X');
		b.updateBoard(7, 'X');
		b.updateBoard(8, 'X');
		b.updateBoard(9, 'X');
		assertEquals(true, b.checkFull());
	}
}



