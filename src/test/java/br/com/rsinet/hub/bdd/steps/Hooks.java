package br.com.rsinet.hub.bdd.steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub.bdd.suport.DriverFactory;
import br.com.rsinet.hub.bdd.suport.Generator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import static br.com.rsinet.hub.bdd.suport.DriverFactory.getDriver;

public class Hooks {
	
	@Before
	public void inicializaApp() {
		DriverFactory.getDriver();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After(order = 1)
	public void afterCenario(Scenario scenario) {
		File screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + scenario.getName()
				+ "-" + Generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}

	@After(order = 0)
	public void finaliza() {
		DriverFactory.killDriver();
	}
}
