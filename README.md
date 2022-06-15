[![Github Actions Status for osmarbraz/calculadora5w](https://github.com/osmarbraz/calculadora5w/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadora5w/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora5w&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_calculadora5w)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora5w&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_calculadora5w&metric=coverage)

# Calculadora WEB com CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação e testes.
- hmg - Análise e cobertura de código.
- prd - Empacotamento.

<br>
- O projeto foi desenvolvido no NetBeans deve ser chamado calculadora5w.<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 5.<br>
- A cobertura do código é realizada através do JaCoCo.<br>