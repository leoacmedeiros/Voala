package stepDefinitions.usuario;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.login.EfetuarLoginPage;
import pageObjects.menu.MenuPage;
import pageObjects.usuario.CadastrarUsuarioPage;
import utils.GeraCpfCnpj;

public class CadastrarUsuarioSteps extends BasePage{

	CadastrarUsuarioPage cadastrarUsuario = new CadastrarUsuarioPage();
	EfetuarLoginPage efetuarLogin = new EfetuarLoginPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	MenuPage menu = new MenuPage();

	@Dado("que acesse o ambiente do Voalá")
	public void queAcesseOAmbienteDoVoalá() {
		efetuarLogin.acessarVoala();
	}
	
	@Dado("clique em Cadastre-se")
	public void cliqueEmCadastreSe() {
	    menu.acessarCadastrese();
	}
	
	@Dado("informe os dados de CPF, Senha e Confirmação da Senha")
	public void informeOsDadosDeCPFSenhaEConfirmaçãoDaSenha(DataTable dataTable) {
		String cpf = gerador.cpf(false);
	    cadastrarUsuario.digitarCpf(cpf);
	    cadastrarUsuario.digitarSenha(dataTable.cell(1,1));
	    cadastrarUsuario.digitarConfSenha(dataTable.cell(2,1));
	}
	
	@Dado("clique em Criar Conta")
	public void cliqueEmCriarConta() {
	    cadastrarUsuario.clicarCriarConta();
	}
	
	@Dado("preencha o formulário Meus Dados")
	public void preenchaOFormulárioMeusDados(DataTable dataTable) {
	    cadastrarUsuario.digitarNome(dataTable.cell(0,1));
	    cadastrarUsuario.digitarSobrenome(dataTable.cell(1,1));
	    cadastrarUsuario.digitarEmail(dataTable.cell(2, 1));
	    cadastrarUsuario.digitarDataNascimento(dataTable.cell(3,1));
	    cadastrarUsuario.selecionarSexo(dataTable.cell(4,1));
	}
	
	@Dado("clique no botão para continuar")
	public void cliqueNoBotãoParaContinuar() {
	    cadastrarUsuario.clicarContinuar();
	}
	
	@Dado("preencha o formulário de Endereço")
	public void preenchaOFormulárioDeEndereço(DataTable dataTable) {
	    cadastrarUsuario.digitarTelefone(dataTable.cell(0,1));
	    cadastrarUsuario.digitarCep(dataTable.cell(1,1));
	    cadastrarUsuario.digitarNumero(dataTable.cell(2,1));
	    cadastrarUsuario.digitarComplemento(dataTable.cell(3,1));
	}
	
	@Quando("clicar em Finalizar")
	public void clicarEmFinalizar() {
	    cadastrarUsuario.ClicarFinalizar();
	}
	
	@Então("o usuário será criado")
	public void oUsuárioSeráCriado() {
	    cadastrarUsuario.validarUsuarioCadastrado();
	   
	}


}
