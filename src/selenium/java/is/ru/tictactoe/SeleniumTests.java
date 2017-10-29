package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SeleniumTests extends SeleniumTestsWrapper {

@Test
public void titleMatches() {
	driver.get(baseUrl);
	assertEquals("DreamTeamHR' Tic Tac Toe", driver.getTitle());
	}
}