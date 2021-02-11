package stepDefinitions.usuario;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.usuario.AlterarSenhaPage;

public class AlterarSenhaSteps extends BasePage{

	AlterarSenhaPage alterarSenha = new AlterarSenhaPage();
	
	@Dado("que acesse Minha Conta")
	public void queAcesseMinhaConta() {
	    alterarSenha.clicarMinhaConta();
	}

	@Dado("clique para criar uma nova senha")
	public void cliqueParaCriarUmaNovaSenha() {
		alterarSenha.clicarCrieNovaSenha();
	}

	@Dado("informe a senha antiga")
	public void informeASenhaAntiga(DataTable dataTable) {
	    alterarSenha.digitarSenhaAntiga(dataTable.cell(0,1));
	}

	@Dado("informe a nova senha")
	public void informeANovaSenha(DataTable dataTable) {
	    alterarSenha.digitarSenhaNova(dataTable.cell(0,1));
	    alterarSenha.digitarConfNovaSenha(dataTable.cell(1,1));
	    alterarSenha.clicarAlterarSenha();
	}

	@Então("deverá apresentar mensagem que a senha deve conter letras e números")
	public void deveráApresentarMensagemQueASenhaDeveConterLetrasENúmeros() {
	    alterarSenha.verificarMsgSenha();
	}

	@Então("informe uma nova senha")
	public void informeUmaNovaSenha(DataTable dataTable) {
	    alterarSenha.digitarSenhaNova2(dataTable.cell(0,1));
	    alterarSenha.digitarConfNovaSenha2(dataTable.cell(1,1));
	    alterarSenha.clicarAlterarSenha();
	}

	@Então("a senha vai ser alterada com sucesso")
	public void aSenhaVaiSerAlteradaComSucesso() {
	    alterarSenha.verificarSenhaAlterada();
	    //fecharBrowser();
	}

}
