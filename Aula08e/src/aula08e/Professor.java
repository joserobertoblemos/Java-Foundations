/**
 * 
 */
package aula08e;

import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    
    String disciplina;
    double salario;

    public Professor(String nome, String cpf, String disciplina, Double salario) {
        super(nome, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    public void registrarDisciplina(){
        String msg = this.nome + "está registrado na disciplina: " + this.disciplina;
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public void exibirdados(){
         String msg = "Nome: " + this.nome;
        msg += "\nCPF: " + this.cpf;
        msg += "\nSálario: " + this.salario;
        JOptionPane.showMessageDialog(null, msg);
    }
}
