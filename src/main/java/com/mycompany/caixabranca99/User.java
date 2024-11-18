package com.mycompany.caixabranca99;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User {
    public String nome = ""; // Nome do usuário autenticado

    // Método para conectar ao banco de dados
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/test?user=root&password=123456&useSSL=false&serverTimezone=UTC";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        return conn;
    }

    // Método para verificar login e senha do usuário
    public boolean verificarUsuario(String login, String senha) {
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";
        try (Connection conn = conectarBD();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, login); // Substitui o primeiro "?" pelo login
            ps.setString(2, senha); // Substitui o segundo "?" pela senha

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
