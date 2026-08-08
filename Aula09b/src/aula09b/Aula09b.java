/**
 * Nessa classe vamos criar os objetos do tipo ContaBancaria
 */
package aula09b;


public class Aula09b {

    public static void main(String[] args) {
       
        ContaBancaria novaConta = new ContaBancaria ("Jorge","12345-67");
        
        novaConta.mostrarSaldo();
        
        novaConta.depositar(5000.00);
        
        novaConta.mostrarSaldo();
        
        novaConta.depositar(-5000.00);
        
        novaConta.sacar(3000.00);
        
        novaConta.mostrarSaldo();
        
        novaConta.sacar(3000.00);
        
        novaConta.sacar(0);
        
        novaConta.mostrarSaldo();
        
        novaConta.setTitular("Jorge da Silva");
        
        novaConta.mostrarSaldo();
    }
    
}
