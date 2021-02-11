package pageObjects.homeCarrossel;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;

public class ComprarPacoteFimDoAnoPage extends BasePage {

	public void validarCompraPacote() {
		esperarElementoFicarVisivel(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']"));
		Assert.assertEquals("Pedido de compra enviado com sucesso!", obterTexto(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']")));
	}
	
	public void validarIdentViajantes() {
		esperarElementoFicarVisivel(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		Assert.assertEquals("Identificação dos viajantes", obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']")));
	}

	public void selecionarPromocaoPacoteFimDeAno() {
		clicar(By.xpath("((//div[@class='row viagemFileira'])[1]//div[@class='imgBox'])[5]"));
		//clicar(By.xpath("(//*[@id=\"carouselComponente\"]/div/div[3]/div/div[1]/div/div[5]/a/div/div[1])[1]"));
	}

	public void aguardarBotaoComprar() {
		esperarElementoFicarVisivel2(By.xpath("//button[text()='Comprar']"));
	}

	public void clicarComprar() {
		clicar(By.xpath("//button[text()='Comprar']"));
	}
	
	
	
	
	
}
