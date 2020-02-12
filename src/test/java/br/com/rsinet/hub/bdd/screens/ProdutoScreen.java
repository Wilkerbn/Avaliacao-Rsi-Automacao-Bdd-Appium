package br.com.rsinet.hub.bdd.screens;

import static br.com.rsinet.hub.bdd.suport.DriverFactory.getDriver;

import org.openqa.selenium.WebElement;

public class ProdutoScreen {
	private static WebElement elemento = null;
	
	public static WebElement selecionaProduto(String produto) {
		elemento = getDriver().findElementByXPath("//*[@text='"+ produto +"']");
		return elemento;
	}
	
	public static void selecionaProdutoComScroll(String visibleText) {
		getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ visibleText + "\").instance(0))").click();
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
