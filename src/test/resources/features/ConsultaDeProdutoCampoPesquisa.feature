#language:pt
Funcionalidade: Consulta de produto campo de pesquisa 
  
  Como um usuário quero efetuar uma pesquisa de produto através do campo de pesquisa de produtos
Contexto:
     Dado que estou na tela aplicacao
	 Quando clicar na opcao de pesquisa

Cenário: Produto Lupa Valido
     E inserir a categoria de meu produto 
     E selecionar um determinado produto 
     Então devo visualizar o meu produto 
  
Cenário: Produto Lupa Invalido
     E inserir a categoria invalida de meu produto 
     Então devo visualizar a mensagem de confirmacao 
    
    


      
      
      