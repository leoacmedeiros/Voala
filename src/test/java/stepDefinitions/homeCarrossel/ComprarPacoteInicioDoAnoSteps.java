package stepDefinitions.homeCarrossel;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.homeCarrossel.ComprarPacoteInicioDoAnoPage;


public class ComprarPacoteInicioDoAnoSteps extends BasePage{
	
	ComprarPacoteInicioDoAnoPage pacoteInicioDoAno = new ComprarPacoteInicioDoAnoPage();
	
	@Dado("selecione um Pacote de Início do Ano para comprar")
	public void selecioneUmPacoteDeInícioDoAnoParaComprar() {
	    pacoteInicioDoAno.selecionarPromocaoPacoteInicioDeAno();
	}

	@Então("irá exibir as opções que o Pacote de Início de Ano oferece")
	public void iráExibirAsOpçõesQueOPacoteDeInícioDeAnoOferece() {
	    pacoteInicioDoAno.aguardarBotaoComprar();
	}
	

}
