feature: Enviar contato

Como um usuário 
Gostaria de enviar mais de um contato
Para que eu possa envair duvidas ou reclamações.

Scenario: Devera enviar um contato com sucesso.

Given: Acesso a pagina inicial da aplicação
When Clico no menu contato
And Preencho o campo nome "nome"
And Preencho o campo email "email"
And Preencho o campo telefone"Telefone"
And Preencho o campo  mensagem "Mensagem"
And e clico no botão enviar
Then apresenta a mesnagem "Sua mensagem foi enviada com sucesso."

Scenario: Não permitir enviar contato com campos em Branco

Given: Que estou acessando a aplicação
When Clico no menu contato
And Preencho o campo nome "nome"
And Preencho o campo email "email"
And  Não Preencho o campo telefone " "
And Preencho e informo mensagem "Mensagem"
And e clico no botão enviar
Then apresenta a mesnagem "Por favor informe seu telefone."

Scenario: Deve inserir uma conta com sucesso

Given: Que estou acessando a aplicação
When Clico no menu contato
And Preencho o campo nome "nome"
And Preencho o campo email com formato invalido  "email"
And Preencho o campo telefone "Telefone"
And Preencho e informo mensagem "Mensagem"
And e clico no botão enviar
Then apresenta a mesnagem ""Formato de e-mail inválido""