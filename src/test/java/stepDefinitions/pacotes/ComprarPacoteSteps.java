package stepDefinitions.pacotes;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.pacotes.ComprarPacotePage;

public class ComprarPacoteSteps extends BasePage{

	MenuPage menu = new MenuPage();
	ComprarPacotePage comprarPacote = new ComprarPacotePage();

	@Dado("acesse o menu Pacotes")
	public void acesseOMenuPacotes() {
	    menu.acessarPacotes();
	}

	@Dado("informe os dados de Origem, Destino, Check-in, Check-out para pesquisar")
	public void informeOsDadosDeOrigemDestinoCheckInCheckOutParaPesquisar(DataTable dataTable) {
	   comprarPacote.digitarOrigem(dataTable.cell(0,1));
	   comprarPacote.digitarDestino(dataTable.cell(1,1));
	   comprarPacote.selecionarDataInicioPacote(dataTable.cell(2,1));
	   comprarPacote.selecionarDataFimPacote(dataTable.cell(3,1));
	   
	}

	@Dado("clique para Pesquisar os Pacotes")
	public void cliqueParaPesquisarOsPacotes() {
	    comprarPacote.clicarPesquisarPacote();
	}

	@Então("irá exibir os hotéis disponíveis")
	public void iráExibirOsHotéisDisponíveis() {
	   
	}

	@Então("realize a pesquisa por Nome do Hotel")
	public void realizeAPesquisaPorNomeDoHotel(DataTable dataTable) {
	    comprarPacote.digitarNomeHotelPesq(dataTable.cell(0,1));
	}

	@Então("acesse o hotel pesquisado")
	public void acesseOHotelPesquisado() {
	    comprarPacote.selecionarHotel();
	}

	@Então("irá exibir os quartos disponíveis para seleção")
	public void iráExibirOsQuartosDisponíveisParaSeleção() {
	    
	}

	@Então("selecione o quarto")
	public void selecioneOQuarto() {
	    comprarPacote.selecionarQuarto();
	}

	@Então("irá exibir os voos disponíveis")
	public void iráExibirOsVoosDisponíveis() {
	   
	}

	@Então("selecione o voo de Ida e Volta")
	public void selecioneOVooDeIdaEVolta() {
	    comprarPacote.selecionarCiaAerea();
	    comprarPacote.selecionarVooIda();
	    comprarPacote.selecionarVooVolta();
	}

	@Então("clique em Adicionar")
	public void cliqueEmAdicionar() {
	    comprarPacote.clicarAdicionarVoo();
	}

	@Quando("escolher a tarifa")
	public void escolherATarifa() {
	    comprarPacote.selecionarTarifa();
	}

	@Então("irá ser exibida a tela de login")
	public void iráSerExibidaATelaDeLogin() {
	    
	}

	@Então("irá exibir os dados de identificação dos viajantes para preenchimento")
	public void iráExibirOsDadosDeIdentificaçãoDosViajantesParaPreenchimento() {
	    comprarPacote.validarIdentViajantes();
	}

	@Quando("informar os dados do viajante um")
	public void informarOsDadosDoViajanteUm(DataTable dataTable) {
		comprarPacote.digitarTelViajante1(dataTable.cell(0,1));
		comprarPacote.digitarDtNasc(dataTable.cell(1,1));
	}

	@Quando("informar os dados do viajante dois")
	public void informarOsDadosDoViajanteDois(DataTable dataTable) {
	    comprarPacote.digitarNomeViajante2(dataTable.cell(0,1));
	    comprarPacote.digitarSobrenomeViajante2(dataTable.cell(1,1));
	    comprarPacote.selecionarSexoViajante2(dataTable.cell(2,1));
	    comprarPacote.digitarDtNascViajante2(dataTable.cell(3,1));
	}
	
	@Quando("informar os dados do Cartão para Pagamento")
	public void informarOsDadosDoCartãoParaPagamento(DataTable dataTable) {
	    comprarPacote.digitarNumCartao(dataTable.cell(0,1));
	    comprarPacote.digitarTitCartao(dataTable.cell(1,1));
	    comprarPacote.digitarDtVencCartao(dataTable.cell(2,1));
	    comprarPacote.digitarCvvCartao(dataTable.cell(3,1));
	}

	@Quando("informar os dados do Titular do Cartão")
	public void informarOsDadosDoTitularDoCartão(DataTable dataTable) {
	   comprarPacote.digitarNomeTitCartao(dataTable.cell(0,1)); 
	   comprarPacote.digitarSobrenomeTitCartao(dataTable.cell(1,1));
	   comprarPacote.digitarEmailTitCartao(dataTable.cell(2,1));
	   comprarPacote.digitarConfEmailTitCartao(dataTable.cell(3,1));
	   comprarPacote.digitarCpfTitCartao(dataTable.cell(4,1));
	   comprarPacote.digitarDtNascTitCartao(dataTable.cell(5,1));
	   comprarPacote.selecionarSexoTitCartao(dataTable.cell(6,1));
	   comprarPacote.digitarTelTitCartao(dataTable.cell(7,1));
	}

	@Quando("informar o endereço do Titular do Cartão")
	public void informarOEndereçoDoTitularDoCartão(DataTable dataTable) {
	   comprarPacote.digitarCepTitCartao(dataTable.cell(0,1)); 
	   comprarPacote.digitarNumTitCartao(dataTable.cell(1,1));
	   comprarPacote.digitarCompTitCartao(dataTable.cell(2,1));
	}

	@Quando("informar a quantidade de parcelas")
	public void informarAQuantidadeDeParcelas(DataTable dataTable) {
	    comprarPacote.selecionarParcelas();
	}

	@Quando("clicar para aceitar os termos e condições gerais")
	public void clicarParaAceitarOsTermosECondiçõesGerais() {
	    comprarPacote.clicarAceiteTermos();
	}

	@Quando("clicar para Confirmar Compra")
	public void clicarParaConfirmarCompra() {
	    comprarPacote.confirmarCompra();
	}

	@Então("o pacote será comprado")
	public void oPacoteSeráComprado() {
	    comprarPacote.validarCompraPacote();
	    //fecharBrowser();
	}

}
