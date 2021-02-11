package stepDefinitions.hospedagens;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.hospedagens.ComprarHospedagemPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

public class ComprarHospedagemSteps extends BasePage{

	GeraCpfCnpj gerador = new GeraCpfCnpj();
	MenuPage menu = new MenuPage();
	ComprarHospedagemPage comprarHospedagem = new ComprarHospedagemPage();
	
	
	@Dado("acesse o menu Hospedagem")
	public void acesseOMenuHospedagem() {
	    menu.acessarHospedagens();
	}
	
	@Dado("informe os dados de Destino, Check-in, Check-out para Hospedagem")
	public void informeOsDadosDeDestinoCheckInCheckOutParaHospedagem(DataTable dataTable) {
	    comprarHospedagem.digitarDestino(dataTable.cell(0,1));
	    comprarHospedagem.selecionarDataInicioHospedagem("10");
	    comprarHospedagem.selecionarDataFimHospedagem("15");
	}
	
	@Dado("clique para Pesquisar as Hospedagens")
	public void cliqueParaPesquisarAsHospedagens() {
	    comprarHospedagem.clicarPesquisarHospedagem();
	}
	
	@Então("irá exibir os hotéis disponíveis para Hospedagem")
	public void iráExibirOsHotéisDisponíveisParaHospedagem() {
	    
	}
	
	@Então("pesquise o Nome do Hotel para Hospedar")
	public void pesquiseONomeDoHotelParaHospedar(DataTable dataTable) {
	    comprarHospedagem.digitarNomeHotelPesq(dataTable.cell(0,1));
	}
	
	@Então("acesse o hotel pesquisado para Hospedar")
	public void acesseOHotelPesquisadoParaHospedar() {
	    comprarHospedagem.selecionarHotel();
	}
	
	@Então("selecione o quarto da Hospedagem")
	public void selecioneOQuartoDaHospedagem() {
	    comprarHospedagem.selecionarQuarto();
	}
	
	@Então("irá exibir os dados de identificação para preenchimento")
	public void iráExibirOsDadosDeIdentificaçãoParaPreenchimento() {
	    comprarHospedagem.validarIdentViajantes();
	}
	
	@Quando("informar os dados do Titular do Quarto um")
	public void informarOsDadosDoTitularDoQuartoUm(DataTable dataTable) {
	    comprarHospedagem.digitarTelViajante1(dataTable.cell(0,1));
	}
	
	@Quando("informar os dados do Cartão para Pagamento da Hospedagem")
	public void informarOsDadosDoCartãoParaPagamentoDaHospedagem(DataTable dataTable) {
	    comprarHospedagem.digitarNumCartao(dataTable.cell(0,1));
	    comprarHospedagem.digitarTitCartao(dataTable.cell(1,1));
	    comprarHospedagem.digitarDtVencCartao(dataTable.cell(2,1));
	    comprarHospedagem.digitarCvvCartao(dataTable.cell(3,1));
	}
	
	@Quando("informar os dados do Titular do Cartão para realizar a Hospedagem")
	public void informarOsDadosDoTitularDoCartãoParaRealizarAHospedagem(DataTable dataTable) {
		comprarHospedagem.digitarNomeTitCartao(dataTable.cell(0,1));
		comprarHospedagem.digitarSobrenomeTitCartao(dataTable.cell(1,1));
		comprarHospedagem.digitarEmailTitCartao(dataTable.cell(2,1));
		comprarHospedagem.digitarConfEmailTitCartao(dataTable.cell(3,1));
		comprarHospedagem.digitarCpfTitCartao(dataTable.cell(4,1));
		comprarHospedagem.digitarDtNascTitCartao(dataTable.cell(5,1));
		comprarHospedagem.selecionarSexoTitCartao(dataTable.cell(6,1));
		comprarHospedagem.digitarTelTitCartao(dataTable.cell(7,1));
	}
	
	@Quando("informar o endereço do Titular do Cartão para realizar a Hospedagem")
	public void informarOEndereçoDoTitularDoCartãoParaRealizarAHospedagem(DataTable dataTable) {
		comprarHospedagem.digitarCepTitCartao(dataTable.cell(0,1));
		comprarHospedagem.digitarNumEndTitCartao(dataTable.cell(1,1));
		comprarHospedagem.digitarCompEndTitCartao(dataTable.cell(2,1));
	}
	
	@Quando("informar a quantidade de parcelas para pagamento da Hospedagem")
	public void informarAQuantidadeDeParcelasParaPagamentoDaHospedagem(DataTable dataTable) {
	    comprarHospedagem.selecionarParcelas();
	}
	
	@Então("a Hospedagem será comprada")
	public void aHospedagemSeráComprada() {
		comprarHospedagem.validarCompraPacote();
		//fecharBrowser();
	}
	
}
