/**
 * Nesse Programa vamos estudar o uso de array list
 */
package aula06a;
import java.util.ArrayList;
public class Aula06a {
    public static void main(String[] args) {
        
        ArrayList<String> frutas = new ArrayList<String>();
        
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Laranja");
        
        System.out.println("Frutas que eu gosto" + frutas);
        
        System.out.println("A fruta que mais gosto e " + 
                frutas.get(1));
        
        // para adicionar um item novo
        
        frutas.add(1, "Melao");
        
        System.out.println("Frutas que eu gosto" + frutas);
        
        for (int i = 0; i < frutas.size(); i++){
            if (i < frutas.size() - 1){                      // para tirar a laranja da lista e imprimir com ponto a partidar dela
                System.out.print(frutas.get(i)+ ", ");
            }else{
                System.out.print(frutas.get(i)+ ". ");
            }
        }
        System.out.println();
        
        frutas.add("Melancia");
        
        System.out.println(frutas);
        frutas.set(0, "Abacaxi");           // para substituir 
        
        System.out.println("Frutas alteradas: " + frutas);
        
        int posicao = frutas.indexOf("Banana"); // caso eu não saiba a posição ele vai capturar a posição e jogar numa posição
        
        System.out.println("A banana esta na posicao: " + posicao);
        
        frutas.set(posicao, "Ameixa");
        
        System.out.println("Frutas sem a banana: " + frutas);
        
        frutas.remove(4); // Para remover um item da lista
        
        System.out.println("Frutas sem Laranja " + frutas);
        
        frutas.remove("Ameixa");
        
        System.out.println("Frutas sem Ameixa " + frutas);
        
        if (frutas.contains("Melancia")) {    //System.out.println(frutas.contains("Melancia")); vai responder com true ou false // verificar se contem na lista
            System.out.println("A Lista possue Melancia");
        } else {
            System.out.println("A fruta não possui Melancia");
        }                   
        
        
        frutas.clear();
        System.out.println("Frutas: " + frutas);
    }
    
}
