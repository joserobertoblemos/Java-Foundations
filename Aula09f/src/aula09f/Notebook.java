/**
 * nessa classe vamos herdar os atributos e métodos da classe profuto.
 * e implementar seus métodos abstratos
 */
package aula09f;


public class Notebook extends Produto{
    
    private double desconto;
    private double frete;
    
    
    public Notebook(String nome, String fabricante, double preco, double desconto,double frete){
        super(nome, fabricante,preco);
        this.desconto = desconto;
        this.frete = frete;
    }
    
    @Override
    public double calcularPrecoFinal(){
        double valorComDesconto = preco - (preco * desconto / 100);
        return valorComDesconto + frete;
    }
}
