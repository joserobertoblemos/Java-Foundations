/**
 * Essa classe herda os metodos e atributos da Classe Funcionario e implementa seus proprios atributos e métodos 
 */
package aula09a;

import javax.swing.JOptionPane;


public class Gerente extends Funcionario{
    
    String departamento;
    
    public Gerente(String nome, String cpf, double salario, String departamento){
        super(nome, cpf, salario);
        this.departamento = departamento;
    }
    
    public void aprovarFerias(String funcionario){
        JOptionPane.showMessageDialog(null,nome + " aprovou as férias de " + funcionario);
    }
    
    @Override
    public void mostrarDados(){
        String msg = "nome: " + nome;
        msg += "\nCPF: " + cpf;
        msg += "\nSalario: R$ " + String.format("%,.2f",salario);
        msg += "\nDepartamento: " + departamento;
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
