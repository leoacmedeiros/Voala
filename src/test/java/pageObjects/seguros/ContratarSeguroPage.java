package pageObjects.seguros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;

public class ContratarSeguroPage extends BasePage {
	
	public void selecionarDestino(String destino) {
		selecionarComboBox(By.id("destino"), destino);
	}
	
	public void selecionarEmbarque(int diaInicio) {
		scrollPageDOWN(350);
		sleep(1);
		clicar(By.id("dataInicio"));
		
		for (int i = 0; i < 4; i++) {
			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
		}
		
		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasInicio = hoje.plusDays(diaInicio);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaInicio = qtdDiasInicio.format(formatter);
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" + inserirDiaInicio + "']"));
		
	}
	
	public void selecionarDesembarque(int diaFim) {
//		
//		for (int i = 0; i < 1; i++) {
//			clicar(By.xpath("//div[@aria-label='Move forward to switch to the next month.']"));
//		}
		
		clicar(By.id("dataFim"));				
		LocalDate hoje = LocalDate.now();
		LocalDate qtdDiasFim = hoje.plusDays(diaFim);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String inserirDiaFim = qtdDiasFim.format(formatter);
		scrollElementoClicar(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]//td[text()='" + inserirDiaFim + "']"));

	}
	
	public void clicarPesquisarSeguros() {
		clicar(By.xpath("//button[text()='Pesquisar']"));
	}

	public void validarExibicaoSeguros() {
		esperarElementoFicarVisivel(By.xpath("//div//h1[text()='Tenha um seguro viagem e aproveite ao máximo a sensação de viajar!']"));
		Assert.assertEquals("Tenha um seguro viagem e aproveite ao máximo a sensação de viajar!", 
				obterTexto(By.xpath("//div//h1[text()='Tenha um seguro viagem e aproveite ao máximo a sensação de viajar!']")));
		
	}
	
	public void selecionarSeguroBasic(String catSeguro) {
		clicar(By.xpath("//label[text()='"+catSeguro+"']//parent::div//div//input"));
	}
	
	public void selecionarSeguro() {
		clicar(By.xpath("(//div[@id='CardInsurance'])[1]//button[text()='Ver seguro']"));
	}
	
	public void validarCoberturas() {
		esperarElementoFicarVisivel(By.xpath("//div[text()='Coberturas']"));
		Assert.assertEquals("Coberturas", obterTexto(By.xpath("//div[text()='Coberturas']")));
	}
	
	public void clicarFinalizar() {
		clicar(By.xpath("//div//button[text()='Finalizar']"));
	}

	public void digitarNomeViajante(String nomeViajante) {
		escrever(By.id("grupos[0].pax[0].Nome"), nomeViajante);
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
	
	public void validarDetalhesPlanoViagem() {
		esperarElementoFicarVisivel(By.xpath("//div//h4[text()='Detalhes do plano de viagem']"));
		Assert.assertEquals("Detalhes do plano de viagem", obterTexto(By.xpath("//div//h4[text()='Detalhes do plano de viagem']")));
	}
	
	public void digitarCep(String cepTitCartao) {
		escrever(By.id("grupos[0].pax[0].cep"), cepTitCartao);
	}

	public void digitarNumEnd(String numTitCartao) {
		escrever(By.id("grupos[0].pax[0].numeroEndereco"), numTitCartao);
	}

	public void digitarCompEnd(String compTitCartao) {
		escrever(By.id("grupos[0].pax[0].complemento"), compTitCartao);
	}
	
	public void digitarNomeEmergencia(String numCartao) {
		escrever(By.id("contato.Nome"), numCartao);
	}

	public void digitarSobrenomeEmergencia(String titCartao) {
		escrever(By.id("contato.Sobrenome"), titCartao);
	}

	public void digitarTelEmergencia(String dtVencCartao) {
		escrever(By.id("contato.NumeroTelefoneContato"), dtVencCartao);
	}
	
	public void clicarDeclaracaoPassageiros() {
		clicar(By.id("termoAceiteSeguro"));
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
	
	public void validarCompraSeguro() {
		esperarElementoFicarVisivel(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']"));
		Assert.assertEquals("Pedido de compra enviado com sucesso!", obterTexto(By.xpath("//div//h3[text()='Pedido de compra enviado com sucesso!']")));
	}
	
	
	
}
