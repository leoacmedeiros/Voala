package pageObjects.hospedagens;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;

public class PagamentoCompartilhadoHospedagemPage extends BasePage {

	public void selecionarPagCompartilhado() {
		clicar(By.xpath("(//label//div[text()='Pagamento Compartilhado']//parent::label//parent::div//label)[1]"));
	}

	public void adicionarPagante() {
		clicar(By.xpath("//button//span[text()='Adicionar um novo pagante']"));
	}

	public void digitarNomePagante2(String nomePagante2) {
		escrever(By.id("reservaCompartilhada.pagantes[1].primeiroNome"), nomePagante2);
	}

	public void digitarEmailPagante2(String emailPagante2) {
		escrever(By.id("reservaCompartilhada.pagantes[1].email"), emailPagante2);
	}

	public void clicarDividirValoresIgualmente() {
		clicar(By.xpath("//button//span[text()='Dividir valores igualmente']"));
	}

	public void validarValorCompartilhado() {
		
		Assert.assertNotNull(obterTexto(By.id("reservaCompartilhada.pagantes[0].valor")));
		Assert.assertNotNull(obterTexto(By.id("reservaCompartilhada.pagantes[1].valor")));
		
		esperarElementoFicarVisivel(By.xpath("(//div//h4[text()='Pagamento Compartilhado'])[2]"));
		Assert.assertEquals("Pagamento Compartilhado", obterTexto(By.xpath("(//div//h4[text()='Pagamento Compartilhado'])[2]")));
		
		//Assert.assertEquals("Identificação dos viajantes", obterTexto(By.xpath("//div//h1[text()='Identificação dos viajantes']")));
		//WebElement valor1 = DriverFactory.getDriver().findElement(By.id("reservaCompartilhada.pagantes[0].valor")).size() != 0);
//		String valor1 = obterTexto(By.id("reservaCompartilhada.pagantes[0].valor"));
//		valor1.isEmpty();
//		
//		if (DriverFactory.getDriver().findElements(By.id("reservaCompartilhada.pagantes[0].valor")).size() != 0){
//			System.out.println("Elemento está presente");
//
//			} else {
//				System.out.println("Elemento não está presente");
//				
//			}
	}
	

	public void clicarEfetuarPagamento() {
		clicar(By.xpath("//button//span[text()='Efetuar meu pagamento']"));
	}
	
	public void validarExibicaoDadosCartao() {
		esperarElementoFicarVisivel(By.xpath("//div[@id='PaymentForm']//div//h4[text()='Dados do Cartão']"));
		Assert.assertEquals("Dados do Cartão", obterTexto(By.xpath("//div[@id='PaymentForm']//div//h4[text()='Dados do Cartão']")));
	}
	
	public void digitarNumCartao(String numCartao) {
		escrever(By.id("reservaCompartilhada.billing.numeroCartao"), numCartao);
	}

	public void digitarTitCartao(String titCartao) {
		escrever(By.id("reservaCompartilhada.billing.nomeTitularCartao"), titCartao);
	}

	public void digitarDtVencCartao(String dtVencCartao) {
		escrever(By.id("reservaCompartilhada.billing.dataVencimento"), dtVencCartao);
	}

	public void digitarCvvCartao(String cvvCartao) {
		escrever(By.id("reservaCompartilhada.billing.cvc"), cvvCartao);
	}

	public void digitarNomeTitCartao(String nomeTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.primeiroNome"), nomeTitCartao);
	}

	public void digitarSobrenomeTitCartao(String sobrenomeTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.ultimoNome"), sobrenomeTitCartao);
	}

	public void digitarEmailTitCartao(String emailTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.email"), emailTitCartao);
	}

	public void digitarConfEmailTitCartao(String confEmailTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.confimacaoEmail"), confEmailTitCartao);
	}

	public void digitarCpfTitCartao(String cpfTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.cpf"), cpfTitCartao);
	}

	public void digitarDtNascTitCartao(String dtNascTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.dataNascimento"), dtNascTitCartao);
	}

	public void selecionarSexoTitCartao(String sexoTitCartao) {
		selecionarComboBox(By.id("reservaCompartilhada.billing.sexo"), sexoTitCartao);
	}

	public void digitarTelTitCartao(String telTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.numeroTelefone"), telTitCartao);
	}

	public void digitarCepTitCartao(String cepTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.cep"), cepTitCartao);
	}

	public void digitarNumEndTitCartao(String numTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.numeroEndereco"), numTitCartao);
	}

	public void digitarCompEndTitCartao(String compTitCartao) {
		escrever(By.id("reservaCompartilhada.billing.complemento"), compTitCartao);
	}

	public void selecionarParcelas() {
		//Select dropdown = new Select(DriverFactory.getDriver().findElement(By.id("billing.parcelas")));
		//dropdown.selectByIndex(3);
		selecionarComboBoxIndice(By.id("reservaCompartilhada.billing.parcelas"), 1);
	}
	
	
	
	
	
	
	
	
}
