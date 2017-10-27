package is.ru.tictactoe;


import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer1(){
		Player p = new Player();
		p.setPlayer1('R');
		assertEquals('R',
		p.getPlayer1());
	}

}