/**
 * Nessa classe vamos implementar os objetos das classes modelos
 */
package aula08a;

public class Aula08a {

    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro();
        Cachorro cao2 = new Cachorro();
        
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        
        gato1.nome = "Gaspar";
        gato1.raca = "Rajado";
        gato1.idade = 10;
        
        gato2.nome = "Galego";
        gato2.raca = "Laranja";
        gato2.idade = 7;
        
        gato1.miar();
        gato2.beberLeite();
        
        System.out.println("=".repeat(40));
        gato1.imprimir();
        System.out.println("=".repeat(40));
        gato2.imprimir();
        System.out.println("=".repeat(40));
        
        cao1.nome = "Lobo";
        cao1.raca = "Pastor Alemao";
        cao1.idade = 6;
        
        cao2.nome = "Bruce";
        cao2.raca = "Labrador";
        cao2.idade = 2;
        
        cao1.latir();
        
        cao2.correr();
        
        cao1.imprimir();
        System.out.println("=".repeat(40));
        cao2.imprimir();
    }
    
}
