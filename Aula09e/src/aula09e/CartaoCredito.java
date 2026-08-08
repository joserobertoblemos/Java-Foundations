/**
* Nessa classe vamos implementar os métodos assinados na interface 
*/
package aula09e;

public class CartaoCredito implements Pagamento {
    
    String numeroCartao;
    double valor;
    double taxa;
    double total;
    
    public CartaoCredito(String numeroCartao, double valor){
        this.numeroCartao = numeroCartao;
        this.valor = valor;
    }
    
   @Override            // se der erro no Override o nome do metodo está diferente que na interface // se voce estiver puxando o metodo de uma interface ou uma classe superior,´precisa do override
   public void processarPagamento(double valor){
       this.taxa = valor * 0.03;
       this.total = valor + taxa;
   }
   
   @Override
   public void emitirRecibo(){
       System.out.println("Pagamento com Cartao");
       System.out.println("Taxa: R$ " + taxa);
       System.out.println("Valor da compra: R$ " + valor);
       System.out.println("Total pago: R$" + total);
   }
   
   @Override
   public double aplicarDesconto(double percentual){
       this.total = total - (total * percentual / 100);
       
       return total;
    }
   
}
