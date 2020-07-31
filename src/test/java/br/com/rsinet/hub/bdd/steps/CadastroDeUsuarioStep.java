package br.com.rsinet.hub.bdd.steps;

import org.junit.Assert;

import br.com.rsinet.hub.bdd.screens.BaseScreen;
import br.com.rsinet.hub.bdd.screens.FormularioScreen;
import br.com.rsinet.hub.bdd.screens.HomeScreen;
import br.com.rsinet.hub.bdd.screens.LoginScreen;
import br.com.rsinet.hub.bdd.suport.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;


public class CadastroDeUsuarioStep {
	
	
	@Dado("^que estou acessando a aplicacao$")
	public void que_estou_acessando_a_aplicacao() {
	}

	@Quando("^clicar no menu lateral$")
	public void clicar_no_menu_lateral()   {
		HomeScreen.menuLateral().click();
	}

	@Quando("^clicar em login$")
	public void clicar_em_login()  {
		HomeScreen.botaoLogin().click();
	}

	@Quando("^clicar em criar uma conta$")
	public void clicar_em_criar_uma_conta() throws Exception {
		LoginScreen.botaoCriarNovaConta().click();
	}

	@Quando("^preencher meu nome de usuario \"([^\"]*)\"$")
	public void preencher_meu_nome_de_usuario(String apelidoUsuario) throws Exception {
		FormularioScreen.campoApelido().click();
		FormularioScreen.campoApelido().sendKeys(apelidoUsuario);
	}

	@Quando("^preencher meu e-mail \"([^\"]*)\"$")
	public void preencher_meu_e_mail(String email)  {
		FormularioScreen.campoEmail().click();
		FormularioScreen.campoEmail().sendKeys(email);
	}

	@Quando("^preencher minha senha \"([^\"]*)\"$")
	public void preencher_minha_senha(String senha)  {
		FormularioScreen.campoSenha().click();
		FormularioScreen.campoSenha().sendKeys(senha);
	}

	@Quando("^preencher a confirmacao da senha \"([^\"]*)\"$")
	public void preencher_a_confirmacao_da_senha(String confirmaSenha)  {
		FormularioScreen.campoConfirmaSenha().click();
		FormularioScreen.campoConfirmaSenha().sendKeys(confirmaSenha);
	}

	@Quando("^preencher meu primeiro nome \"([^\"]*)\"$")
	public void preencher_meu_primeiro_nome(String nome)  {
		FormularioScreen.campoNome().click();
		FormularioScreen.campoNome().sendKeys(nome);
	}

	@Quando("^preencher meu ultimo nome \"([^\"]*)\"$")
	public void preencher_meu_ultimo_nome(String ultimoNome)  {
		FormularioScreen.campoUltimoNome().click();
		FormularioScreen.campoUltimoNome().sendKeys(ultimoNome);
		BaseScreen.scrollDown(0.9, 0.1);
	}

	@Quando("^preencher meu numero de telefone \"([^\"]*)\"$")
	public void preencher_meu_numero_de_telefone(String telefone)  {
		FormularioScreen.campoTelefone().click();
		FormularioScreen.campoTelefone().sendKeys(telefone);
	}

	@Quando("^selecionar meu pais \"([^\"]*)\"$")
	public void selecionar_meu_pais(String pais)  {
		FormularioScreen.campoPais().click();
		FormularioScreen.selecionaPais("Brazil");
	}

	@Quando("^preencher meu estado \"([^\"]*)\"$")
	public void preencher_meu_estado(String estado)  {
		FormularioScreen.campoEstado().click();
		FormularioScreen.campoEstado().sendKeys(estado);
	}

	@Quando("^preencher meu endereco \"([^\"]*)\"$")
	public void preencher_meu_endereco(String endereco)  {
		FormularioScreen.campoEndereco().click();
		FormularioScreen.campoEndereco().sendKeys(endereco);
	}

	@Quando("^preencher minha cidade \"([^\"]*)\"$")
	public void preencher_minha_cidade(String cidade)  {
		FormularioScreen.campoCidade().click();
		FormularioScreen.campoCidade().sendKeys(cidade);
	}

	@Quando("^preencher meu cep \"([^\"]*)\"$")
	public void preencher_meu_cep(String cep)  {
		FormularioScreen.campoCep().click();
		FormularioScreen.campoCep().sendKeys(cep);
	}

	@Quando("^clicar em registrar$")
	public void clicar_em_registrar()  {
		FormularioScreen.botaoParaRegistrar().click();
	}

	@Então("^devo receber a informacao \"([^\"]*)\"$")
	public void devo_receber_a_informacao(String apelidoUsuario)  {
		Assert.assertEquals(apelidoUsuario, HomeScreen.usuarioCadastrado());
	}
	
	@Então("^devo receber a informacao invalida \"([^\"]*)\"$")
	public void devo_receber_a_informacao_invalida(String informacaoEsperada)  {
		Assert.assertEquals("REGISTER", FormularioScreen.usuarioJaExiste());
	}

}
