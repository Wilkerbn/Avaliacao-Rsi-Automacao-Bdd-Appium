$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/consultaDeProdutoCampoPesquisaStep.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 2,
  "name": "Consulta de produto por campo de pesquisa",
  "description": "\r\nComo um usuário quero efetuar uma pesquisa de produto através do campo de pesquisa de produtos",
  "id": "consulta-de-produto-por-campo-de-pesquisa",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que estou na tela aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clicar na opcao de pesquisa",
  "keyword": "Quando "
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.que_estou_na_tela_aplicacao()"
});
formatter.result({
  "duration": 22484022100,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.clicar_na_opcao_de_pesquisa()"
});
formatter.result({
  "duration": 2354133400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": ": Deve efetuar uma pesquisa de um produto válido",
  "description": "",
  "id": "consulta-de-produto-por-campo-de-pesquisa;:-deve-efetuar-uma-pesquisa-de-um-produto-válido",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 10,
  "name": "inserir a categoria de meu produto",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "selecionar um determinado produto",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "devo visualizar o meu produto",
  "keyword": "Então "
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.inserir_a_categoria_de_meu_produto()"
});
formatter.result({
  "duration": 1133471700,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.selecionar_um_determinado_produto()"
});
formatter.result({
  "duration": 3894497500,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.devo_visualizar_o_meu_produto()"
});
formatter.result({
  "duration": 204683500,
  "status": "passed"
});
formatter.after({
  "duration": 1286439000,
  "status": "passed"
});
formatter.after({
  "duration": 20700,
  "status": "passed"
});
formatter.after({
  "duration": 54500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que estou na tela aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clicar na opcao de pesquisa",
  "keyword": "Quando "
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.que_estou_na_tela_aplicacao()"
});
formatter.result({
  "duration": 8425362000,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.clicar_na_opcao_de_pesquisa()"
});
formatter.result({
  "duration": 1246010200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": ": Deve efetuar uma pesquisa de produto invalido",
  "description": "",
  "id": "consulta-de-produto-por-campo-de-pesquisa;:-deve-efetuar-uma-pesquisa-de-produto-invalido",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 15,
  "name": "inserir a categoria invalida de meu produto",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "devo visualizar a mensagem de confirmacao",
  "keyword": "Então "
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.inserir_a_categoria_invalida_de_meu_produto()"
});
formatter.result({
  "duration": 1621537000,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaDeProdutoCampoPesquisaStep.devo_visualizar_a_mensagem_de_confirmacao()"
});
formatter.result({
  "duration": 1088551200,
  "status": "passed"
});
formatter.after({
  "duration": 704923100,
  "status": "passed"
});
formatter.after({
  "duration": 16300,
  "status": "passed"
});
formatter.after({
  "duration": 34900,
  "status": "passed"
});
});