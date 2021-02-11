package pageObjects.passagensAereas;

import java.sql.Driver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;

public class ComprarPassagemAereaPage extends BasePage {
	

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
	
	/*
	public void selecionarDataVooIda(int diaInicio) {
		sleep(1);
		clicar(By.id("dataInicio"));
		
		for (int i = 0; i < 4; i++) {
			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
		}
		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(diaInicio);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);

		if (Integer.parseInt(inserirDiaInicio) > 25) {
			String novoValor = inserirDiaInicio;
			novoValor = "10";
			scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +novoValor+ "']"));
			
		} else {
			scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +inserirDiaInicio+ "']"));
		}
		
	}
	
	public void selecionarDataVooVolta(int diaFim) {
		clicar(By.xpath("//label[contains(text(),'Data de volta')]"));
		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaFim);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaFim = qtdDiasFim.format(formatter);
		
		//System.out.println("1 inserirDiaFim: " + inserirDiaFim);

		if (Integer.parseInt(inserirDiaFim) > 25 ) {
			String novoValor = inserirDiaFim;
			novoValor = "14";
			scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +novoValor+ "']"));
		
			
		} else {
			scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +inserirDiaFim+ "']"));
			//System.out.println("Caindo no else");
			//System.out.println("inserirDiaFim: " + inserirDiaFim);
			
		}
	  
	}
	*/
	
	
	public void selecionarDataVooIda(String diaInicio) {
		sleep(1);
		clicar(By.id("dataInicio"));
		
		for (int i = 0; i < 4; i++) {
			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
		}
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaInicio+ "']"));
		
	}
	
	
	public void selecionarDataVooVolta(String diaFim) {
		clicar(By.xpath("//label[contains(text(),'Data de volta')]"));		
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" +diaFim+ "']"));
	  
	}
	
	

	public void clicarPesquisarVoo() {
		clicar(By.xpath("//button[text()='Pesquisar']"));
	}
	
	public void exibirVoosDisponiveis() {
		esperarElementoFicarVisivel(By.xpath("(//h6[text()='Preço total a pagar'])[1]"));
		Assert.assertEquals("Preço total a pagar", obterTexto(By.xpath("(//h6[text()='Preço total a pagar'])[1]")));
	}

	public void selecionarCiaAerea(String ciaAerea) {
		clicar(By.xpath("((//div//h2[text()='Companhia Aérea'])[1]//parent::div//label)[5]"));
	}

	public void selecionarVooIda() {
		scrollElementoClicar(By.xpath("((//div[text()='IDA'])[1]//parent::div//parent::div//parent::div//parent::div//div[@id='CardOption']//label)[1]"));
	}

	public void selecionarVooVolta() {
		scrollElementoClicar(By.xpath("((//div[text()='VOLTA'])[1]//parent::div//parent::div//parent::div//parent::div//div[@id='CardOption']//label)[1]"));
	}

	public void validarIdentViajantes() {
		esperarElementoFicarVisivel(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		Assert.assertEquals("Identificação dos viajantes", obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']")));
		//String texto = obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']"));
		//System.out.println("Título: " + texto);
	}

	public void digitarTelViajante1(String telViajante1) {
		escrever(By.id("grupos[0].pax[0].NumeroTelefone"), telViajante1);
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
	
	public void clicarAvancarPreReserva() {
		clicar(By.xpath("//button[text()='Avançar']"));
	}
	
	public void digitarNumCartao(String numCartao) {
		sleep(10);
		String texto = obterTexto(By.xpath("//div//h5[text()='Ocorreu um problema']"));
		
		if (texto.equals("Ocorreu um problema")) {
			System.out.println(texto + "- Há uma compra de passagem aérea para o mesmo dia!");
			fecharBrowser();
			
		} else {
			escrever(By.id("billing.numeroCartao"), numCartao);
		}
				
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
		selecionarComboBoxIndice(By.id("billing.parcelas"), 1);
	}

	public void validarCompraPassagemAerea() {
		esperarElementoFicarVisivel(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']"));
		Assert.assertEquals("Pedido de compra enviado com sucesso!", obterTexto(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']")));
	}

	public void fecharNavegador() {
		fecharBrowser();
	}

		
	
}
