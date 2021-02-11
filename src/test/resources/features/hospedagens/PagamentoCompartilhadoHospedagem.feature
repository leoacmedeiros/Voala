#language: pt
Funcionalidade: Pagamento Compartilhado Hospedagem

  Cenário: Comprar Hospedagem para um destino e realizar pagamento compartilhado
    Dado que acesse o ambiente do Voalá
    E acesse o menu Hospedagem
    E informe os dados de Destino, Check-in, Check-out para Hospedagem
      | Destino   | Rio de Janeiro       |
      | Check-in  | 4 meses pra frente   |
      | Check-out | 4 dias de hospedagem |
    E clique para Pesquisar as Hospedagens
    Então irá exibir os hotéis disponíveis para Hospedagem
    E pesquise o Nome do Hotel para Hospedar
      | Hotel | Promenade Link Stay |
    E acesse o hotel pesquisado para Hospedar
    Então irá exibir os quartos disponíveis para seleção
    E selecione o quarto da Hospedagem
    Então irá ser exibida a tela de login
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
    E irá exibir os dados de identificação para preenchimento
    Quando informar os dados do Titular do Quarto um
      | Num de Tel | 61998884422 |
    E selecionar a opção Pagamento Compartilhado
    E adicionar mais um Pagante
    E inserir os dados do Pagante adicional
      | Nome   | Guilherme Amado                     |
      | E-mail | leonardo.medeiros@bancorbras.com.br |
    E clicar para Dividir Valores Igualmente
    Então os valores serão divididos igualmente entre os Pagantes
    Quando clicar para Efetuar meu pagamento
    Então irá exibir os dados do cartão para pagamento compartilhado
    E informar os dados do Cartão para Pagamento da Hospedagem Compartilhada
      | Número do cartão  | 5295 1432 2458 5993 |
      | Titular do cartão | Leonardo Medeiros   |
      | Data venc         |                1022 |
      | CVV               |                 753 |
    E informar os dados do Titular do Cartão para realizar a Hospedagem Compartilhada
      | Nome                  | Leonardo                            |
      | Sobrenome             | Medeiros                            |
      | E-mail                | leonardo.medeiros@bancorbras.com.br |
      | Confirmação de e-mail | leonardo.medeiros@bancorbras.com.br |
      | CPF                   |                         01511779020 |
      | Data de nasc          |                            11122001 |
      | Sexo                  | Masculino                           |
      | Num telefone          |                         61984777222 |
    E informar o endereço do Titular do Cartão para realizar a Hospedagem Compartilhada
      | CEP         | 70336000 |
      | Número      |        1 |
      | Complemento | Lote 14  |
    E informar a quantidade de parcelas para pagamento da Hospedagem Compartilhada
      | Parcelas | 3 |
    E clicar para aceitar os termos e condições gerais
    E clicar para Confirmar Compra
    Então a Hospedagem será comprada
