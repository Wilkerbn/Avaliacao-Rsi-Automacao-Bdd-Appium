package br.com.rsinet.hub.bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub.bdd.utility.Constant;
import br.com.rsinet.hub.bdd.pages.BasePage;
import br.com.rsinet.hub.bdd.pages.FormularioPage;
import br.com.rsinet.hub.bdd.pages.HomePage;
import br.com.rsinet.hub.bdd.pages.LoginPage;
import br.com.rsinet.hub.bdd.suport.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class CadastroDeUsuarioStep {
	private static AndroidDriver<MobileElement> driver;
	
	@Dado("^que estou acessando a aplicacao$")
	public void que_estou_acessando_a_aplicacao() {
		driver = DriverFactory.getDriver();
	}

	@Quando("^clicar no menu lateral$")
	public void clicar_no_menu_lateral() throws Exception  {
		HomePage.menuLateral().click();

	}

	@Quando("^clicar em login$")
	public void clicar_em_login()  {
		HomePage.botaoLogin().click();
	}

	@Quando("^clicar em criar uma conta$")
	public void clicar_em_criar_uma_conta() throws Exception  {
		LoginPage.botaoCriarNovaConta().click();
	}

	@Quando("^preencher meu nome de usuario \"([^\"]*)\"$")
	public void preencher_meu_nome_de_usuario(String apelidoUsuario) throws Exception  {
		FormularioPage.campoApelido().click();
		FormularioPage.campoApelido().sendKeys(apelidoUsuario);
	}

	@Quando("^preencher meu e-mail \"([^\"]*)\"$")
	public void preencher_meu_e_mail(String email)  {
		FormularioPage.campoEmail().click();
		FormularioPage.campoEmail().sendKeys(email);
	}

	@Quando("^preencher minha senha \"([^\"]*)\"$")
	public void preencher_minha_senha(String senha)  {
		FormularioPage.campoSenha().click();
		FormularioPage.campoSenha().sendKeys(senha);
	}

	@Quando("^preencher a confirmacao da senha \"([^\"]*)\"$")
	public void preencher_a_confirmacao_da_senha(String confirmaSenha)  {
		FormularioPage.campoConfirmaSenha().click();
		FormularioPage.campoConfirmaSenha().sendKeys(confirmaSenha);
	}

	@Quando("^preencher meu primeiro nome \"([^\"]*)\"$")
	public void preencher_meu_primeiro_nome(String nome)  {
		FormularioPage.campoNome().click();
		FormularioPage.campoNome().sendKeys(nome);
	}

	@Quando("^preencher meu ultimo nome \"([^\"]*)\"$")
	public void preencher_meu_ultimo_nome(String ultimoNome)  {
		FormularioPage.campoUltimoNome().click();
		FormularioPage.campoUltimoNome().sendKeys(ultimoNome);
		BasePage.scrollDown(0.8, 0.2);
	}

	@Quando("^preencher meu numero de telefone \"([^\"]*)\"$")
	public void preencher_meu_numero_de_telefone(String telefone)  {
		FormularioPage.campoTelefone().click();
		FormularioPage.campoTelefone().sendKeys(telefone);
	}

	@Quando("^selecionar meu pais \"([^\"]*)\"$")
	public void selecionar_meu_pais(String pais)  {
		FormularioPage.campoPais().click();
		FormularioPage.selecionaPais(driver, "Brazil");
	}

	@Quando("^preencher meu estado \"([^\"]*)\"$")
	public void preencher_meu_estado(String estado)  {
		FormularioPage.campoEstado().click();
		FormularioPage.campoEstado().sendKeys(estado);
	}

	@Quando("^preencher meu endereco \"([^\"]*)\"$")
	public void preencher_meu_endereco(String endereco)  {
		FormularioPage.campoEndereco().click();
		FormularioPage.campoEndereco().sendKeys(endereco);
	}

	@Quando("^preencher minha cidade \"([^\"]*)\"$")
	public void preencher_minha_cidade(String cidade)  {
		FormularioPage.campoCidade().click();
		FormularioPage.campoCidade().sendKeys(cidade);
	}

	@Quando("^preencher meu cep \"([^\"]*)\"$")
	public void preencher_meu_cep(String cep)  {
		FormularioPage.campoCep().click();
		FormularioPage.campoCep().sendKeys(cep);
	}

	@Quando("^clicar em registrar$")
	public void clicar_em_registrar()  {
		FormularioPage.botaoParaRegistrar().click();
	}

	@Então("^devo receber a informacao \"([^\"]*)\"$")
	public void devo_receber_a_informacao(String apelidoUsuario)  {
		Assert.assertEquals(apelidoUsuario, HomePage.usuarioCadastrado());
	
	}
	
	@Então("^devo receber a informacao invalida \"([^\"]*)\"$")
	public void devo_receber_a_informacao_invalida(String informacaoEsperada)  {
		Assert.assertEquals("REGISTER", FormularioPage.usuarioJaExiste());
	}

}
