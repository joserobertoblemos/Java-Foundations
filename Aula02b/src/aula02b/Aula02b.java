/*
 * Nesse programa vamos explorar os metodos da classe String
*/
package aula02b;

/**
 *
 * @author Aluno
 */
public class Aula02b {

    public static void main(String[] args) {
        String nome = "Jose Roberto Benevenuto Lemos";
        String frase = "     O Java e PODEROSO ! ! !     ";
        String traco = "=";
        String curso = "JAVA";
        String vazia = "     ";
        
        
        
        //Conversão de caixa (Maiusculas e Minusculas)
        System.out.println(traco.repeat(50));
        System.out.println("Nome Maiusculo: " + nome.toUpperCase());
        System.out.println("Nome Minusculo: " + nome.toLowerCase());
        
       // Removendo espaços em branco
       System.out.println(traco.repeat(50));
       System.out.println("Frase sem espacos anteriores e posteriores: " + frase.trim());
       System.out.println("Frase sem espacos (metodo strip(): " + frase.strip());
       
       // verificando e comparando
       System.out.println("O curso e Java? " + curso.equals("JAVA"));
       System.out.println("O curso e Java mesmo? " + curso.equalsIgnoreCase ("Java"));
       System.out.println("O curso contem 'JA': " + curso.contains("JA"));
       System.out.println("A variavel esta vazia " + vazia.trim().isEmpty());
       System.out.println("A variavel esta vazia (isBlank())" + vazia.isBlank());
       
       //Busca, substituicao e divisao
       System.out.println(traco.repeat(50));
       System.out.println("Numero de caracteres de 'nome'; " + nome.length());
       System.out.println("Numero de caracteres de 'frase': " + frase.length());
       System.out.println("Numero de caracteres de 'frase' " + "sem espacos em branco: " + frase.trim().length());
       
       System.out.println("Letra na posicao 7 do nome: " + nome.charAt(7));
       System.out.println("posicao do 'Ro' no nome: " + nome.indexOf("Ro") );
       int posicao = nome.indexOf ("Benevenuto Lemos");
       String sobrenome= nome.substring(13);
       System.out.println("sobrenome: " + sobrenome);
       String nomeMeio = nome.substring(5, 13);
       System.out.println("Nome do meio: " + nomeMeio);
       String nomeCorreto = nome.replace("Benevenuto", "Bene");
       System.out.println("nome correto: " + nomeCorreto);
       String premio = "123,456,789.99";
       String xPremio = premio.replace(",", "X");
       System.out.println("xPremio: " + xPremio);
       String vPremio = xPremio.replace(".",",");
       System.out.println("vPremio: " + vPremio);
       String zPremio = vPremio.replace("X", ".");
       System.out.println("zPremio: " + zPremio);
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
