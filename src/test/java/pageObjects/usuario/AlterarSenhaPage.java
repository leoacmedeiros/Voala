package pageObjects.usuario;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;

public class AlterarSenhaPage extends BasePage {

	public void clicarMinhaConta() {
		clicar(By.xpath("//span[text()='Bem vindo,']"));
		clicar(By.xpath("//div//a[text()='Minha conta']"));
	}
	
	public void clicarCrieNovaSenha() {
		clicar(By.xpath("//span[text()='Crie uma nova senha']"));
	}
	
	public void digitarSenhaAntiga(String senhaAntiga) {
		escrever(By.id("SenhaAntiga"), senhaAntiga);
	}

	public void digitarSenhaNova(String senhaNova) {
		escrever(By.id("SenhaNova"), senhaNova);
	}

	public void digitarConfNovaSenha(String confirmacaoSenha) {
		escrever(By.id("ConfirmacaoSenha"), confirmacaoSenha);
	}

	public void clicarAlterarSenha() {
		clicar(By.xpath("//button[text()='alterar a senha']"));
	}
	
	public void verificarMsgSenha() {
		//String texto = obterTexto(By.xpath("//a//div//p[contains(text(),'LEONARDO')]"));
		//System.out.println("Usuário cadastrado: " + texto);
		esperarElementoFicarVisivel(By.xpath("//span[text()='A senha tem que conter letras e numeros']"));
		Assert.assertEquals("A senha tem que conter letras e numeros", obterTexto(By.xpath("//span[text()='A senha tem que conter letras e numeros']")));
	}
	
	public void digitarSenhaNova2(String senhaNova2) {
		forcarLimpar(By.id("SenhaNova"));
		escrever(By.id("SenhaNova"), senhaNova2);
	}

	public void digitarConfNovaSenha2(String confirmacaoSenha2) {
		forcarLimpar(By.id("ConfirmacaoSenha"));
		escrever(By.id("ConfirmacaoSenha"), confirmacaoSenha2);
	}

	public void verificarSenhaAlterada() {
		esperarElementoFicarVisivel(By.xpath("//div[text()='Senha alterada com sucesso.']//strong"));
		Assert.assertEquals("Aviso!", obterTexto(By.xpath("//div[text()='Senha alterada com sucesso.']//strong")));
	}

	
	
	
}
