/**
 * 
 */
package aula09exercicio1;

import javax.swing.JOptionPane;


public class Aluno {
    
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Aluno(String nome, int idade, double peso, double altura){
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(!nome.isBlank()){
        this.nome = nome;
        }else{
            JOptionPane.showMessageDialog(null,"Insira um nome");
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade > 0 && idade <= 120){
        this.idade = idade;
    } else {
           JOptionPane.showMessageDialog(null,"idade invalida");
        }
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso > 0){
        this.peso = peso;    
        }else{
            JOptionPane.showMessageDialog(null, "peso invalido");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }else{
            JOptionPane.showMessageDialog(null, "altura invalida");
        }
    } 
    double imc;
    public void calcularIMC(){
        imc = peso / (altura * altura);
        
    }    
    public void mostrarDados(){
        String msg = "Nome: " + getNome();
        msg += "\nIdade: " + getIdade();
        msg += "\nPeso: " + getPeso();
        msg += "\nAltura: " + getAltura();
        msg += "\nIMC: " + String.format("%,.2f",imc);
        JOptionPane.showMessageDialog(null,msg);
    }
}
