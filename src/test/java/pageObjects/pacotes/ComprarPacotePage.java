package pageObjects.pacotes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import core.BasePage;

public class ComprarPacotePage extends BasePage {

	public void digitarOrigem(String origem) {
		scrollPageDOWN(350);
		escrever(By.xpath("//input[@placeholder='Origem']"), origem);
		esperarElementoFicarVisivel2(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+origem+"')]"));
		clicar(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+origem+"')]"));
	}

	public void digitarDestino(String destino) {
		escrever(By.xpath("//input[@placeholder='Destino']"), destino);
		esperarElementoFicarVisivel2(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+destino+"')]"));
		clicar(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+destino+"')]"));
	}

	public void selecionarDataInicioPacote(String diaInicio) {
		sleep(1);
		clicar(By.xpath("//label[text()='Check-in']"));
		
		for (int i = 0; i < 4; i++) {
			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
		}
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaInicio+ "']"));
	}
	
	
	public void selecionarDataFimPacote(String diaFim) {
		clicar(By.id("dataFim"));		
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaFim+ "']"));
	}
	

	public void clicarPesquisarPacote() {
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
		clicar(By.xpath("(//div[@id='Box'])[2]//div//button//span[text()='Finalizar']"));
	}

	public void selecionarCiaAerea() {
		esperarElementoFicarVisivel(By.xpath("(//label[text()='Gol'])[1]//parent::div//parent::div//input//parent::div//label"));
		clicar(By.xpath("(//label[text()='Gol'])[1]//parent::div//parent::div//input//parent::div//label"));
	}

	public void selecionarVooIda() {
		clicar(By.xpath("((//p[text()='IDA'])[1]//parent::div//parent::div//parent::div//div[@id='CardOption']//input//parent::div//label)[1]"));
	}

	public void selecionarVooVolta() {
		clicar(By.xpath("(//p[text()='VOLTA'])[1]//parent::div//parent::div//parent::div//div[@id='CardOption']//input//parent::div//label"));
	}

	public void clicarAdicionarVoo() {
		clicar(By.xpath("(//div[@id='PriceCompare'])[1]//button[text()='Adicionar']"));
	}

	public void selecionarTarifa() {
		clicar(By.xpath("//div[@class='modal-footer']//button[text()='Continuar']"));
	}

	public void validarIdentViajantes() {
		esperarElementoFicarVisivel(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		Assert.assertEquals("Identificação dos viajantes", obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']")));
	}

	public void digitarTelViajante1(String telViajante1) {
		escrever(By.id("grupos[0].pax[0].NumeroTelefone"), telViajante1);
	}
	
	public void digitarDtNasc(String dtNasc) {
		forcarLimpar(By.id("grupos[0].pax[0].DataNascimento"));
		escrever(By.id("grupos[0].pax[0].DataNascimento"), dtNasc);
	}
	

	public void digitarNomeViajante2(String nomeViajante2) {
		escrever(By.id("grupos[0].pax[1].Nome"), nomeViajante2);
	}
		
	public void digitarSobrenomeViajante2(String sobrenomeViajante2) {
		escrever(By.id("grupos[0].pax[1].Sobrenome"), sobrenomeViajante2);
	}

	public void selecionarSexoViajante2(String sexoViajante2) {
		selecionarComboBox(By.id("grupos[0].pax[1].Sexo"), sexoViajante2);
	}

	public void digitarDtNascViajante2(String dtNascViajante2) {
		escrever(By.id("grupos[0].pax[1].DataNascimento"), dtNascViajante2);
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

	public void digitarNumTitCartao(String numTitCartao) {
		escrever(By.id("billing.numeroEndereco"), numTitCartao);
	}

	public void digitarCompTitCartao(String compTitCartao) {
		escrever(By.id("billing.complemento"), compTitCartao);
	}

	public void selecionarParcelas() {
		//Select dropdown = new Select(DriverFactory.getDriver().findElement(By.id("billing.parcelas")));
		//dropdown.selectByIndex(3);
		selecionarComboBoxIndice(By.id("billing.parcelas"), 1);
	}

	public void clicarAceiteTermos() {
		clicar(By.xpath("//label[contains(text(),'Li e aceito os')]//parent::div//parent::div//div[@class='checkbox']//label"));
	}
	
	public void confirmarCompra() {
		clicar(By.xpath("//div//button[text()='Confirmar Compra']"));
	}
	
	public void validarCompraPacote() {
		esperarElementoFicarVisivel(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']"));
		Assert.assertEquals("Pedido de compra enviado com sucesso!", obterTexto(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']")));
	}
	
	
	
}
