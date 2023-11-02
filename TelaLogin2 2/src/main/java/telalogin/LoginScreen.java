/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telalogin;
import java.util.Scanner;

/**
 *
 * @author danilobarros
 */
import java.util.Scanner;

/**
 * Classe para um programa simples de autenticação de console.
 */
/**
 * Classe que representa a tela de login.
 */
public class LoginScreen {
    /**
     * Método principal que solicita ao usuário um nome de usuário e senha e verifica a autenticação.
     *
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Autenticar autenticar = new Autenticar(); // Cria uma instância da classe Autenticar para realizar a autenticação.
        Scanner scanner = new Scanner(System.in); // Cria uma instância do Scanner para ler a entrada do usuário.

        System.out.println("Bem-vindo ao sistema de login!"); // Exibe uma mensagem de boas-vindas.

        System.out.print("Usuário: "); // Solicita o nome de usuário ao usuário.
        String username = scanner.nextLine(); // Lê o nome de usuário fornecido pelo usuário.

        System.out.print("Senha: "); // Solicita a senha ao usuário.
        String password = scanner.nextLine(); // Lê a senha fornecida pelo usuário.

        if (autenticar.autenticar(username, password)) { // Chama o método de autenticação e verifica se a autenticação é bem-sucedida.
            System.out.println("Login bem-sucedido!"); // Exibe uma mensagem de login bem-sucedido.
        } else {
            System.out.println("Login falhou. Tente novamente."); // Exibe uma mensagem de login falhado se a autenticação não for bem-sucedida.
        }
    }
}

    

