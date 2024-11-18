/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixabranca99;

import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class CaixaBranca99 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("=== Sistema de Login ===");
        
        // Coletando login e senha do usuário
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        // Verificando o usuário
        boolean autenticado = user.verificarUsuario(login, senha);

        // Resultado
        if (autenticado) {
            System.out.println("Bem-vindo, " + user.nome + "!");
        } else {
            System.out.println("Login ou senha inválidos.");
        }

        scanner.close();
    }
        
    }
