/**
 * Nesse programa vamos estudar o uso de array bi-dimencional 
 */
package aula05c;

/**
 *
 * @author Aluno
 */
public class Aula05c4 {
    public static void main (String args[]){
        
        String[][] turmasAlunos = {     //Array com 6 linhas e 2 colunas 
            
              //0      //1
            {"Java", "gaspar"}, //o
            {"Excel", "luiza"}, //1
            {"Power BI", "jorge"}, //2
            {"C++", "gaspar"}, //3
            {"HTML", "bruce"}, //4
            {"JavaSCript", "anabela"} //5
        };
        String msg = "";
        for (int i = 0; i < turmasAlunos.length; i++){ //cada vez q pecorrer esse for ele vai executar linha e coluna
            for (int j = 0; j < turmasAlunos[i].length; j++){ // ele vai pegar dentro da linha
                if (j == 0) {
                    msg += " Turma : " + turmasAlunos[i][j];
                } else {
                    msg += " Aluno : " + turmasAlunos [i][j];
                }
            }
            System.out.println(msg);
            System.out.println("-".repeat(40));
            msg = "";
        }
    }
}
