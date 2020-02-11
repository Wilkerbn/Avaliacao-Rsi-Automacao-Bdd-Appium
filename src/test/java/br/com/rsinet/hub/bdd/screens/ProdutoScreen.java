package br.com.rsinet.hub.bdd.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import static br.com.rsinet.hub.bdd.suport.DriverFactory.getDriver;

public class ProdutoScreen {
	private static WebElement elemento = null;
	
	public static WebElement selecionaProduto(String produto) {
		elemento = getDriver().findElementByXPath("//*[@text='"+ produto +"']");
		return elemento;
	}
	
	public static void selecionaProdutoComScroll(AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ visibleText + "\").instance(0))").click();
	}
	
	public static String confirmaProdutoSelecionado(String texto) {
		WebElement produtoSelecionadoTexto = getDriver().findElementByXPath("//*[@text='"+ texto +"']");
		String produtoSelecionado = produtoSelecionadoTexto.getText();
		return produtoSelecionado;
	}
	
	public static String confirmaProdutoInvalidoSelecionado() {
		WebElement produtoSelecionadoTexto = getDriver().findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
		String produtoInvalidoSelecionado = produtoSelecionadoTexto.getText();
		return produtoInvalidoSelecionado;
	}
	
	public static String confirmaProdutoEsgotado() {
		WebElement campoProdutoEsgotado = getDriver().findElementByXPath("//*[@text='SOLD OUT']");
		String textoProdutoEsgotado = campoProdutoEsgotado.getText();
		return textoProdutoEsgotado;
	}
	
	

}
