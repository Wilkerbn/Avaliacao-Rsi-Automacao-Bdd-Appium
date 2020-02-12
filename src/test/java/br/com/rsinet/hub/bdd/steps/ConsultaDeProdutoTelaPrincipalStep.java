package br.com.rsinet.hub.bdd.steps;

import org.junit.Assert;

import br.com.rsinet.hub.bdd.screens.HomeScreen;
import br.com.rsinet.hub.bdd.screens.ProdutoScreen;
import br.com.rsinet.hub.bdd.suport.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ConsultaDeProdutoTelaPrincipalStep {

	@Dado("^que estou na aplicacao$")
	public void que_estou_na_aplicacao() throws Throwable {
		DriverFactory.getDriver();
	}

	@Quando("^clicar na categoria do produto \"([^\"]*)\"$")
	public void clicar_na_categoria_do_produto(String categoria) {
		HomeScreen.categoriaDeProdutosTelaPrincipal(categoria).click();
	}

	@Quando("^selecionar o produto desejado \"([^\"]*)\"$")
	public void selecionar_o_produto_desejado(String produto) {
		ProdutoScreen.selecionaProduto(produto).click();
	}

	@Então("^devo visualizar a pagina com meu produto em estoque \"([^\"]*)\"$")
	public void devo_visualizar_a_pagina_com_meu_produto_em_estoque(String confirmaProduto) {
		Assert.assertEquals(confirmaProduto, ProdutoScreen.confirmaProdutoSelecionado("HP ENVY - 17T TOUCH LAPTOP"));

	}

	@Então("^devo visualizar uma mensagem informando produto esgotado \"([^\"]*)\"$")
	public void devo_visualizar_uma_mensagem_informando_produto_esgotado(String arg1) throws Throwable {
		Assert.assertTrue(ProdutoScreen.confirmaProdutoEsgotado().contains("SOLD OUT"));
	}

}
