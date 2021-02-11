package pageObjects.carros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;

public class AlugarCarroPage extends BasePage {

	public void retirarCarroEm(String destino) {
		scrollPageDOWN(350);
		escrever(By.xpath("//input[@placeholder='Retirar carro em']"), destino);
		esperarElementoFicarVisivel2(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+destino+"')]"));
		clicar(By.xpath("//div[@class='autocomplete-suggestion animated fadeInUp focused']//div[contains(text(),'"+destino+"')]"));
	}

	public void selecionarDataRetirada(String diaInicio) {
		sleep(1);
		clicar(By.id("dataInicio"));
		
		for (int i = 0; i < 4; i++) {
			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
		}
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaInicio+ "']"));
		
	}
	
	public void selecionarDataDevolucao(String diaFim) {
		clicar(By.id("dataFim"));		
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaFim+ "']"));
		
	}
	
		
	public void selecionarHorarioRetirada(String horarioRetirada) {
		selecionarComboBox(By.id("horario-retirada"), horarioRetirada);
	}
	
	public void selecionarHorarioDevolucao(String horarioDevolucao) {
		selecionarComboBox(By.id("horario-devolucao"), horarioDevolucao);
	}

	public void clicarPesquisarCarros() {
		clicar(By.xpath("//button[text()='Pesquisar']"));
	}

	public void selecionarLocadora(String locadora) {
		esperarPresencaDoLoading();
		clicar(By.xpath("//input[@id='"+locadora+"']//parent::div//label"));
	}
	
	public void selecionarVerCarro() {
		clicar(By.xpath("(//button[text()='Ver carro'])[1]"));
	}
	
	public void selecionarProtecaoTerceiros() {
		clicar(By.xpath("(//div//label[contains(text(),'TERCEIROS')]//parent::div//parent::div//label)[1]"));
	}
	
	public void clicarFinalizar() {
		clicar(By.xpath("(//button[text()='Finalizar'])[1]"));
	}
	
	public void validarIdentViajantes() {
		esperarElementoFicarVisivel(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		Assert.assertEquals("Identificação dos viajantes", obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']")));
		//String texto = obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		//System.out.println("Título: " + texto);
	}

	public void digitarNomeViajante(String nomeViajante) {
		
		Boolean elementoPresente = DriverFactory.getDriver().findElements(By.xpath("(//p[contains(text(),'Estou ciente')]//parent::div//label)[1]")).size() > 0;
		
		if (elementoPresente == true) {
			clicar(By.xpath("(//p[contains(text(),'Estou ciente')]//parent::div//label)[1]"));
		} else {
			escrever(By.id("grupos[0].pax[0].Nome"), nomeViajante);
		}
				
	}
	
	public void digitarSobrenomeViajante(String sobrenomeViajante) {
		escrever(By.id("grupos[0].pax[0].Sobrenome"), sobrenomeViajante);
	}
	
	public void digitarCpfViajante(String cpfViajante) {
		escrever(By.id("grupos[0].pax[0].Documento"), cpfViajante);
	}
	
	public void selecionarSexoViajante(String sexoViajante) {
		selecionarComboBox(By.id("grupos[0].pax[0].Sexo"), sexoViajante);
	}
	
	public void digitarDtNascViajante(String dtNasViajante) {
		escrever(By.id("grupos[0].pax[0].DataNascimento"), dtNasViajante);
	}
	
	public void digitarEmailViajante(String emailViajante) {
		escrever(By.id("grupos[0].pax[0].Email"), emailViajante);
	}
	
	public void digitarTelViajante(String telViajante) {
		escrever(By.id("grupos[0].pax[0].NumeroTelefone"), telViajante);
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

	public void validarDetalhesLocacao() {
		esperarElementoFicarVisivel(By.xpath("//div//h4[text()='Detalhes do plano de viagem']"));
		Assert.assertEquals("Detalhes do plano de viagem", obterTexto(By.xpath("//div//h4[text()='Detalhes do plano de viagem']")));
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
		selecionarComboBoxIndice(By.id("billing.parcelas"), 1);
	}

	public void validarLocacaoCarro() {
		esperarElementoFicarVisivel(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']"));
		Assert.assertEquals("Pedido de compra enviado com sucesso!", obterTexto(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']")));
	}
	
	public void validarLocacaoCarroMinhasViagens() {
		clicar(By.xpath("(//div//a[text()='Minhas Viagens'])[1]"));
		
		esperarElementoFicarVisivel(By.xpath("//div[@id='MyTravels']//div//h4[contains(text(),'Não há dados')]"));
		String msg = obterTexto(By.xpath("//div[@id='MyTravels']//div//h4[contains(text(),'Não há dados')]"));
		
		if (msg.contains("Não há dados a serem exibidos.")) {
			Assert.assertTrue(false);
			Assert.assertEquals("ECONOMICO", DriverFactory.getDriver().getPageSource().contains("ECONOMICO"));
		} else {
			Assert.assertEquals("ECONOMICO", DriverFactory.getDriver().getPageSource().contains("ECONOMICO"));
		}
		
		
	}
	
	
}
