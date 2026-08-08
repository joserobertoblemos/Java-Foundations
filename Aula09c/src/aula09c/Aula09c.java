/**
 * Nessa classe vamos criar o objeto do tipo produto
 */
package aula09c;

import javax.swing.JOptionPane;


public class Aula09c {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null,"Digite o nome produto.");
    double preco = Double.parseDouble(
        JOptionPane.showInputDialog(null,"Digite o preço do produto."));
    int estoque = Integer.parseInt(
        JOptionPane.showInputDialog(null,"Digite o estoque do produto."));
    
    Produto produto = new Produto(nome, preco, estoque);
    
    String msg = "Produto " + produto.getNome();
     msg += "\nPreço: R$ " + String.format("%,.2f",produto.getPreco());
     msg += "\nEstoque: " + produto.getEstoque();
     
     JOptionPane.showMessageDialog(null, "Produtos cadastrados\n" + msg);
    
    }
}
