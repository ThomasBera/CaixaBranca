package com.mycompany.caixabranca99;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe responsável por gerenciar a autenticação de usuários no sistema.
 * Realiza conexão com o banco de dados e valida login e senha.
 */
public class User {
    /**
     * Nome do usuário autenticado.
     */
    public String nome = "";

    /**
     * Método para conectar ao banco de dados.
     * 
     * @return Objeto {@link Connection} para interação com o banco ou null em caso de erro.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Configuração da conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/test?user=root&password=123456&useSSL=false&serverTimezone=UTC";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        return conn;
    }

    /**
     * Método para verificar login e senha do usuário.
     * 
     * @param login Login fornecido pelo usuário.
     * @param senha Senha fornecida pelo usuário.
     * @return {@code true} se o login e a senha forem válidos, {@code false} caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";
        try (Connection conn = conectarBD();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // Substitui os placeholders na consulta SQL pelos valores fornecidos
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                nome = rs.getString("nome");
                return true; // Login e senha estão corretos
            }

        } catch (Exception e) {
            System.out.println("Erro ao executar a consulta: " + e.getMessage());
        }

        return false; // Login ou senha estão incorretos
    }
}
