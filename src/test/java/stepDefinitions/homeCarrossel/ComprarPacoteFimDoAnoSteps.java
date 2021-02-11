package stepDefinitions.homeCarrossel;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.homeCarrossel.ComprarPacoteFimDoAnoPage;


public class ComprarPacoteFimDoAnoSteps extends BasePage{
	
	ComprarPacoteFimDoAnoPage pacoteFimDeAno = new ComprarPacoteFimDoAnoPage();

	@Dado("selecione um Pacote de Fim de Ano para comprar")
	public void selecioneUmPacoteDeFimDeAnoParaComprar() {
	   pacoteFimDeAno.selecionarPromocaoPacoteFimDeAno();
	}

	@Então("irá exibir as opções que o Pacote oferece")
	public void iráExibirAsOpçõesQueOPacoteOferece() {
	    pacoteFimDeAno.aguardarBotaoComprar();
	}

	@Então("clicar para Comprar o Pacote")
	public void clicarParaComprarOPacote() {
	    pacoteFimDeAno.clicarComprar();
	}

}
