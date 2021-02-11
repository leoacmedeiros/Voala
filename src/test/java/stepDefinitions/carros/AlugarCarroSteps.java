package stepDefinitions.carros;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.carros.AlugarCarroPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

public class AlugarCarroSteps extends BasePage{

	GeraCpfCnpj gerador = new GeraCpfCnpj();
	MenuPage menu = new MenuPage();
	AlugarCarroPage alugarCarro = new AlugarCarroPage();
	
	@Dado("acesse o menu Carros")
	public void acesseOMenuCarros() {
	    menu.acessarCarros();
	}

	@Dado("informe a cidade da retirada do Carro, a data e o horário")
	public void informeACidadeDaRetiradaDoCarroADataEOHorário(DataTable dataTable) {
	    alugarCarro.retirarCarroEm(dataTable.cell(0,1));
	    alugarCarro.selecionarDataRetirada(dataTable.cell(1, 1));
	    alugarCarro.selecionarHorarioRetirada(dataTable.cell(2,1));
	}

	@Dado("selecione a data de devolução e horário")
	public void selecioneADataDeDevoluçãoEHorário(DataTable dataTable) {
	    alugarCarro.selecionarDataDevolucao(dataTable.cell(0,1));
		alugarCarro.selecionarHorarioDevolucao(dataTable.cell(1,1));
	}

	@Dado("clique para Pesquisar os Carros")
	public void cliqueParaPesquisarOsCarros() {
	    alugarCarro.clicarPesquisarCarros();
	}

	@Então("irá exibir os Carros disponíveis para locação")
	public void iráExibirOsCarrosDisponíveisParaLocação() {
	    
	}

	@Então("selecione a locadora Unidas")
	public void selecioneALocadoraUnidas(DataTable dataTable) {
	    alugarCarro.selecionarLocadora(dataTable.cell(0,1));
	}

	@Então("selecione o Carro do Modelo Econômico")
	public void selecioneOCarroDoModeloEconômico() {
	    alugarCarro.selecionarVerCarro();
	}

	@Então("selecione a Proteção a Terceiros")
	public void selecioneAProteçãoATerceiros() {
	    //alugarCarro.selecionarProtecaoTerceiros();
	}

	@Então("clique para Finalizar a Locação")
	public void cliqueParaFinalizarALocação() {
	    alugarCarro.clicarFinalizar();
	}

	@Então("informar os dados do viajante")
	public void informarOsDadosDoViajante(DataTable dataTable) {
	    alugarCarro.validarIdentViajantes();
	    String cpf = gerador.cpf(false);
	    alugarCarro.digitarNomeViajante(dataTable.cell(0,1));
	    alugarCarro.digitarSobrenomeViajante(dataTable.cell(1,1));
	    alugarCarro.digitarCpfViajante(cpf);
	    alugarCarro.selecionarSexoViajante(dataTable.cell(3,1));
	    alugarCarro.digitarDtNascViajante(dataTable.cell(4,1));
	    alugarCarro.digitarEmailViajante(dataTable.cell(5,1));
	    alugarCarro.digitarTelViajante(dataTable.cell(6,1));
	}

	@Então("informar os dados do Cartão para Pagamento da Locação do Carro")
	public void informarOsDadosDoCartãoParaPagamentoDaLocaçãoDoCarro(DataTable dataTable) {
		alugarCarro.digitarNumCartao(dataTable.cell(0,1));
	    alugarCarro.digitarTitCartao(dataTable.cell(1,1));
	    alugarCarro.digitarDtVencCartao(dataTable.cell(2,1));
	    alugarCarro.digitarCvvCartao(dataTable.cell(3,1));
	}
	
	@Então("informar os dados do Titular do Cartão para Locação do Carro")
	public void informarOsDadosDoTitularDoCartãoParaLocaçãoDoCarro(DataTable dataTable) {
		String cpf = gerador.cpf(false);
		alugarCarro.validarDetalhesLocacao();
		alugarCarro.digitarNomeTitCartao(dataTable.cell(0,1));
	    alugarCarro.digitarSobrenomeTitCartao(dataTable.cell(1,1));
	    alugarCarro.digitarEmailTitCartao(dataTable.cell(2,1));
	    alugarCarro.digitarConfEmailTitCartao(dataTable.cell(3,1));
	    alugarCarro.digitarCpfTitCartao(cpf);
	    alugarCarro.digitarDtNascTitCartao(dataTable.cell(5,1));
	    alugarCarro.selecionarSexoTitCartao(dataTable.cell(6,1));
	    alugarCarro.digitarTelTitCartao(dataTable.cell(7,1));
	}

	@Então("informar o endereço do Titular do Cartão para Locação do Carro")
	public void informarOEndereçoDoTitularDoCartãoParaLocaçãoDoCarro(DataTable dataTable) {
		alugarCarro.digitarCepTitCartao(dataTable.cell(0,1));
	    alugarCarro.digitarNumEndTitCartao(dataTable.cell(1,1));
	    alugarCarro.digitarCompEndTitCartao(dataTable.cell(2,1));
	}

	@Então("informar a quantidade de parcelas para pagamento da Locação do Carro")
	public void informarAQuantidadeDeParcelasParaPagamentoDaLocaçãoDoCarro(DataTable dataTable) {
		alugarCarro.selecionarParcelas();
	}

	@Então("a Locação de Carro será efetuada")
	public void aLocaçãoDeCarroSeráEfetuada() {
		alugarCarro.validarLocacaoCarro();
		//fecharBrowser();
	}
	
	@Então("a locação do carro deverá ser exibida em Minhas Viagens")
	public void aLocaçãoDoCarroDeveráSerExibidaEmMinhasViagens() {
	    //alugarCarro.validarLocacaoCarroMinhasViagens();
	}
	
}
