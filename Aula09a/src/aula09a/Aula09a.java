/**
 * Nessa classe vamos executar o sistema de Funcionarios crinado os objetos
 */
package aula09a;

public class Aula09a {

    public static void main(String[] args) {
        
        Funcionario novoFuncionario = new Funcionario("gaspar", "123.456.789-00",6500.00);
        
        novoFuncionario.mostrarDados();
        
        novoFuncionario.aumentarSalario(13.5);
        
        novoFuncionario.mostrarDados();
        
        Gerente gerente = new Gerente("Luiza", "111.222.333-44", 8500.00, "tecnologia da informação");
        
        gerente.mostrarDados();
        
        gerente.aprovarFerias(novoFuncionario.nome);
        
        gerente.aumentarSalario(9.55);
        
        gerente.mostrarDados();
    }
    
}


