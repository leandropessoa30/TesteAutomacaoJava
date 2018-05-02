package foradacaixa;

public class LoginPage extends LoginElementMap {
	public void efetuarLogin() {
		login.sendKeys("john");
		senha.sendKeys("john");
		btnLogin.click();
	}
}
