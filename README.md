# ETAPA 01: Erros Encontrados no Código Java 

Principais problemas identificados no código para a conexão com o banco de dados MySQL.

1. **Vulnerabilidade a Injeção de SQL**  
   **Problema**: A consulta SQL é formada pela concatenação direta dos parâmetros de entrada, o que pode levar a injeções de SQL.  
   **Solução**: Utilize `PreparedStatement` para construir consultas de forma segura, evitando esse tipo de vulnerabilidade.

2. **Erro no Carregamento do Driver JDBC**  
   **Problema**: O driver JDBC do MySQL foi carregado de maneira incorreta.  
   **Solução**: O driver correto a ser utilizado é `com.mysql.cj.jdbc.Driver`.

3. **URL de Conexão Incorreta**  
   **Problema**: A URL de conexão não especifica a porta padrão do MySQL e não inclui parâmetros importantes.  
   **Solução**: A URL deve ser formatada corretamente, como em `jdbc:mysql://127.0.0.1:3306/test?user=root&password=123456&useSSL=false&serverTimezone=UTC`.

4. **Tratamento de Exceções Inadequado**  
   **Problema**: As exceções são capturadas, mas não fornecem informações úteis para depuração.  
   **Solução**: Utilize `System.out.println()` para registrar mensagens de erro que ajudem na identificação de problemas.

5. **Verificação de Conexão Ausente**  
   **Problema**: O código não verifica se a conexão com o banco de dados foi estabelecida corretamente.  
   **Solução**: Adicione uma verificação para garantir que a conexão (`conn`) não seja `null` antes de utilizá-la.

6. **Recursos Não Fechados Corretamente**  
   **Problema**: A conexão com o banco de dados não é fechada adequadamente, o que pode causar vazamentos de memória.  
   **Solução**: Utilize `try-with-resources` para garantir que a conexão e outros recursos sejam fechados automaticamente.

7. **Configuração de Classe Principal no pom.xml**  
   **Problema**: O nome da classe principal e o pacote no `pom.xml` podem não corresponder ao código real.  
   **Solução**: Verifique se o valor de `<exec.mainClass>` no `pom.xml` está correto e corresponde ao nome da classe principal.

8. **Credenciais de Banco de Dados Codificadas**  
   **Problema**: As credenciais de acesso ao banco de dados estão codificadas diretamente no código-fonte.  
   **Solução**: Utilize variáveis de ambiente ou arquivos de configuração para armazenar essas informações de forma segura.
