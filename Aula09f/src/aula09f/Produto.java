/**
 * Nessa Classe vamos estudar os metodos abstratos usando o paradigma da abstração 
*/
package aula09f;

import javax.swing.JOptionPane;

public abstract class Produto {
   
    protected String nome;
    protected String fabricante;
    protected double preco;
    
    public Produto (String nome, String fabricante, double preco){
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }
    
    public void mostrarProduto(){
        String msg = "produto: " + nome;
        msg += "\nFabricante: " + fabricante; 
        msg += "\npreco: R$ " + preco;
        JOptionPane.showMessageDialog(null,msg);
    }
    
    public abstract double calcularPrecoFinal();
}
