package foradacaixa;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClientePage extends ClienteElementMap {
	
	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void informarDadosIdentificacaoPF() {
		// TODO Auto-generated method stub
		fisica.click();
		cpf_cnpj.sendKeys("837.623.723-30");
		nome_razaosocial.sendKeys("Automação Fora da Caixa");
		email.sendKeys("automacao@foradacaixa.com.br");
		data_nascimento.sendKeys("02/01/1990");

		Select cmbSexo = new Select(sexo);
		cmbSexo.selectByVisibleText("Masculino");

		Select cmbEstadoCivil = new Select(estado_civil);
		cmbEstadoCivil.selectByVisibleText("Solteiro");
	}

	public void clicarAvancar() {
		// TODO Auto-generated method stub
		avancar.click();
	}

	public void informarEnderecos() {
		// Endereco Principal
		endp_cep.sendKeys("99130-529");
		endp_endereco.sendKeys("Rua da Automação");
		endp_numero.sendKeys("123");
		endp_complemento.sendKeys("Bloco A");
		endp_cidade.sendKeys("São Paulo");
		Select cmbEstadoEndPrincipal = new Select(endp_estado);
		cmbEstadoEndPrincipal.selectByVisibleText("SP");
		endp_telefone.sendKeys("51 3366-9999");
		endp_celular.sendKeys("54 99256-3594");

		// Endereco de Cobranca
		endc_cep.sendKeys("99134-569");
		endc_endereco.sendKeys("Rua Fora da Caixa");
		endc_numero.sendKeys("111");
		endc_complemento.sendKeys("Portaria 1");
		endc_cidade.sendKeys("São Paulo");
		Select cmbEstadoEndCobranca = new Select(endc_estado);
		cmbEstadoEndCobranca.selectByVisibleText("SP");
		endc_telefone.sendKeys("51 3366-9854");
		endc_celular.sendKeys("54 99658-3974");

	}

	public void verificarMensagemSucesso() {
		// TODO Auto-generated method stub

	}

	public void efetuarLogout() {
		// TODO Auto-generated method stub

	}

}
