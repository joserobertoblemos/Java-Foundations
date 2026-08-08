/**
 * Nessa classe vamos definir os atributos e metodos, para a criação de objetos
 * do tipo Cachorro
 */
package aula08a;

public class Cachorro {
    
    // atributos
    String nome;
    String raca;
    int idade;
    
    //metodos
    public void latir(){
        System.out.println(nome + " esta latindo !!!");
        System.out.println("AU AU AU!");
    }
    public void correr(){
        System.out.println(nome + " esta correndo...");
    }
    
    public void imprimir(){
        System.out.println("nome do cachorro: " + nome);
        System.out.println("raca do cachorro: " + raca);
        System.out.println("idade do cachorro: " + idade);
    }
}
