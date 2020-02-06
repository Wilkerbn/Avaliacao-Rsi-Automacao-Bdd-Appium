package br.com.rsinet.hub.bdd.steps;

import br.com.rsinet.hub.bdd.pages.ProdutoPage;

import org.junit.Assert;

import br.com.rsinet.hub.bdd.pages.HomePage;
import br.com.rsinet.hub.bdd.suport.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ConsultaDeProdutoCampoPesquisaStep {
	public static AndroidDriver<MobileElement> driver;
	
	@Dado("^que estou na tela aplicacao$")
	public void que_estou_na_tela_aplicacao() {
		driver = DriverFactory.getDriver();
	}

	@Quando("^clicar na opcao de pesquisa$")
	public void clicar_na_opcao_de_pesquisa() {
		HomePage.campoDePesquisa().click();
		
	}

	@Quando("^inserir a categoria de meu produto$")
	public void inserir_a_categoria_de_meu_produto() {
		HomePage.campoDePesquisa().sendKeys("LAPTOPS");
		HomePage.lupaParaPesquisarProdutoInserido().click();
	}

	@Quando("^selecionar um determinado produto$")
	public void selecionar_um_determinado_produto()  {
		ProdutoPage.selecionaProduto("HP PAVILION 15T TOUCH LAPTOP").click();
	}

	@Então("^devo visualizar o meu produto$")
	public void devo_visualizar_o_meu_produto()  {
		Assert.assertEquals("HP PAVILION 15T TOUCH LAPTOP", ProdutoPage.confirmaProdutoSelecionado("HP PAVILION 15T TOUCH LAPTOP"));
	}

	@Quando("^inserir a categoria invalida de meu produto$")
	public void inserir_a_categoria_invalida_de_meu_produto()  {
		HomePage.campoDePesquisa().sendKeys("Video Game");
		HomePage.lupaParaPesquisarProdutoInserido().click();
	}

	@Então("^devo visualizar a mensagem de confirmacao$")
	public void devo_visualizar_a_mensagem_de_confirmacao()  {
		Assert.assertTrue(ProdutoPage.confirmaProdutoInvalidoSelecionado().contains("No results for"));
	}
	


}
