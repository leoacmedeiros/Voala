package runners.AllTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import runners.carros.AlugarCarroRunner;
import runners.hospedagens.ComprarHospedagemRunner;
import runners.hospedagens.PagamentoCompartilhadoHospedagemRunner;
import runners.pacotes.ComprarPacoteRunner;
import runners.passagensAereas.ComprarPassagemAereaRunner;
import runners.seguros.ContratarSeguroRunner;
import runners.usuario.AlterarSenhaRunner;
import runners.usuario.CadastrarUsuarioRunner;

@RunWith(Suite.class)
@SuiteClasses
	({	
		AlugarCarroRunner.class, 
		ComprarHospedagemRunner.class,
		PagamentoCompartilhadoHospedagemRunner.class,
		ComprarPacoteRunner.class,
		ComprarPassagemAereaRunner.class,
		ContratarSeguroRunner.class,
		AlterarSenhaRunner.class,
		CadastrarUsuarioRunner.class
	})
public class AllTests {

}
