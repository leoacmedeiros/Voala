package stepDefinitions.login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.login.EfetuarLoginPage;

public class EfetuarLoginSteps {

	EfetuarLoginPage efetuarLogin = new EfetuarLoginPage();

	
	@Quando("informar os dados de logon")
	public void informarOsDadosDeLogon(DataTable dataTable) {
	    efetuarLogin.digitarCpf(dataTable.cell(0,1));
	    efetuarLogin.digitarSenha(dataTable.cell(1,1));
	}
	
	@Quando("clicar em Login")
	public void clicarEmLogin() {
	    efetuarLogin.clicarLogin();
	}


	@Então("deverá entrar no sistema")
	public void deveráEntrarNoSistema() {
	    
	}


}
