/**
 * Essa classe será a classe genérica do projeto ou seja, a superclasse ou (classe mãe)
 */
package aula08d;


public class Animal {
    
    String nome;
    int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void emitirSom(String som){
        System.out.println(som);
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        
    }
}
