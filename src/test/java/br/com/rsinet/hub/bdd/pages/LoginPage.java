package br.com.rsinet.hub.bdd.pages;

import static br.com.rsinet.hub.bdd.suport.DriverFactory.getDriver;

import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement elemento = null;
	
	public static WebElement botaoCriarNovaConta() throws Exception {
		elemento = getDriver().findElementById("com.Advantage.aShopping:id/textViewDontHaveAnAccount");
		return elemento;
	}
	
}