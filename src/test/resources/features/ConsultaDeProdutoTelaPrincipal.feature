#language:pt
Funcionalidade: Consulta de produto na tela principal
  
  Como um usuário quero efetuar uma pesquisa de produto através da tela principal do sistema
Contexto:
		 Dado que estou na aplicacao

Esquema do Cenário: Produto Tela Principal Valido
    Quando clicar na categoria do produto "<categoria>"
    E selecionar o produto desejado "<produto>"
    Então devo visualizar a pagina com meu produto em estoque "<confirmaProduto>"
    
Exemplos: 
      | categoria         | produto                         | confirmaProduto             |
      | LAPTOPS           | HP ENVY - 17T TOUCH LAPTOP      | HP ENVY - 17T TOUCH LAPTOP  |
     
Esquema do Cenário: Produto Tela Principal Invalido
    Quando clicar na categoria do produto "<categoria>"
    E selecionar o produto desejado "<produto>"
    Então devo visualizar uma mensagem informando produto esgotado "<confirmaProduto>"
    
Exemplos: 
      | categoria            | produto                                           | confirmaProduto      |
      | HEADPHONES           | BOSE SOUNDLINK AROUND-EAR WIRELESS HEADPHONES II  | SOLD OUT             |
      
      
      