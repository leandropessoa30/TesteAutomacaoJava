package foradacaixa;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MenusPage extends MenusElementMap{
	
	public MenusPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void acessarMenuClientesInserir() throws Exception {
		//Clicando no elemento
		//menuClientes.click();
		//submenuClientesInserir.click();
		
		//Movendo o mouse com Actions - do selenium
		//Actions actions = new Actions(TestRule.getDriver());
		//actions.moveToElement(menuClientes);
		//actions.moveToElement(submenuClientesInserir);
		//actions.click().build().perform();
		
		//Movendo o mouse com Robot
		this.moverMouseSobreElemento(menuClientes);
		submenuClientesInserir.click();
		
	}
	
	private void moverMouseSobreElemento(WebElement elemento) throws Exception {
		//Obt�m a altura da p�gina interna
		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");
		
		//Obt�m a altura da janela (browser)
		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;
		
		//Obt�m a diferen�a de altura entre janela e p�gina
		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;
		
		//Obt�m as coordenadas relativas do objeto
		int intCoordXElemento = elemento.getLocation().getX();
		int intCoordYElemento = elemento.getLocation().getY();
		
		//Move para a posi��o esperada do objeto
		int intCoordXEsperada = intCoordXElemento;
		int intCoordYEsperada = intCoordYElemento + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
				
	}
}
