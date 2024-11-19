

### **Caminhos Possíveis**

#### **Caminho 1: Login bem-sucedido**
1. **N1 → N3 → N4 → N5 → N6 → N7 → N7a → N8a → N9**
   - O banco de dados conecta corretamente (**N5**).
   - A consulta SQL retorna o usuário (**N6 → N7a**).
   - Exibe a mensagem **"Bem-vindo, <nome>!"** (**N8a**).
   - Finaliza o programa.

---

#### **Caminho 2: Erro na conexão com o banco**
1. **N1 → N3 → N4 → N5 → N5a → N8b → N9**
   - O banco de dados não conecta (**N5 → N5a**).
   - Exibe a mensagem **"Login ou senha inválidos"** (**N8b**).
   - Finaliza o programa.

---

#### **Caminho 3: Usuário não encontrado**
1. **N1 → N3 → N4 → N5 → N6 → N7 → N7b → N8b → N9**
   - O banco de dados conecta corretamente (**N5**).
   - A consulta SQL é executada, mas o usuário não é encontrado (**N7 → N7b**).
   - Exibe a mensagem **"Login ou senha inválidos"** (**N8b**).
   - Finaliza o programa.

---

### **Resumo dos Caminhos**

1. **Caminho 1:** Login bem-sucedido → Mensagem de sucesso.  
2. **Caminho 2:** Falha na conexão com o banco → Mensagem de erro.  
3. **Caminho 3:** Usuário não encontrado → Mensagem de erro.  
