#language:pt

Funcionalidade: Cadastro de usuario 
  Como um usuario quero preencher minhas informacoes
  Para que eu possa ter meu cadastro no site 

Contexto: 
		Dado que estou acessando a aplicacao
    Quando clicar no menu lateral
    E clicar em login
    E clicar em criar uma conta

Esquema do Cenário: Cadastro Valido  
    E preencher meu nome de usuario "<apelidoUsuario>"
    E preencher meu e-mail "<email>"
    E preencher minha senha "<senha>"
    E preencher a confirmacao da senha "<confirmaSenha>"
    E preencher meu primeiro nome "<nome>"
    E preencher meu ultimo nome "<ultimoNome>"
    E preencher meu numero de telefone "<telefone>"
    E selecionar meu pais "<pais>"
    E preencher meu estado "<estado>"
    E preencher meu endereco "<endereco>"
    E preencher minha cidade "<cidade>"
    E preencher meu cep "<cep>"
    E clicar em registrar
    E clicar no menu lateral
    Então devo receber a informacao "<apelidoUsuario>"
    
Exemplos: 
      | apelidoUsuario       | email                         | senha     | confirmaSenha  |  nome       | ultimoNome  | telefone    | pais     |  estado         | endereco          | cidade      | cep       | 
      | Wilke0065            | wilker.bn@hotmail.com         | Wbn000001 | Wbn000001      |  Wilker     |	Nogueira	  | 11911111111 | Brazil   |  SP             | R. Autonomistas 1 | Osasco      | 11111-111 | 
 
Esquema do Cenário: Cadastro Invalido
    E preencher meu nome de usuario "<apelidoUsuario>"
    E preencher meu e-mail "<email>"
    E preencher minha senha "<senha>"
    E preencher a confirmacao da senha "<confirmaSenha>"
    E preencher meu primeiro nome "<nome>"
    E preencher meu ultimo nome "<ultimoNome>"
    E preencher meu numero de telefone "<telefone>"
    E selecionar meu pais "<pais>"
    E preencher meu estado "<estado>"
    E preencher meu endereco "<endereco>"
    E preencher minha cidade "<cidade>"
    E preencher meu cep "<cep>"
    E clicar em registrar
    Então devo receber a informacao invalida "<informacaoEsperada>"
		
Exemplos:
			| apelidoUsuario       | email                         | senha     | confirmaSenha  |  nome       | ultimoNome  | telefone    | pais     |  estado         | endereco          | cidade      | cep       | informacaoEsperada       |
      | Wilkerbn911          | wilker.bn@hotmail.com         | Wbn000001 | Wbn000001      |  Wilker     |	Nogueira	  | 11911111111 | Brazil   |  SP             | R. Autonomistas 1 | Osasco      | 11111-111 | User name already exists	|
