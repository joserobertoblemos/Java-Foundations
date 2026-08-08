/**
 * nessa classe vamos definir os atributos  e genéricos de um pessoa
 */
package aula08e;

import javax.swing.JOptionPane;

public class Pessoa {
    
    String nome;
    String cpf;
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void exibirDados(){
        String msg = "Nome: " + this.nome;
        msg += "\nCPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
    
}
