package runners.homeCarrossel;

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
		,features = "src/test/resources/features/homeCarrossel/ComprarPacoteInicioDoAno.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/homeCarrossel/ComprarPacoteInicioDoAno"}
		,snippets = SnippetType.CAMELCASE
)

public class ComprarPacoteInicioDoAnoRunner {

}
