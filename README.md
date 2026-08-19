[![Github Actions Status for osmarbraz/calculadora5w](https://github.com/osmarbraz/calculadora5w/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadora5w/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora5w&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_calculadora5w)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora5w&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_calculadora5w&metric=coverage)
[![Docker](https://img.shields.io/badge/Docker-image-brightgreen)](https://hub.docker.com/r/osmarbraz/calculadora5w)

# Calculadora WEB com CI.

Aplicação **Calculadora WEB** desenvolvida em **Java**, empacotada como uma aplicação **WAR** e executada em um container Docker utilizando o **Apache Tomcat**.

## Ambientes

### Utiliza 3 ambientes:

 - dev - Desenvolvimento
 - hmg - Homologação
 - prd - Produção

### Pipeline 

 - dev - Compilação e testes.
 - hmg - Análise e cobertura de código.
 - prd - Empacotamento.

## Sobre o projeto

 - O projeto foi desenvolvido no NetBeans deve ser chamado **calculadora5w**.
 - Utiliza o **Java 8**.
 - Utiliza o **Apache Tomcat 9** como servidor de aplicações Web.
 - Utiliza o **Apache Maven** para automatizar o processo de construção da aplicação.
 - A aplicação é empacotada no formato **WAR (Web Application Archive)**.
 - Utiliza o **Docker** para criar uma imagem e executar a aplicação em um container.
 - A pasta test contêm os testes unitários do projeto utilizando JUnit 5.<br>
 - A cobertura do código é realizada através do JaCoCo.<br>

# Comandos Docker
 - Utilizar o terminal do Windows Powershel em modo administrador.

### Construir a aplicação
 - ```mvn compile jib:dockerBuild```

### Executar a aplicação
 - ```docker run -d -p 8080:8080 osmarbraz/calculadora5w```