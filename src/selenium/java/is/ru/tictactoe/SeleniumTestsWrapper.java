package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class SeleniumTestsWrapper {
	static ChromeDriver driver;
    static String baseUrl;

    @BeforeClass
    public static void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        baseUrl = "https://sleepy-bastion-81869.herokuapp.com/";
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}