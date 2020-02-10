package br.com.rsinet.hub.bdd.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/* Localiza meu pacote com as features */
		//features = "src/test/resources/features/ConsultaDeProdutoCampoPesquisa.feature", //Forma utilizada para testar feature separadamente.
		features = "classpath:features", 
		
		/* Informa o pacote onde esta adicionado as classes a serem executadas*/
		glue = "br.com.rsinet.hub.bdd.steps", 
		
		/* Quando esta true deixa a saida mais legivel do cucumber no console */
		monochrome = true,
		
		/* Plugins adicionais 
		 * Pretty : Imprime a fonte Gherkin com cores adicionais e empilha os tracos para erros. 
		 * Json : Este relatorio contem todas as informacoes no formato JSON, utilizado por ferramentas de terceiros como Jenkins.
		 * Extend Report : Outro tipo de relatorio utilizado com informacoes inerentes aos testes executados.  */
		plugin = {"pretty", "json:target/cucumber-reports/json-report.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extent-report.html"},
		
		/* Altera o trecho do codigo para utilizacao do padrao CamelCase */
		snippets = SnippetType.CAMELCASE,
		
		/* Padrao de execucao que verifica quando "true" se cada etapa mencionada escrita no arquivo esta de acordo
		 * com a definicao de etapa */
		dryRun = false
		
		/* Outra maneira de se testar utilizando tag, geralmente utilizado para informar qual teste a ser executado */
		//tags = {"@cadastro_de_usuario"} //Com essa tag adicionada consigo informar que quero executar somente esse cenario
		)
public class TestRunner {
	@AfterClass
	/* Executa a leitura das configuracoes do extends report */
	public static void writeExtentReport() {
		/* Informa o caminho onde esta localizado minhas configuracoes em XML do Extend Report */
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extension-config.xml"));
		
		/* Informa qual o sistema foi utilizado para efetuar os testes */
		Reporter.setSystemInfo("OS", "Windows10");
		
		/* Informa o nome do analista no relatorio */
		Reporter.setSystemInfo("Tester Name", "Wilker");
		
	}
}


