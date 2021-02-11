#language: pt
Funcionalidade: Realizar Login

  Cenário: Autenticar no Voala
    Quando informar os dados de logon
      | CPF   | 26434383029 |
      | Senha |        0000 |
    E clicar em Login
    Então deverá entrar no sistema
