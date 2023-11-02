# README - Código em Java para Teste de Autenticação

Este é um código Java que contém testes para verificar a autenticação de um usuário. O código utiliza a biblioteca JUnit 5 para executar os testes. O principal objetivo é garantir que o processo de autenticação funcione corretamente em diferentes cenários.

## Estrutura do Código

O código está organizado da seguinte forma:

1. **Pacote (`package telalogin`)**: O código está no pacote `telalogin`.

2. **Classe `AutenticarTest`**: Esta classe contém os métodos de teste para verificar a autenticação.

## Métodos de Teste

Os métodos de teste na classe `AutenticarTest` avaliam o processo de autenticação em diferentes cenários:

1. **testeUsuarioESenhaCorreto**: Este teste verifica a autenticação bem-sucedida quando o usuário e a senha estão corretos. O usuário é definido como "admin" e a senha como "senha123". Espera-se que a autenticação seja bem-sucedida.

2. **testeUsuarioIncorreto**: Este teste verifica a autenticação mal sucedida quando o usuário está incorreto. O usuário é definido como "adm" e a senha como "senha123". Espera-se que a autenticação seja mal sucedida.

3. **testeSenhaIncorreto**: Este teste verifica a autenticação mal sucedida quando a senha está incorreta. O usuário é definido como "admin" e a senha como "senha". Espera-se que a autenticação seja mal sucedida.

4. **testeUsuarioESenhaIncorreto**: Este teste verifica a autenticação mal sucedida quando o usuário e a senha estão incorretos. O usuário é definido como "adm" e a senha como "senha". Espera-se que a autenticação seja mal sucedida.

## Executando os Testes

Para executar os testes, você deve utilizar um ambiente de desenvolvimento Java que suporte o JUnit 5, como o IntelliJ IDEA ou o Eclipse. Certifique-se de ter a biblioteca JUnit 5 no classpath do projeto.

Após configurar o ambiente, você pode executar os testes da classe `AutenticarTest` para verificar se o processo de autenticação está funcionando corretamente em diferentes cenários.

Lembre-se de que os testes aqui descritos são apenas exemplos e podem ser adaptados de acordo com as necessidades do seu sistema de autenticação.

## Conclusão

Este código fornece testes básicos para verificar a funcionalidade de autenticação. É importante expandir e adaptar os testes para cobrir todos os casos de uso relevantes no seu sistema. 
