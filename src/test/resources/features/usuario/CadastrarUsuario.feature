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
      | Nome               | Leonardo            |
      | Sobrenome          | Medeiros            |
      | E-mail             | vuqequsy@vomoto.com |
      | Data de nascimento |            13111983 |
      | Sexo               | Masculino           |
    E clique no botão para continuar
    E preencha o formulário de Endereço
      | Num Telefone | 61999998888 |
      | CEP          |    70336000 |
      | Número       |           1 |
      | Complemento  | Lote 14     |
    Quando clicar em Finalizar
    Então o usuário será criado
