package pageObjects.hospedagens;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import core.BasePage;

public class ComprarHospedagemPage extends BasePage {

	public void digitarDestino(String destino) {
		scrollPageDOWN(300);
		escrever(By.xpath("//input[@placeholder='Informe a cidade']"), destino);
		esperarElementoFicarVisivel2(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+destino+"')]"));
		clicar(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+destino+"')]"));
	}

	public void selecionarDataInicioHospedagem(String diaInicio) {
		sleep(1);
		clicar(By.xpath("//label[text()='Check-in']"));
		
		for (int i = 0; i < 4; i++) {
			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
		}
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaInicio+ "']"));
	}
	
	public void selecionarDataFimHospedagem(String diaFim) {
		clicar(By.id("dataFim"));		
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaFim+ "']"));
	}
	
	

	public void clicarPesquisarHospedagem() {
		clicar(By.xpath("//button[text()='Pesquisar']"));
	}

	public void digitarNomeHotelPesq(String nomeHotelPesq) {
		esperarElementoFicarVisivel(By.xpath("(//div[@id='Box'])[1]//button[text()='Ver hotel']"));
		escrever(By.id("pesquisa-hotel"), nomeHotelPesq);
	}

	public void selecionarHotel() {
		clicar(By.xpath("(//div[@id='Box'])[1]//button[text()='Ver hotel']"));
	}
	
	public void selecionarQuarto() {
		esperarElementoFicarVisivel(By.xpath("(//div[@id='Box'])[2]//div//button//span[text()='Finalizar']"));
		scrollElementoClicar(By.xpath("(//div[@id='Box'])[2]//div//button//span[text()='Finalizar']"));
	}

	public void validarIdentViajantes() {
		esperarElementoFicarVisivel(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		Assert.assertEquals("Identificação dos viajantes", obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']")));
		
	}

	public void digitarTelViajante1(String telViajante1) {
		escrever(By.id("grupos[0].pax[0].NumeroTelefone"), telViajante1);
	}
	
	public void digitarNumCartao(String numCartao) {
		escrever(By.id("billing.numeroCartao"), numCartao);
	}

	public void digitarTitCartao(String titCartao) {
		escrever(By.id("billing.nomeTitularCartao"), titCartao);
	}

	public void digitarDtVencCartao(String dtVencCartao) {
		escrever(By.id("billing.dataVencimento"), dtVencCartao);
	}

	public void digitarCvvCartao(String cvvCartao) {
		escrever(By.id("billing.cvc"), cvvCartao);
	}

	public void digitarNomeTitCartao(String nomeTitCartao) {
		escrever(By.id("billing.primeiroNome"), nomeTitCartao);
	}

	public void digitarSobrenomeTitCartao(String sobrenomeTitCartao) {
		escrever(By.id("billing.ultimoNome"), sobrenomeTitCartao);
	}

	public void digitarEmailTitCartao(String emailTitCartao) {
		escrever(By.id("billing.email"), emailTitCartao);
	}

	public void digitarConfEmailTitCartao(String confEmailTitCartao) {
		escrever(By.id("billing.confimacaoEmail"), confEmailTitCartao);
	}

	public void digitarCpfTitCartao(String cpfTitCartao) {
		escrever(By.id("billing.cpf"), cpfTitCartao);
	}

	public void digitarDtNascTitCartao(String dtNascTitCartao) {
		escrever(By.id("billing.dataNascimento"), dtNascTitCartao);
	}

	public void selecionarSexoTitCartao(String sexoTitCartao) {
		selecionarComboBox(By.id("billing.sexo"), sexoTitCartao);
	}

	public void digitarTelTitCartao(String telTitCartao) {
		escrever(By.id("billing.numeroTelefone"), telTitCartao);
	}

	public void digitarCepTitCartao(String cepTitCartao) {
		escrever(By.id("billing.cep"), cepTitCartao);
	}

	public void digitarNumEndTitCartao(String numTitCartao) {
		escrever(By.id("billing.numeroEndereco"), numTitCartao);
	}

	public void digitarCompEndTitCartao(String compTitCartao) {
		escrever(By.id("billing.complemento"), compTitCartao);
	}

	public void selecionarParcelas() {
		//Select dropdown = new Select(DriverFactory.getDriver().findElement(By.id("billing.parcelas")));
		//dropdown.selectByIndex(3);
		selecionarComboBoxIndice(By.id("billing.parcelas"), 1);
	}

	public void validarCompraPacote() {
		esperarElementoFicarVisivel(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']"));
		Assert.assertEquals("Pedido de compra enviado com sucesso!", obterTexto(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']")));
	}
	
	
	
}
