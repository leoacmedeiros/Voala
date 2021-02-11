package pageObjects.login;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class EfetuarLoginPage extends BasePage {

	private static String HML = "http://voala-hml.bancorbras.com.br";

	public void acessarVoala() {
		DriverFactory.getDriver().get(HML);
	}

	public void digitarCpf(String cpf) {
		esperarPresencaDoLoadingLogin();
		escrever(By.id("CPF"), cpf);
	}
	
	public void digitarSenha(String senha) {
		esperarPresencaDoLoadingLogin();
		escrever(By.id("Senha"), senha);
	}
	
	public void clicarLogin() {
		clicar(By.xpath("(//div[@id='cardForm']//button//span[text()='Voalá'])[1]"));
	}

}
