package foradacaixa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestRule {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		// Inicia o driver do Chrome e navega até a página inicial.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Vers%C3%A3o%202/index.html");

	}
}
