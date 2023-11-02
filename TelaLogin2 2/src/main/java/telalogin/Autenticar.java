/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package telalogin;

/**
 *
 * @author danilobarros
 */
/**
 * Esta classe fornece um método de autenticação simples para verificar as credenciais do usuário.
 */
public class Autenticar {

    /**
     * Este método verifica se o nome de usuário e a senha fornecidos correspondem a um conjunto de credenciais pré-definido.
     *
     * @param username O nome de usuário fornecido pelo usuário.
     * @param password A senha fornecida pelo usuário.
     * @return true se as credenciais fornecidas forem iguais a "admin" e "senha123", caso contrário, retorna false.
     */
    public boolean autenticar(String username, String password) {
        // Simples autenticação de exemplo
        return username.equals("admin") && password.equals("senha123");
    }
}
