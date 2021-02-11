package stepDefinitions.passagensAereas;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.passagensAereas.ComprarPassagemAereaPage;
import utils.GeraCpfCnpj;

public class ComprarPassagemAereaSteps extends BasePage{

	GeraCpfCnpj gerador = new GeraCpfCnpj();
	MenuPage menu = new MenuPage();
	ComprarPassagemAereaPage comprarPassAerea = new ComprarPassagemAereaPage();
	
	@Dado("acesse o menu Passagens Aéreas")
	public void acesseOMenuPassagensAéreas() {
		menu.acessarPassagensAereas();
	}

	@Dado("selecione a opção de Ida e Volta")
	public void selecioneAOpçãoDeIdaEVolta() {
	    
	}

	@Dado("digite a cidade de origem")
	public void digiteACidadeDeOrigem(DataTable dataTable) {
	    comprarPassAerea.digitarOrigem(dataTable.cell(0,1));
	}

	@Dado("digite a cidade de destino")
	public void digiteACidadeDeDestino(DataTable dataTable) {
		comprarPassAerea.digitarDestino(dataTable.cell(0,1));
	}

	@Dado("selecione a data de Ida e Volta do Voo")
	public void selecioneADataDeIdaEVoltaDoVoo(DataTable dataTable) {
		comprarPassAerea.selecionarDataVooIda(dataTable.cell(0,1));
		comprarPassAerea.selecionarDataVooVolta(dataTable.cell(1,1));
	}

	@Dado("clique para Pesquisar os Voos")
	public void cliqueParaPesquisarOsVoos() {
		comprarPassAerea.clicarPesquisarVoo();
	}

	@Então("irá exibir os Voos disponíveis")
	public void iráExibirOsVoosDisponíveis() {
		comprarPassAerea.exibirVoosDisponiveis();
	}

	@Então("selecionar a Companhia Aérea")
	public void selecionarACompanhiaAérea(DataTable dataTable) {
		comprarPassAerea.selecionarCiaAerea(dataTable.cell(0,1));
	}

	@Então("selecionar os Voos de Ida e Volta")
	public void selecionarOsVoosDeIdaEVolta() {
		comprarPassAerea.selecionarVooIda();
		comprarPassAerea.selecionarVooVolta();
	}

	@Quando("informar os dados do viajante do Voo um")
	public void informarOsDadosDoViajanteDoVooUm(DataTable dataTable) {
		comprarPassAerea.validarIdentViajantes();
		comprarPassAerea.digitarTelViajante1(dataTable.cell(0,1));
	}

	@Quando("informar os dados do viajante do Voo dois")
	public void informarOsDadosDoViajanteDoVooDois(DataTable dataTable) {
		comprarPassAerea.digitarNomeViajante2(dataTable.cell(0,1));
		comprarPassAerea.digitarSobrenomeViajante2(dataTable.cell(1,1));
		comprarPassAerea.selecionarSexoViajante2(dataTable.cell(2,1));
		comprarPassAerea.digitarDtNascViajante2(dataTable.cell(3,1));
	}

	@Então("irá ser feito uma pré reserva")
	public void iráSerFeitoUmaPréReserva() {
	    comprarPassAerea.clicarAvancarPreReserva();
	}

	@Então("informar os dados do Cartão para Pagamento do Voo")
	public void informarOsDadosDoCartãoParaPagamentoDoVoo(DataTable dataTable) {
		comprarPassAerea.digitarNumCartao(dataTable.cell(0,1));
		comprarPassAerea.digitarTitCartao(dataTable.cell(1,1));
		comprarPassAerea.digitarDtVencCartao(dataTable.cell(2,1));
		comprarPassAerea.digitarCvvCartao(dataTable.cell(3,1));
	}

	@Então("informar os dados do Titular do Cartão do passageiro do Voo")
	public void informarOsDadosDoTitularDoCartãoDoPassageiroDoVoo(DataTable dataTable) {
		comprarPassAerea.digitarNomeTitCartao(dataTable.cell(0,1));
		comprarPassAerea.digitarSobrenomeTitCartao(dataTable.cell(1,1));
		comprarPassAerea.digitarEmailTitCartao(dataTable.cell(2,1));
		comprarPassAerea.digitarConfEmailTitCartao(dataTable.cell(3,1));
		comprarPassAerea.digitarCpfTitCartao(dataTable.cell(4,1));
		comprarPassAerea.digitarDtNascTitCartao(dataTable.cell(5,1));
		comprarPassAerea.selecionarSexoTitCartao(dataTable.cell(6,1));
		comprarPassAerea.digitarTelTitCartao(dataTable.cell(7,1));
	}

	@Então("informar o endereço do Titular do Cartão do passageiro do Voo")
	public void informarOEndereçoDoTitularDoCartãoDoPassageiroDoVoo(DataTable dataTable) {
		comprarPassAerea.digitarCepTitCartao(dataTable.cell(0,1));
		comprarPassAerea.digitarNumEndTitCartao(dataTable.cell(1,1));
		comprarPassAerea.digitarCompEndTitCartao(dataTable.cell(2,1));
	}

	@Então("informar a quantidade de parcelas do pagamento do Voo")
	public void informarAQuantidadeDeParcelasDoPagamentoDoVoo(DataTable dataTable) {
		comprarPassAerea.selecionarParcelas();
	}

	@Então("o Voo será comprado")
	public void oVooSeráComprado() {
	    comprarPassAerea.validarCompraPassagemAerea();
	    comprarPassAerea.fecharNavegador();
	    //fecharBrowser();
	}
	
}
