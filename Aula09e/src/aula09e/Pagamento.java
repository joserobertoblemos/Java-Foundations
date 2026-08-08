/**
 * 
*/
package aula09e;

/**
 *
 * @author Aluno
 */
public interface Pagamento {
 
    void processarPagamento(double valor);
    
    void emitirRecibo();
    
    double aplicarDesconto(double percentual);
}
