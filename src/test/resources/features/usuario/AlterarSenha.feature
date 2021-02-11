#language: pt
Funcionalidade: Cadastrar Usuário

  Cenário: Cadastro de Usuário no Voalá
    Dado que acesse o ambiente do Voalá
    E clique em Cadastre-se
    E informe os dados de CPF, Senha e Confirmação da Senha
      | CPF            | Gerado Automaticamente |
      | Senha          | 123abcde               |
      | Conf. da Senha | 123abcde               |
    E clique em Criar Conta
    E preencha o formulário Meus Dados
      | Nome               | Leonardo               |
      | Sobrenome          | Medeiros               |
      | E-mail             | Gerado Automaticamente |
      | Data de nascimento |               01012000 |
      | Sexo               | Masculino              |
    E clique no botão para continuar
    E preencha o formulário de Endereço
      | Num Telefone | 61999998888 |
      | CEP          |    70336000 |
      | Número       |           1 |
      | Complemento  | Lote 14     |
    Quando clicar em Finalizar
    Então o usuário será criado

  Cenário: Alterar senha do usuário
    Dado que acesse Minha Conta
    E clique para criar uma nova senha
    E informe a senha antiga
      | Senha antiga | 123abcde |
    E informe a nova senha
      | Senha nova    | 1234 |
      | Conf da senha | 1234 |
    Então deverá apresentar mensagem que a senha deve conter letras e números
    E informe uma nova senha
      | Senha nova    | 1234@qwer |12341234@qwer|
      | Conf da senha | 1234@qwer |12341234@qwer|
    Então a senha vai ser alterada com sucesso
