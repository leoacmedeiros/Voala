package pageObjects.homeCarrossel;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;

public class ComprarPacoteInicioDoAnoPage extends BasePage {

	public void selecionarPromocaoPacoteInicioDeAno() {
		clicar(By.xpath("((//div[@class='row viagemFileira'])[3]//div[@class='imgBox'])[5]"));
	}

	public void aguardarBotaoComprar() {
		esperarElementoFicarVisivel2(By.xpath("//button[text()='Comprar']"));
	}

	public void clicarComprar() {
		clicar(By.xpath("//button[text()='Comprar']"));
	}
	
	
}
