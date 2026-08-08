/**
 * 
 */
package aula07b;


public class Aula07b7 {
    
    private int proximoID = 1;
    
    public static final String NOME_APLICATIVO = "MyApp";
    public static final String VERSAO_APLICATIVO = "1.0.2 beta";
    
    
    public int gerarNovoID(){
        return proximoID++;
    }
    
    public static void main(String args[]){
        Aula07b7 g1 = new Aula07b7();
        Aula07b7 g2 = new Aula07b7();
        
        System.out.println(g1.gerarNovoID());
        System.out.println(g2.gerarNovoID());
        System.out.println(g1.gerarNovoID());
        
        System.out.println("Nome do aplicativo: " + NOME_APLICATIVO);
        System.out.println("Versão do aplicativo: " + VERSAO_APLICATIVO);
    }
}
