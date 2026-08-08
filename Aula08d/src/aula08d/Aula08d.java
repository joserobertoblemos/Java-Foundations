/**
 * Herança ele vai ter seus atributos e funções da classe mãe mas tbm vai ter os seus
 * vamos instanciar os objetos das classes animal, mamifero e ave
 */ 
package aula08d;


public class Aula08d {

    public static void main(String[] args) {
        
         Animal leao = new Animal("Simba", 20);
         leao.exibirDados();
         leao.emitirSom("ROOOARRR!!!!");
         
         System.out.println("=".repeat(40));
         
         Mamifero cao = new Mamifero("Bruce", 2, "Longo");
         cao.exibirDados();
         cao.amamentar();
         cao.emitirSom("Au AU AU!");
                 
         System.out.println("=".repeat(40));
         
         Ave papagaio = new Ave("Batman", 50 , "curco");
         
         papagaio.exibirDados();
         papagaio.voar();
         papagaio.emitirSom("Loro quer cafe");
         
         
         
    }
    
}
