/**
 * 
 */
package aula08a;

public class Gato {
    String nome;
    String raca;
    int idade;
    
    public void miar(){
        System.out.println(nome + " Esta miando!");
        System.out.println("MIUA! MIAUUA");
    }
    
    public void beberLeite(){
        System.out.println(nome + "Esta bebendo leite");
    }
    
    public void imprimir(){
        System.out.println("nome do gato: " + nome);
        System.out.println("Raca do gato: " + raca);
        System.out.println("Idade do gato: " + idade);
    }
}
