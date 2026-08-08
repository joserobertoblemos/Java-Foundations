/**
 *  Nesse programa vamos explorar os tipos primitivos do Java 
 */
package aula02a; // pacote java

public class Aula02a {

    public static void main(String[] args) {
        // Tipos Primitivos inteiros
        byte idade = 18; 
        short ano = 2026;
        int populacaoDaCidade = 1_500_000;
        long distanciaEstrelas = 9_460_000_000_000L;
        
        
        // tipos primitivos de ponto flutuante (decimais)
        float precoGasolina = 6.49f;
        double pi = 3.14159265359;
        double salario;
        salario = 5000.00;
        
        //tipo primitivo de dados caractere
        char nota = 'A';
        
        //Tipo primitivo de dado booleano
        boolean ehAluno = true;
        boolean ehFumante = false;
        
        // Tipo de objeto para texto
        
        String nomeCompleto = "Jose Roberto Benevenuto Lemos";
        
        //exibindo as variaveis no console 
        System.out.println("=".repeat(50));
        System.out.println("Idade:" + idade);
        System.out.println("Populacao de Guaruhos: " + populacaoDaCidade);
        System.out.println("Distancia das estrelas: " + distanciaEstrelas + "km.");
        System.out.println("Preco da Gasolina: R$ " + precoGasolina);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Numero PI: " + pi);
        System.out.println("Nota do aluno: " + nota);
        System.out.println("E aluno ? " + (ehAluno ? "Sim" : "Nao"));
        System.out.println("E fumante?" + (ehFumante? "Sim" : "Nao"));
        System.out.println("Nome completo:" + nomeCompleto);
        
        
    }
    
}
