package runners.hospedagens;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = "src/test/resources/features/hospedagens/ComprarHospedagem.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/hospedagens/comprarHospedagem"}
		,snippets = SnippetType.CAMELCASE
)

public class ComprarHospedagemRunner {

}
