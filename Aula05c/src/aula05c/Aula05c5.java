/**
 * Nesse Programa vamos estudar o uso de array bi-dimencional
 */
package aula05c;


public class Aula05c5 {
    public static void main (String args[]){
        
        int [][] numeros = new int [3][4];
        
        numeros[0][0] = 5;
        numeros[0][1] = 10;
        numeros[0][2] = 15;
        numeros[0][3] = 20;
        
        numeros[1][0] = 3;
        numeros[1][1] = 9;
        numeros[1][2] = 18;
        numeros[1][3] = 21;
        
        numeros[2][0] = 2;
        numeros[2][1] = 4;
        numeros[2][2] = 6;
        numeros[2][3] = 8;
        
       System.out.println("-".repeat(20));
       for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " "); //System.out.print(String.format("%4d", numeros[i][j] + " | "); para deixar a tabela mais formatadinha
            }
            System.out.println();
            System.out.println("-".repeat(20));
        }
    }
    
}
