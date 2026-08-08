/**
 * Nessa classe vamos criar um modelo para os produtos em estoque
 */
package aula08c;

import javax.swing.JOptionPane;

public class Produto {
    
    
    String nome;
    double preco;
    int estoque;
    
    //Construtor
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this .estoque = 0;
    }
    
    public Produto (String nome,double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
           
    
    public void inserirEstoque(int valor){
        if(valor > 0 ){
            this.estoque += valor;
        } else {
            JOptionPane.showMessageDialog(null,"Valor invalido para entrada no estoque");
        }
    }
    public void retirarEstoque(int valor){
        if (valor > this.estoque) {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente no estoque");
        } else if (valor <= 0){
            JOptionPane.showMessageDialog(null,"Valor invalido para retirar no estoque");
        }else {
            this.estoque -= valor;
        }
    }
    
    public void imprimirDados(){
        String msg = "Nome do Produto: " + this.nome + "\n";
        msg += "preco do produto: R$ " + String.format("%.2f",this.preco) + "\n";
        msg += "Quantidade em Estoque: " + this.estoque;
        JOptionPane.showMessageDialog(null,msg);
    }
}
