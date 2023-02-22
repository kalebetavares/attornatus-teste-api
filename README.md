# Attornatus Desafio Java - Teste Técnico

Olá! O objetivo foi construir uma Api Rest simples para gerenciar Pessoas utilizando Java no Backend.

As tecnologias utilizadas foram:

- [Java](https://www.java.com/pt_BR/download/);
- [Spring Boot](https://spring.io/projects/spring-boot);
- [H2 Database](https://www.h2database.com/html/main.html);
- [JUnit 5](https://junit.org/junit5/);
- [Mockito](https://site.mockito.org/);


## Objetivos Propostos:

-	Criar uma pessoa
-	Editar uma pessoa
-	Consultar uma pessoa
-	Listar pessoas
-	Criar endereço para pessoa
-	Listar endereços da pessoa
-	Poder informar qual endereço é o principal da pessoa  

## Organização do Projeto

No Backend foi utilizado Java com Spring Boot e Spring Data JPA. Ele foi divido em camadas, uma para as entidades Endereco e Pessoa, uma para os controladores, uma para os serviços e outra para os DTOs.

## Testes

Foram criados testes unitários para verificar o funcionamento das entidades Endereco e Pessoa com JUnit 5 e Mockito. Para validar os endpoints foram criados uma coleção contendo todas as requisições realizadas via Postman.
