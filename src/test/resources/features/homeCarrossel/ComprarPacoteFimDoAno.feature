#language: pt
Funcionalidade: Comprar Pacote para o Fim de Ano

  Cenário: Selecionar um Pacote para Fim de Ano e realizar a compra
    Dado que acesse o ambiente do Voalá
    E selecione um Pacote de Fim de Ano para comprar
    Então irá exibir as opções que o Pacote oferece
    E clicar para Comprar o Pacote
    Então irá ser exibida a tela de login
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
    E irá exibir os dados de identificação dos viajantes para preenchimento
    Quando informar os dados do viajante um
      | Num de Tel   | 61999883311 |
      | Data de Nasc |    01012000 |
    E informar os dados do viajante dois
      | Nome               | Adones   |
      | Sobrenome          | Nunes  |
      | Sexo               | Masculino |
      | Data de Nascimento |  28101998 |
    E informar os dados do Cartão para Pagamento
      | Número do cartão  |  4505358247480480 |
      | Titular do cartão | Leonardo Medeiros |
      | Data venc         |              0222 |
      | CVV               |               859 |
    E informar os dados do Titular do Cartão
      | Nome                  | Leonardo                            |
      | Sobrenome             | Medeiros                            |
      | E-mail                | leonardo.medeiros@bancorbras.com.br |
      | Confirmação de e-mail | leonardo.medeiros@bancorbras.com.br |
      | CPF                   |                         01511779020 |
      | Data de nasc          |                            11122001 |
      | Sexo                  | Masculino                           |
      | Num telefone          |                         61984777222 |
    E informar o endereço do Titular do Cartão
      | CEP         | 70336000 |
      | Número      |        1 |
      | Complemento | Lote 14  |
    E informar a quantidade de parcelas
      | Parcelas | 3 |
    E clicar para aceitar os termos e condições gerais
    E clicar para Confirmar Compra
    Então o pacote será comprado
