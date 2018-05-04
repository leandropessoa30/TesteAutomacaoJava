package foradacaixa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;

public class TestRule {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		// Para que possa acessar a base de dados corretamente.
		String userLogado = System.getProperty("user.name");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/" + userLogado + "/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--start-maximized");
		// Inicia o driver do Chrome e navega até a página inicial.
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Vers%C3%A3o%202/index.html");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}