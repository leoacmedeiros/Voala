package pageObjects.menu;

import org.openqa.selenium.By;

import core.BasePage;

public class MenuPage extends BasePage {

	private static final String CADASTRESE = "//ul[@class='navbar-nav ml-md-auto text-center desktop']//div//a[contains(text(),'Cadastre-se')]";
	private static final String PACOTES = "//div//p[contains(text(),'Pacotes')]";
	private static final String HOSPEDAGENS ="//div//p[contains(text(),'Hospedagens')]";
	private static final String PASSAGENSAEREAS ="//div//p[contains(text(),'Passagens Aéreas')]";
	private static final String CARROS ="//div//p[contains(text(),'Carros')]";
	private static final String SEGUROS ="//div//p[contains(text(),'Seguros')]";
	
	public void acessarCadastrese() {
		clicar(By.xpath(CADASTRESE));
	}
	
	public void acessarPacotes() {
		clicar(By.xpath(PACOTES));
	}

	public void acessarHospedagens() {
		clicar(By.xpath(HOSPEDAGENS));
	}
	
	public void acessarPassagensAereas() {
		clicar(By.xpath(PASSAGENSAEREAS));
	}
	
	public void acessarCarros() {
		clicar(By.xpath(CARROS));
	}
	
	public void acessarSeguros() {
		clicar(By.xpath(SEGUROS));
	}
	
	
}







