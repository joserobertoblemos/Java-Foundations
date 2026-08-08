/**
 * Essa classe é uma subclasse que herda os atributos e métodos da superclasse Animal
 */
package aula08d;

// na declaração da classe para herdar preciso por extends Animal
public class Mamifero extends Animal{
    
    String tipoPelo;
    
    public Mamifero(String nome,int idade, String tipoPelo){
        super(nome,idade);      // tem que pegar essa parte do construtuor e pegar la na Superclasse
        this.tipoPelo = tipoPelo;
    }
    
    public void amamentar(){
        System.out.println(nome + " esta amamentando");
    }
}

