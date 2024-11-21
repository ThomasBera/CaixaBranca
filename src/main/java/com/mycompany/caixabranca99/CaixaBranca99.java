/*
 * Sistema de Login com autenticação de usuário no banco de dados.
 * Este projeto foi criado para demonstrar fluxos básicos de autenticação.
 */

 package com.mycompany.caixabranca99;

 import java.util.Scanner;
 
 /**
  * Classe principal para a execução do sistema de login.
  * Contém a entrada de dados do usuário e a interação com a classe {@link User}.
  * 
  * @author Thomas
  */
 public class CaixaBranca99 {
 
     /**
      * Método principal do programa.
      * Solicita login e senha do usuário, e verifica a autenticação.
      * 
      * @param args argumentos de linha de comando (não utilizados neste programa)
      */
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
 
         // Resultado da autenticação
         if (autenticado) {
             System.out.println("Bem-vindo, " + user.nome + "!");
         } else {
             System.out.println("Login ou senha inválidos.");
         }
 
         scanner.close();
     }
 }
 