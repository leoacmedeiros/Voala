package stepDefinitions.hospedagens;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.hospedagens.PagamentoCompartilhadoHospedagemPage;
import utils.GeraCpfCnpj;

public class PagamentoCompartilhadoHospedagemSteps extends BasePage{

	GeraCpfCnpj gerador = new GeraCpfCnpj();
	PagamentoCompartilhadoHospedagemPage pagCompartilhado = new PagamentoCompartilhadoHospedagemPage();
	
	
	@Quando("selecionar a opção Pagamento Compartilhado")
	public void selecionarAOpçãoPagamentoCompartilhado() {
	    pagCompartilhado.selecionarPagCompartilhado();
	}

	@Quando("adicionar mais um Pagante")
	public void adicionarMaisUmPagante() {
	    pagCompartilhado.adicionarPagante();
	}

	@Quando("inserir os dados do Pagante adicional")
	public void inserirOsDadosDoPaganteAdicional(DataTable dataTable) {
	    pagCompartilhado.digitarNomePagante2(dataTable.cell(0,1));
	    pagCompartilhado.digitarEmailPagante2(dataTable.cell(1,1));
	}

	@Quando("clicar para Dividir Valores Igualmente")
	public void clicarParaDividirValoresIgualmente() {
	    pagCompartilhado.clicarDividirValoresIgualmente();
	}

	@Então("os valores serão divididos igualmente entre os Pagantes")
	public void osValoresSerãoDivididosIgualmenteEntreOsPagantes() {
	    pagCompartilhado.validarValorCompartilhado();
	}

	@Quando("clicar para Efetuar meu pagamento")
	public void clicarParaEfetuarMeuPagamento() {
	    pagCompartilhado.clicarEfetuarPagamento();
	}

	@Então("irá exibir os dados do cartão para pagamento compartilhado")
	public void iráExibirOsDadosDoCartãoParaPagamentoCompartilhado() {
	    pagCompartilhado.validarExibicaoDadosCartao();
	}
	
	@Então("informar os dados do Cartão para Pagamento da Hospedagem Compartilhada")
	public void informarOsDadosDoCartãoParaPagamentoDaHospedagemCompartilhada(DataTable dataTable) {
		pagCompartilhado.digitarNumCartao(dataTable.cell(0,1));
		pagCompartilhado.digitarTitCartao(dataTable.cell(1,1));
		pagCompartilhado.digitarDtVencCartao(dataTable.cell(2,1));
		pagCompartilhado.digitarCvvCartao(dataTable.cell(3,1));
	}

	@Então("informar os dados do Titular do Cartão para realizar a Hospedagem Compartilhada")
	public void informarOsDadosDoTitularDoCartãoParaRealizarAHospedagemCompartilhada(DataTable dataTable) {
		pagCompartilhado.digitarNomeTitCartao(dataTable.cell(0,1));
		pagCompartilhado.digitarSobrenomeTitCartao(dataTable.cell(1,1));
		pagCompartilhado.digitarEmailTitCartao(dataTable.cell(2,1));
		pagCompartilhado.digitarConfEmailTitCartao(dataTable.cell(3,1));
		pagCompartilhado.digitarCpfTitCartao(dataTable.cell(4,1));
		pagCompartilhado.digitarDtNascTitCartao(dataTable.cell(5,1));
		pagCompartilhado.selecionarSexoTitCartao(dataTable.cell(6,1));
		pagCompartilhado.digitarTelTitCartao(dataTable.cell(7,1));
	}

	@Então("informar o endereço do Titular do Cartão para realizar a Hospedagem Compartilhada")
	public void informarOEndereçoDoTitularDoCartãoParaRealizarAHospedagemCompartilhada(DataTable dataTable) {
		pagCompartilhado.digitarCepTitCartao(dataTable.cell(0,1));
		pagCompartilhado.digitarNumEndTitCartao(dataTable.cell(1,1));
		pagCompartilhado.digitarCompEndTitCartao(dataTable.cell(2,1));
	}

	@Então("informar a quantidade de parcelas para pagamento da Hospedagem Compartilhada")
	public void informarAQuantidadeDeParcelasParaPagamentoDaHospedagemCompartilhada(DataTable dataTable) {
		pagCompartilhado.selecionarParcelas();
		//fecharBrowser();
	}
	
}
