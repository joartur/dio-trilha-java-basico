# Banco Digital em Java

Este é um projeto de exemplo que simula um banco digital, desenvolvido em Java com conceitos de Orientação a Objetos. A aplicação permite a criação de contas, realização de depósitos, saques, transferências, e aplicação de rendimentos em contas poupança, além de contar com taxas específicas para contas correntes.

## Funcionalidades

- **Criação de contas**: Possibilidade de criar contas correntes e poupança.
- **Depósitos**: Realize depósitos em qualquer conta.
- **Saques**: Saques com taxas específicas para contas correntes.
- **Transferências**: Transfira valores entre contas com taxas específicas para contas correntes.
- **Rendimentos**: Aplique rendimentos em contas poupança.
- **Visualização de extratos**: Veja o extrato detalhado de qualquer conta.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- `BancoApp.java`: Classe principal que implementa a interface de linha de comando (CLI) para interação com o usuário.
- `Conta.java`: Classe abstrata que define o comportamento genérico de uma conta bancária.
- `ContaCorrente.java`: Classe que herda de `Conta` e implementa funcionalidades específicas de uma conta corrente, como taxas de saque e transferência.
- `ContaPoupanca.java`: Classe que herda de `Conta` e implementa funcionalidades específicas de uma conta poupança, como a aplicação de rendimentos.
- `Cliente.java`: Classe que representa os clientes do banco.

## Pré-requisitos

- **Java Development Kit (JDK)** 8 ou superior
- **IDE** como Visual Studio Code, IntelliJ IDEA, ou qualquer editor de texto de sua preferência.

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/banco-digital-java/projeto-banco.git
   cd banco-digital-java

<h2>Compile os arquivos Java:</h2>

cd src
javac BancoApp.java Conta.java ContaCorrente.java ContaPoupanca.java Cliente.java

<h2>Execute a aplicação:</h2>

java BancoApp

<h2>Exemplo de Uso</h2>

Após executar a aplicação, você verá um menu interativo com opções como criar contas, realizar depósitos, saques, transferências e visualizar extratos.

<h2>Contribuição</h2>

Sinta-se à vontade para contribuir com melhorias, novas funcionalidades e correções. Para contribuir, siga estas etapas:

    1. Faça um fork do projeto.
    2. Crie uma branch para sua feature (git checkout -b feature/nova-feature).
    3. Faça commit de suas alterações (git commit -m 'Adiciona nova feature').
    4. Envie suas alterações para o repositório remoto (git push origin feature/nova-feature).
    5. Abra um pull request.

<h2>Licença</h2>

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
