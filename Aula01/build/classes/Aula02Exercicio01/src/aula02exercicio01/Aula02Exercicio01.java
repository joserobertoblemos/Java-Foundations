/**
 * Faça um programa para calcular a media das notas de um aluno.
 * O nome do aluno é Jorge Blue. Ele tem 15 anos e realizou 4 provas 
 * e 3 trabalhos. Calcule a média somando as notas das provas e dos 
 * trabalhos e dividindo por 7.
 * Imprima os dados do aluno conforme modelo abaixo:
 * O aluno (nome) tem (idade) anos.
 * Sua média no ano foi de (media). (Obs, a média deve ter apenas 1 casa decimal)
 * Notas: 6.3, 4.2, 9.5, 3.7, 9.9, 8.7, 6.8
 * Crie uma variavel para cada nota.
 */
package aula02exercicio01;

public class Aula02Exercicio01 {

    
    public static void main(String[] args) {
        // Dados do Aluno
        String aluno = "Jorge Blue";
        byte idade = 15;
        int provas = 4;
        int trabalhos = 3;
        double prova1 = 6.3;
        double prova2 = 4.2;
        double prova3 = 9.5;
        double prova4 = 3.7;
        double trabalho1 = 9.9;
        double trabalho2 = 8.7;
        double trabalho3 = 6.8;
        double soma1 = prova1 + prova2 + prova3 + prova4 + trabalho1 + trabalho2 + trabalho3;
        double media = soma1/7;
        String strMedia = String.format("%.1f",media);
        
        System.out.println("Nome do aluno: " + aluno);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("=".repeat(50));
        System.out.println("Sua media no ano foi de " + strMedia);
        
        
        
        
        
        
    }
    
}
