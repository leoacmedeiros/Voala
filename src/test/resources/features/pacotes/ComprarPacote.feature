#language: pt
Funcionalidade: Comprar Pacote

  Cenário: Comprar pacote para Rio de Janeiro com sucesso
    Dado que acesse o ambiente do Voalá
    E acesse o menu Pacotes
    E informe os dados de Origem, Destino, Check-in, Check-out para pesquisar
      | Origem    | Brasília       |
      | Destino   | Rio de Janeiro |
      | Check-in  |             10 |
      | Check-out |             15 |
    E clique para Pesquisar os Pacotes
    Então irá exibir os hotéis disponíveis
    E realize a pesquisa por Nome do Hotel
      | Hotel | Copacabana |
    E acesse o hotel pesquisado
    Então irá exibir os quartos disponíveis para seleção
    E selecione o quarto
    Então irá exibir os voos disponíveis
    E selecione o voo de Ida e Volta
    E clique em Adicionar
    Quando escolher a tarifa
    Então irá ser exibida a tela de login
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
    Então irá exibir os dados de identificação dos viajantes para preenchimento
    Quando informar os dados do viajante um
      | Num de Tel   | 61999884455 |
      | Data de Nasc |    01012000 |
    E informar os dados do viajante dois
      | Nome               | Gilmar    |
      | Sobrenome          | Santos    |
      | Sexo               | Masculino |
      | Data de Nascimento |  11122001 |
    E informar os dados do Cartão para Pagamento
      | Número do cartão  | 5485 4337 2731 7949 |
      | Titular do cartão | Leonardo Medeiros   |
      | Data venc         |                0421 |
      | CVV               |                 256 |
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
