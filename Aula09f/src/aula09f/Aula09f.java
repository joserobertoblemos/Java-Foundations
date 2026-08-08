/**
 * Nessa classe vamos criar os produtos da classe Notebook
 */
package aula09f;

import javax.swing.JOptionPane;

public class Aula09f {

    public static void main(String[] args) {
        
        Produto produto = new Notebook("Dell Inspiron", "Dell", 4500,10,50);
            
        produto.mostrarProduto();
        JOptionPane.showMessageDialog(null,"Preço Final com desconto: " + produto.calcularPrecoFinal());
        
    }
    
}
