/**
 * 
 */
package aula05c;

public class Aula05c {

    public static void main(String[] args) {
        
        String[] alunos = new String[5];
        alunos[0] = "gaspar";
        alunos[1] = "annabela";
        alunos[2] = "luiza";
        alunos[3] = "Jorge";
        alunos[4] = "Bruce";

        int idades[] = {23, 16, 28, 32, 12};
        
        double[] alturas = {
          1.70,  
          1.45,  
          1.56,
          1.78,
          1.90  
        };
        
        for (int i = 0; i<alunos.length; i++){
            System.out.println("nome: " + alunos[i]);
            System.out.println(" - Idade: " + idades[i]);
            System.out.println(" - Alturas: " + alturas[i]);
        }
        System.out.println("Fim da lista");
        
    }
    
}
