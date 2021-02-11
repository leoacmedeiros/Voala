package stepDefinitions.seguros;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.seguros.ContratarSeguroPage;
import utils.GeraCpfCnpj;

public class ContratarSeguroSteps extends BasePage{

	GeraCpfCnpj gerador = new GeraCpfCnpj();
	MenuPage menu = new MenuPage();
	ContratarSeguroPage contratarSeguro = new ContratarSeguroPage();
	
	
	@Dado("acesse o menu Seguros")
	public void acesseOMenuSeguros() {
	    menu.acessarSeguros();
	}

	@Dado("informe o destino")
	public void informeODestino(DataTable dataTable) {
	    contratarSeguro.selecionarDestino(dataTable.cell(0,1));
	}

	@Dado("selecione a data de Embarque")
	public void selecioneADataDeEmbarque(DataTable dataTable) {
	    contratarSeguro.selecionarEmbarque(0);
	}

	@Dado("selecione a data de Desembarque")
	public void selecioneADataDeDesembarque(DataTable dataTable) {
		contratarSeguro.selecionarDesembarque(1);
	}

	@Dado("selecione a quantidade de Passageiros")
	public void selecioneAQuantidadeDePassageiros() {
	}

	@Dado("clique para Pesquisar os Seguros")
	public void cliqueParaPesquisarOsSeguros() {
		contratarSeguro.clicarPesquisarSeguros();
	}

	@Então("irá exibir os Seguros disponíveis para contratação")
	public void iráExibirOsSegurosDisponíveisParaContratação() {
	    //contratarSeguro.validarExibicaoSeguros();
	}

	@Então("selecione a Categoria Basic")
	public void selecioneACategoriaBasic(DataTable dataTable) {
	    contratarSeguro.selecionarSeguroBasic(dataTable.cell(0,1));
	}

	@Então("clique em ver o primeiro seguro Basic")
	public void cliqueEmVerOPrimeiroSeguroBasic() {
		contratarSeguro.selecionarSeguro();
	}

	@Então("irá exibir as coberturas do Seguro")
	public void iráExibirAsCoberturasDoSeguro() {
	    contratarSeguro.validarCoberturas();
	}
	
	@Quando("clicar em Finalizar o Seguro")
	public void clicarEmFinalizarOSeguro() {
		contratarSeguro.clicarFinalizar();
	}

	@Então("informar os dados do viajante do Seguro")
	public void informarOsDadosDoViajanteDoSeguro(DataTable dataTable) {
		String cpf = gerador.cpf(false);
		contratarSeguro.digitarNomeViajante(dataTable.cell(0,1));
		contratarSeguro.digitarSobrenomeViajante(dataTable.cell(1,1));
		contratarSeguro.digitarCpfViajante(cpf);
		contratarSeguro.selecionarSexoViajante(dataTable.cell(3,1));
		contratarSeguro.digitarDtNascViajante(dataTable.cell(4,1));
		contratarSeguro.digitarEmailViajante(dataTable.cell(5,1));
		contratarSeguro.digitarTelViajante(dataTable.cell(6,1));
	}

	@Então("informar o endereço do Viajante do Seguro")
	public void informarOEndereçoDoViajanteDoSeguro(DataTable dataTable) {
		contratarSeguro.validarDetalhesPlanoViagem();
		contratarSeguro.digitarCep(dataTable.cell(0,1));
		contratarSeguro.digitarNumEnd(dataTable.cell(1,1));
		contratarSeguro.digitarCompEnd(dataTable.cell(2,1));
	}

	@Então("informar o contato para caso de emergência")
	public void informarOContatoParaCasoDeEmergência(DataTable dataTable) {
		contratarSeguro.digitarNomeEmergencia(dataTable.cell(0,1));
		contratarSeguro.digitarSobrenomeEmergencia(dataTable.cell(1,1));
		contratarSeguro.digitarTelEmergencia(dataTable.cell(2,1));
	}

	@Então("clicar na opção para confirmar a declaração de verificação dos passageiros")
	public void clicarNaOpçãoParaConfirmarADeclaraçãoDeVerificaçãoDosPassageiros() {
		contratarSeguro.clicarDeclaracaoPassageiros();
	}

	@Então("informar os dados do Cartão para Pagamento do Seguro")
	public void informarOsDadosDoCartãoParaPagamentoDoSeguro(DataTable dataTable) {
		contratarSeguro.digitarNumCartao(dataTable.cell(0,1));
		contratarSeguro.digitarTitCartao(dataTable.cell(1,1));
		contratarSeguro.digitarDtVencCartao(dataTable.cell(2,1));
		contratarSeguro.digitarCvvCartao(dataTable.cell(3,1));
	}

	@Então("informar os dados do Titular do Cartão para Pagamento do Seguro")
	public void informarOsDadosDoTitularDoCartãoParaPagamentoDoSeguro(DataTable dataTable) {
		String cpf = gerador.cpf(false);
		contratarSeguro.digitarNomeTitCartao(dataTable.cell(0,1));
		contratarSeguro.digitarSobrenomeTitCartao(dataTable.cell(1,1));
		contratarSeguro.digitarEmailTitCartao(dataTable.cell(2,1));
		contratarSeguro.digitarConfEmailTitCartao(dataTable.cell(3,1));
		contratarSeguro.digitarCpfTitCartao(cpf);
		contratarSeguro.digitarDtNascTitCartao(dataTable.cell(5,1));
		contratarSeguro.selecionarSexoTitCartao(dataTable.cell(6,1));
		contratarSeguro.digitarTelTitCartao(dataTable.cell(7,1));
	}

	@Então("informar o endereço do Titular do Cartão para Pagamento do Seguro")
	public void informarOEndereçoDoTitularDoCartãoParaPagamentoDoSeguro(DataTable dataTable) {
		contratarSeguro.digitarCepTitCartao(dataTable.cell(0,1));
		contratarSeguro.digitarNumEndTitCartao(dataTable.cell(1,1));
		contratarSeguro.digitarCompEndTitCartao(dataTable.cell(2,1));
	}

	@Então("a Compra do Seguro será efetuada")
	public void aCompraDoSeguroSeráEfetuada() {
		contratarSeguro.validarCompraSeguro();
		//fecharBrowser();
	}
	
	
}
