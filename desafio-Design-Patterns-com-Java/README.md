# My Spring Boot Patterns Project

## Descrição
Este projeto explora a implementação prática de alguns dos padrões de projeto clássicos (GoF) com **Java** e **Spring Boot**. Ele inclui exemplos de padrões como **Singleton**, **Factory Method**, **Observer**, e **Strategy**, demonstrando como eles podem ser usados em um projeto de software moderno.

## Estrutura do Projeto
O projeto segue a seguinte estrutura:

```
my-springboot-patterns-project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── mypatterns/
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   └── PatternController.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── FactoryService.java
│   │   │   │   │   │   ├── SingletonService.java
│   │   │   │   │   │   └── StrategyService.java
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── Product.java
│   │   │   │   │   │   ├── SingletonExample.java
│   │   │   │   │   │   ├── ObserverExample.java
│   │   │   │   │   │   └── StrategyExample.java
│   │   │   │   │   ├── util/
│   │   │   │   │       ├── Observer.java
│   │   │   │   │       ├── ProductFactory.java
│   │   │   │   │       └── StrategyContext.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── static/
│   │   └── pom.xml
└── README.md
```

## Padrões de Projeto Implementados

### 1. Singleton Pattern
O Singleton garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
- **Classe**: `SingletonExample.java`
- **Serviço**: `SingletonService.java`

### 2. Factory Method Pattern
O Factory Method fornece uma interface para criar objetos, permitindo que as subclasses decidam qual classe instanciar.
- **Classe**: `Product.java`
- **Factory**: `ProductFactory.java`
- **Serviço**: `FactoryService.java`

### 3. Observer Pattern
O Observer define uma dependência um-para-muitos entre objetos, notificando automaticamente os dependentes quando um objeto muda de estado.
- **Classe**: `ObserverExample.java`
- **Interface**: `Observer.java`

### 4. Strategy Pattern
O Strategy define uma família de algoritmos, encapsulando cada um e tornando-os intercambiáveis.
- **Classe**: `StrategyExample.java`
- **Contexto**: `StrategyContext.java`
- **Serviço**: `StrategyService.java`

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/joartur/dio-trilha-java-basico/desafio-Design-Patterns-com-Java.git
   cd desafio-Design-Patterns-com-Java
   ```

2. Instale as dependências:
   ```bash
   mvn install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse os endpoints:
   - Singleton: [http://localhost:8080/patterns/singleton](http://localhost:8080/patterns/singleton)
   - Factory: [http://localhost:8080/patterns/factory](http://localhost:8080/patterns/factory)
   - Strategy: [http://localhost:8080/patterns/strategy](http://localhost:8080/patterns/strategy)

## Licença
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
