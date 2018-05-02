package foradacaixa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenusElementMap {
	
	@FindBy(xpath = "//a[text()='Clientes']")
	protected WebElement menuClientes;
	
	@FindBy(css = "[href='inserircliente_identificacao.html']")
	protected WebElement submenuClientesInserir;
	
	
}
