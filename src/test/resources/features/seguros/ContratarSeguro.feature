#language: pt
Funcionalidade: Contratar Seguro

  Cenário: Contratar seguro básico para 1 pessoa com sucesso
    Dado que acesse o ambiente do Voalá
    E acesse o menu Seguros
    E informe o destino
      | Destino | Brasil |
    E selecione a data de Embarque
      | Data embarque | 4 meses |
    E selecione a data de Desembarque
      | Data desembarque | 4 dias |
    E selecione a quantidade de Passageiros
    E clique para Pesquisar os Seguros
    Então irá exibir os Seguros disponíveis para contratação
    E selecione a Categoria Basic
      | Categoria | Basic |
    E clique em ver o primeiro seguro Basic
    Então irá exibir as coberturas do Seguro
    Quando clicar em Finalizar o Seguro
    Então irá ser exibida a tela de login
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
    E informar os dados do viajante do Seguro
      | Nome               | Leonardo Alves Caitano de           |
      | Sobrenome          | Medeiros                            |
      | CPF                | Gerar Automaticamente               |
      | Sexo               | Masculino                           |
      | Data de nascimento |                            05051999 |
      | E-mail             | leonardo.medeiros@bancorbras.com.br |
      | Num telefone       |                         61999977777 |
    E informar o endereço do Viajante do Seguro
      | CEP         | 70336000 |
      | Número      |        1 |
      | Complemento | Lote 14  |
    E informar o contato para caso de emergência
      | Nome      | Leonardo    |
      | Sobrenome | Medeiros    |
      | Telefone  | 61999887744 |
    E clicar na opção para confirmar a declaração de verificação dos passageiros
    E informar os dados do Cartão para Pagamento do Seguro
      | Número do cartão  |  4565301556461920 |
      | Titular do cartão | Leonardo Medeiros |
      | Data venc         |              0122 |
      | CVV               |               710 |
    E informar os dados do Titular do Cartão para Pagamento do Seguro
      | Nome                  | Leonardo                         |
      | Sobrenome             | Medeiros                         |
      | E-mail                | automacaovoala@bancorbras.com.br |
      | Confirmação de e-mail | automacaovoala@bancorbras.com.br |
      | CPF                   | Gerar Automaticamente            |
      | Data de nasc          |                         11122001 |
      | Sexo                  | Masculino                        |
      | Num telefone          |                      61984777222 |
    E informar o endereço do Titular do Cartão para Pagamento do Seguro
      | CEP         | 70336000 |
      | Número      |        1 |
      | Complemento | Lote 14  |
    E informar a quantidade de parcelas para pagamento da Locação do Carro
      | Parcelas | 2 |
    E clicar para aceitar os termos e condições gerais
    Quando clicar para Confirmar Compra
    Então a Compra do Seguro será efetuada
