#language: pt
Funcionalidade: Alugar Carro

  Cenário: Efetuar aluguel de carro com sucesso
    Dado que acesse o ambiente do Voalá
    E acesse o menu Carros
    E informe a cidade da retirada do Carro, a data e o horário
      | Retirar carro em | São Paulo |
      | Data retirada    |        10 |
      | Horário retirada | 10:00     |
    E selecione a data de devolução e horário
      | Data devolução    |    15 |
      | Horário devolução | 10:00 |
    E clique para Pesquisar os Carros
    Então irá exibir os Carros disponíveis para locação
    E selecione a locadora Unidas
      | Locadora | Unidas |
    E selecione o Carro do Modelo Econômico
    E selecione a Proteção a Terceiros
    E clique para Finalizar a Locação
    Então irá ser exibida a tela de login
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
    E informar os dados do viajante
      | Nome               | Leonardo                            |
      | Sobrenome          | Medeiros                            |
      | CPF                | Gerar Automaticamente               |
      | Sexo               | Masculino                           |
      | Data de nascimento |                            05051999 |
      | E-mail             | leonardo.medeiros@bancorbras.com.br |
      | Num telefone       |                         61999977777 |
    E informar os dados do Cartão para Pagamento da Locação do Carro
      | Número do cartão  | 5306 5926 3528 5873 |
      | Titular do cartão | Leonardo Medeiros   |
      | Data venc         |                0222 |
      | CVV               |                 781 |
    E informar os dados do Titular do Cartão para Locação do Carro
      | Nome                  | Leonardo                            |
      | Sobrenome             | Medeiros                            |
      | E-mail                | leonardo.medeiros@bancorbras.com.br |
      | Confirmação de e-mail | leonardo.medeiros@bancorbras.com.br |
      | CPF                   | Gerar Automaticamente               |
      | Data de nasc          |                            11122001 |
      | Sexo                  | Masculino                           |
      | Num telefone          |                         61984777222 |
    E informar o endereço do Titular do Cartão para Locação do Carro
      | CEP         | 70336000 |
      | Número      |        1 |
      | Complemento | Lote 14  |
    E informar a quantidade de parcelas para pagamento da Locação do Carro
      | Parcelas | 3 |
    E clicar para aceitar os termos e condições gerais
    Quando clicar para Confirmar Compra
    Então a Locação de Carro será efetuada
    Então a locação do carro deverá ser exibida em Minhas Viagens
