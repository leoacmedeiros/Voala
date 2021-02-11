#language: pt
Funcionalidade: Comprar Passagem Aérea

  Cenário: Comprar Passagem Aérea para Fortaleza com sucesso
    Dado que acesse o ambiente do Voalá
    E acesse o menu Passagens Aéreas
    E selecione a opção de Ida e Volta
    E digite a cidade de origem
      | Origem | Rio De Janeiro |
    E digite a cidade de destino
      | Destino | Recife |
    E selecione a data de Ida e Volta do Voo
      | Data de ida   | 10 |
      | Data de volta | 15 |
    E clique para Pesquisar os Voos
    Então irá exibir os Voos disponíveis
    E selecionar a Companhia Aérea
      | Cia Aérea | Gol |
    E selecionar os Voos de Ida e Volta
    E clique em Adicionar
    Quando escolher a tarifa
    Então irá ser exibida a tela de login
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
    Então irá exibir os dados de identificação dos viajantes para preenchimento
    Quando informar os dados do viajante do Voo um
      | Num de Tel | 61999991111 |
    E informar os dados do viajante do Voo dois
      | Nome               | Leonardo Alves |
      | Sobrenome          | de Medeiros    |
      | Sexo               | Masculino      |
      | Data de Nascimento |       11122001 |
    Então irá ser feito uma pré reserva
    E informar os dados do Cartão para Pagamento do Voo
      | Número do cartão  | 5570 5372 7468 5080 |
      | Titular do cartão | Leonardo Medeiros   |
      | Data venc         |                0922 |
      | CVV               |                 888 |
    E informar os dados do Titular do Cartão do passageiro do Voo
      | Nome                  | Leonardo                         |
      | Sobrenome             | Medeiros                         |
      | E-mail                | automacaovoala@bancorbras.com.br |
      | Confirmação de e-mail | automacaovoala@bancorbras.com.br |
      | CPF                   |                      01511779020 |
      | Data de nasc          |                         11122001 |
      | Sexo                  | Masculino                        |
      | Num telefone          |                      61984777222 |
    E informar o endereço do Titular do Cartão do passageiro do Voo
      | CEP         | 70336000 |
      | Número      |        1 |
      | Complemento | Lote 14  |
    E informar a quantidade de parcelas do pagamento do Voo
      | Parcelas | 3 |
    E clicar para aceitar os termos e condições gerais
    E clicar para Confirmar Compra
    Então o Voo será comprado
