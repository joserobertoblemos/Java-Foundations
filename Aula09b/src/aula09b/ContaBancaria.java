/**
 * Nessa classe vamos criar os atributos encapsulados para protege-los de acessos
 * indevidos ou por descuido. para acessar esses atributos vamos utilizar os metodos
 * get e cet.  (getters e cetters)
 */
package aula09b;

import javax.swing.JOptionPane;

public class ContaBancaria {
    
    private String titular;
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    
    public String getTitular(){
        return this.titular;
    }
     
    public void setTitular(String titular){
        if (!titular.isBlank()){
            this.titular = titular;
        } else {
            JOptionPane.showMessageDialog(null, "o titular não pode ser vazio");
        }
    }
    
    public String getNumeroConta(){
        return this.numeroConta;
        
    }
    
    public void setNumeroConta(String numeroConta){
        if (!numeroConta.isBlank()){
            this.numeroConta = numeroConta;
        } else {
            JOptionPane.showMessageDialog(null, "O numero da conta não pode ser vazio");
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }else {
            JOptionPane.showMessageDialog(null,"Deposito invalido!");
        }
    }
    
    public void sacar (double valor){
        if (valor > 0 && valor <= saldo){
            this.saldo -= valor;
        }else if (valor > saldo) {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente para o saque");
        }else {
            JOptionPane.showMessageDialog(null,"saque inválido");
        }
    }
    
    public void mostrarSaldo(){
        String msg = "titular " + getTitular();
        msg += "\nSaldo: R$ " + String.format("%,.2f",this.saldo);
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
