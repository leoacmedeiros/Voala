package pageObjects.usuario;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class CadastrarUsuarioPage extends BasePage {

	private static String HML = "http://voala-hml.bancorbras.com.br";

	public void acessarVoala() {
		DriverFactory.getDriver().get(HML);
	}

	public void clicarCadastrese() {
		clicar(By.xpath("//ul[@class='navbar-nav ml-md-auto text-center desktop']//div//a[contains(text(),'Cadastre-se')]"));
	}
	
	public void digitarCpf(String cpf) {
		escrever(By.id("CPF"), cpf);
	}
	
	public void digitarSenha(String senha) {
		escrever(By.id("Senha"), senha);
	}
	
	public void digitarConfSenha(String confSenha) {
		escrever(By.id("Confirmação da senha"), confSenha);
	}

	public void clicarCriarConta() {
		clicar(By.xpath("//button//span[contains(text(),'Criar conta')]"));
	}

	public void digitarNome(String nome) {
		escrever(By.id("Nome"), nome);
	}

	public void digitarSobrenome(String sobrenome) {
		escrever(By.id("Sobrenome"), sobrenome);
	}

	public void digitarEmail(String email) {
		escrever(By.id("Email"), email);
	}

	public void digitarDataNascimento(String dataNasc) {
		escrever(By.id("DataNascimento"), dataNasc);
	}

	public void selecionarSexo(String sexo) {
		selecionarComboBox(By.id("Sexo"), sexo);
	}

	public void clicarContinuar() {
		clicar(By.xpath("//button//span[contains(text(),'Só mais uma. Prometo!')]"));
	}

	public void digitarTelefone(String numTelefone) {
		escrever(By.id("NumeroTelefone"), numTelefone);
	}

	public void digitarCep(String cep) {
		escrever(By.id("Endereco.Cep"), cep);
	}

	public void digitarNumero(String numero) {
		escrever(By.id("Endereco.Numero"), numero);
	}

	public void digitarComplemento(String complemento) {
		escrever(By.id("Endereco.Complemento"), complemento);
	}

	public void ClicarFinalizar() {
		clicar(By.xpath("//button//span[text()='Finalizar']"));
	}

	public void validarUsuarioCadastrado() {
//		return cabecalho.contains("Ínício");
		esperarElementoFicarVisivel(By.xpath("//a//div//p[contains(text(),'LEONARDO')]"));
		String texto = obterTexto(By.xpath("//a//div//p[contains(text(),'LEONARDO')]"));
		Assert.assertEquals("LEONARDO", obterTexto(By.xpath("//a//div//p[contains(text(),'LEONARDO')]")));
		sleep(1);
		System.out.println("Usuário cadastrado: " + texto);
	}
	
	
	
	
}
