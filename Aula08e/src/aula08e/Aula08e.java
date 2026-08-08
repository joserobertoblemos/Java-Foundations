/**
 * metodo da classe mãe na classe filha aproveitando o métedodo
 */
package aula08e;

import javax.swing.JOptionPane;


public class Aula08e {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa: ");
        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF da pessoa");
        
        Pessoa pessoaGenerica = new Pessoa (nome, cpf);
        pessoaGenerica.exibirDados(); 
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        cpf = JOptionPane.showInputDialog(null, "Digite o CPF do aluno: ");
        String matricula = JOptionPane.showInputDialog(null, "Digite a matricula do aluno: ");
        String curso = JOptionPane.showInputDialog(null, "Digite o curso do aluno: ");
        
        Aluno novoAluno = new Aluno(nome,cpf,matricula,curso);
        novoAluno.inscreverTurma();
        novoAluno.exibirdados();
        
        String disciplina = JOptionPane.showInputDialog(null,"Digite a Disciplina: ");
        Double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Salário: "));
        
        Professor prof1 = new Professor (nome, cpf, disciplina, salario);
        
    }
    
}
