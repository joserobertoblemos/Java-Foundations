/**
 *\ Média de Temperaturas
  Uma estação meteorológica precisa calcular a média de temperatura de um período. 
* Escreva um programa que solicite ao usuário a quantidade de medições que ele deseja inserir.
* 
- Utilize o laço 'for' para repetir a entrada de dados (`showInputDialog`) de acordo com a quantidade informada.
- O programa deve somar todas as temperaturas inseridas.
- Ao final, exiba a média aritmética das temperaturas no console ou via mensagem (`showMessageDialog`).
 */
package aula05b;
import javax.swing.JOptionPane;
public class Aula05bexercicio2 {
    public static void main (String args[]){
        
        String tit = "Média de Temperatura ";
        int numeroTemperaturas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas medições serão lançadas? ", tit, 3)); 
        
        double somaTemperaturas = 0;
        double media;
        for (int i = 1; i<= numeroTemperaturas; i++){
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a " + i + " ª temperatura ", tit, 3));
            somaTemperaturas += temperatura;
            
        }
        media = somaTemperaturas / numeroTemperaturas;
        JOptionPane.showMessageDialog (null, "a media de temperaturas foi de " + String.format("%.1fºg",media),tit,1);
    }
}
