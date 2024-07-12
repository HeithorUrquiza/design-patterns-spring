# Explorando Padrões de Projeto com o Spring

Este pequeno sistema visa explorar a implementação dos padrões de projeto Singleton, Facade e Strategy com o uso do Spring. A pequena API conta com rotas para cadastro, leitura, remoção e atualização de dados referentes a clientes e seus endereços.

## Padrões de Projeto Utilizados

### Singleton

O padrão de projeto Singleton é utilizado na injeção de dependência do Spring, garantindo que uma única instância de um bean seja criada e gerenciada pelo contêiner do Spring.

### Strategy

O padrão Strategy é usado na criação dos serviços para o repositório de clientes e rotas, permitindo que diferentes estratégias de implementação sejam definidas e selecionadas em tempo de execução.

### Facade

O padrão Facade é utilizado no controller para simplificar a comunicação entre as interfaces, fornecendo uma interface simplificada e unificada para um conjunto de interfaces em um subsistema.

## Funcionalidades da API

A API oferece as seguintes funcionalidades:

- Cadastro de clientes e seus endereços
- Leitura dos dados de clientes e endereços
- Atualização de informações de clientes e endereços
- Remoção de clientes e endereços

## Tecnologias Utilizadas

- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- H2 Database
