/**
 * Nessa classe vamos estudar o encapsulamento usando os métodos get e set
 */
package aula09c;

import javax.swing.JOptionPane;


public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque){
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        if(!nome.isBlank()){
        this.nome = nome;    
        }else {
            JOptionPane.showMessageDialog(null,"o nome do produto não pode ser vazio.");
        }
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco > 0) {
        this.preco = preco;
        }else {
         JOptionPane.showMessageDialog(null,"O preço não pode ser 0 ou negativo.");
        }
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        if(estoque >= 0){
        this.estoque = estoque;
        } else {
         JOptionPane.showMessageDialog(null, "O estoque não pode ser negativo.");
        }
    }
    
    public void vender (int quantidade){
        if(quantidade > 0 && quantidade < estoque) {
            estoque -= quantidade;
        }else if (quantidade < 0) {
            JOptionPane.showMessageDialog(null, "A quantidade não pode ser negativa.");
        }else {
            JOptionPane.showMessageDialog(null, "A quantidade não pode ser 0.");
        }
    }
}
