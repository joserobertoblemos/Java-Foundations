/**
 * Essa classe herda atributos e metodos da classe pessoa.  
 */
package aula08e;

import javax.swing.JOptionPane;


public class Aluno extends Pessoa {
    
    String matricula;
    String curso;
    
    public Aluno(String nome, String cpf, String matricula, String curso){
        super(nome, cpf);
        this.matricula = matricula;
         this.curso = curso;   
    }
    
    public void inscreverTurma(){
        String msg = this.nome + " está incrito no curso " + this.curso;
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public void exibirdados(){
        super.exibirDados();
        String msg = "matricula: " + this.matricula;
        msg += "\nCurso: " + this.curso;
        JOptionPane.showMessageDialog(null,msg);
    }
}
