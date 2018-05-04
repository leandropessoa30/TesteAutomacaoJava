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
		//Obtém a altura da página interna
		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");
		
		//Obtém a altura da janela (browser)
		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;
		
		//Obtém a diferença de altura entre janela e página
		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;
		
		//Obtém as coordenadas relativas do objeto
		int intCoordXElemento = elemento.getLocation().getX();
		int intCoordYElemento = elemento.getLocation().getY();
		
		//Move para a posição esperada do objeto
		int intCoordXEsperada = intCoordXElemento;
		int intCoordYEsperada = intCoordYElemento + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
				
	}
}
