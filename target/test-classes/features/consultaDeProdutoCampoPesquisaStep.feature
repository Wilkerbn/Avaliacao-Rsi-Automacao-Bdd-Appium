#language:pt
Funcionalidade: Consulta de produto por campo de pesquisa 
  
  Como um usuário quero efetuar uma pesquisa de produto através do campo de pesquisa de produtos
Contexto:
		 Dado que estou na tela aplicacao
		 Quando clicar na opcao de pesquisa

Cenário:: Deve efetuar uma pesquisa de um produto válido
     E inserir a categoria de meu produto 
     E selecionar um determinado produto 
     Então devo visualizar o meu produto 
   
Cenário:: Deve efetuar uma pesquisa de produto invalido
     E inserir a categoria invalida de meu produto 
     Então devo visualizar a mensagem de confirmacao 
    
    


      
      
      