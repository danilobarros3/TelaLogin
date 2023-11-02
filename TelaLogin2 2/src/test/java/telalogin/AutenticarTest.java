/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package telalogin;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danilobarros
 */
public class AutenticarTest {

    public AutenticarTest() {
    }

    /**
     * Teste para verificar a autenticação bem-sucedida quando o usuário e a senha estão corretos.
     */
    @org.junit.jupiter.api.Test
    public void testeUsuarioESenhaCorreto() {

        String usuario = "admin";
        String senha = "senha123";
        Autenticar autenticar = new Autenticar();
        boolean result = autenticar.autenticar(usuario, senha);
        assertTrue(result);
    }
    
    /**
     * Teste para verificar a autenticação mal sucedida quando o usuário está incorreto.
     */
    public void testeUsuarioIncorreto(){
        String usuario = "adm";
        String senha = "senha123";
        Autenticar autenticar = new Autenticar();
        boolean result = autenticar.autenticar(usuario, senha);
        assertFalse(result);
    }
    
    /**
     * Teste para verificar a autenticação mal sucedida quando a senha está incorreta.
     */
    public void testeSenhaIncorreto(){
        String usuario = "admin";
        String senha = "senha";
        Autenticar autenticar = new Autenticar();
        boolean result = autenticar.autenticar(usuario, senha);
        assertFalse(result);
    }
    
    /**
     * Teste para verificar a autenticação mal sucedida quando o usuário e a senha estão incorretos.
     */
    public void testeUsuarioESenhaIncorreto(){
        String usuario = "adm";
        String senha = "senha";
        Autenticar autenticar = new Autenticar();
        boolean result = autenticar.autenticar(usuario, senha);
        assertFalse(result);
    }   
}