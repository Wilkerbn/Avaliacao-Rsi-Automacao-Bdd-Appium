package br.com.rsinet.hub.bdd.steps;

import org.junit.Assert;

import br.com.rsinet.hub.bdd.screens.HomeScreen;
import br.com.rsinet.hub.bdd.screens.ProdutoScreen;
import br.com.rsinet.hub.bdd.suport.DriverFactory;
import br.com.rsinet.hub.bdd.utility.Constant;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ConsultaDeProdutoCampoPesquisaStep extends Constant {

	@Dado("^que estou na tela aplicacao$")
	public void que_estou_na_tela_aplicacao() throws Exception {
		Constant.recebeDadosDoExcel("Produtos");
	}

	@Quando("^clicar na opcao de pesquisa$")
	public void clicar_na_opcao_de_pesquisa() {
		HomeScreen.campoDePesquisa().click();
	}

	@Quando("^inserir a categoria de meu produto$")
	public void inserir_a_categoria_de_meu_produto() throws Exception {
		HomeScreen.campoDePesquisa().sendKeys(Constant.categoria());
		HomeScreen.lupaParaPesquisarProdutoInserido().click();
	}

	@Quando("^selecionar um determinado produto$")
	public void selecionar_um_determinado_produto() throws Exception {
		ProdutoScreen.selecionaProdutoComScroll(Constant.produto());
	}

	@Então("^devo visualizar o meu produto$")
	public void devo_visualizar_o_meu_produto() throws Exception {
		Assert.assertEquals(Constant.produto(), ProdutoScreen.confirmaProdutoSelecionado(Constant.confirmaProduto()));
	}

	@Quando("^inserir a categoria invalida de meu produto$")
	public void inserir_a_categoria_invalida_de_meu_produto() throws Exception {
		HomeScreen.campoDePesquisa().sendKeys(Constant.categoriaInvalida());
		HomeScreen.lupaParaPesquisarProdutoInserido().click();
	}

	@Então("^devo visualizar a mensagem de confirmacao$")
	public void devo_visualizar_a_mensagem_de_confirmacao() throws Exception {
		Assert.assertTrue(ProdutoScreen.confirmaProdutoInvalidoSelecionado().contains(Constant.categoriaInvalida()));
	}

}
