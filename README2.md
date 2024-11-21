# Caixa Branca 99 - Teste de Verificação de Usuário

## Descrição

Este repositório contém o projeto **Caixa Branca 99**, que tem como objetivo aplicar técnicas de **teste de caixa branca** em um sistema de verificação de usuários desenvolvido em **Java** e utilizando um banco de dados **MySQL**. O principal foco da atividade foi a análise do código de forma estática, identificando possíveis erros, propondo melhorias e documentando o código para uma melhor manutenção.

O projeto simula um sistema de autenticação de usuários com funcionalidades de verificação de login, validação de dados e controle de exceções.

## Objetivo

O principal objetivo do projeto é testar e melhorar a funcionalidade de **verificação de usuário** através da aplicação de técnicas de teste de **caixa branca**, com as seguintes ações principais:

- Análise estática do código.
- Geração de um grafo de fluxo para visualização dos caminhos de execução.
- Cálculo da **complexidade ciclomática** do código.
- Propostas de melhorias no código e segurança.
- Criação de **Javadoc** para documentar o sistema.

## Funcionalidades

O projeto abrange as seguintes funcionalidades:

- **Verificação de login**: O sistema autentica usuários por meio de login e senha, conectando-se ao banco de dados.
- **Consulta SQL**: Validação das credenciais do usuário no banco de dados MySQL.
- **Mensagens de erro e sucesso**: O sistema exibe mensagens conforme o sucesso ou falha do login, incluindo mensagens de erro específicas.
- **Tratamento de exceções**: Melhorias no tratamento de exceções durante a conexão ao banco de dados e consultas SQL.
- **Segurança nas consultas**: Melhoria nas práticas de segurança das consultas SQL, evitando riscos como **SQL Injection**.

## Análise de Caixa Branca

Durante a atividade, foi realizada uma análise de caixa branca, focando nos seguintes pontos:

1. **Grafo de Fluxo**: Foi criado um grafo de fluxo para representar visualmente os caminhos de execução do código, facilitando a compreensão do processo de autenticação.
   
2. **Complexidade Ciclomática**: A **complexidade ciclomática** foi calculada para avaliar a quantidade de caminhos independentes possíveis no código, ajudando a identificar áreas que podem ser otimizadas ou que requerem maior cobertura de testes.

3. **Testes Estáticos**: Foram preenchidos formulários para testes estáticos, ajudando a verificar se o código segue boas práticas e identificando áreas suscetíveis a erros ou melhorias.

## Melhorias Realizadas

Durante o processo de análise, diversas melhorias foram realizadas no código, incluindo:

- **Correção de falhas de exceção**: Foram corrigidos pontos onde o código não tratava adequadamente exceções, o que poderia gerar falhas no sistema.
- **Aprimoramento da segurança das consultas SQL**: Melhorias nas práticas de consulta para proteger contra **SQL Injection** e garantir que as consultas sejam seguras.
- **Otimização da estrutura do código**: Refatoração de partes do código para melhorar a legibilidade, eficiência e manutenibilidade.
- **Documentação com Javadoc**: O código foi documentado com **Javadoc** para melhorar a compreensão e facilitar a manutenção futura.

- **Autor**: Thomas Bera
- **Data**: Novembro de 2024

