/**
 * faça um Programa que recebe os tres lados de um triangulo e identifica qual o tipo
 * de trinangulo de acordo com as regras abaixo:
 * 
 * Triangulo Equilatero: Possui 3 lados iguais 
 * Triangulo Isóseles: Possui 2 lados iguais
 * Triangulo escaleno: possui 3 lados diferentes
 * 
 * importante: Verifique se a soma de dois lados não é menor que 
 * o terceiro lado, nesse caso não é posivel formar um triangulo
 * Utilize o JOptionPane para receber os lados e para mostrar o tipo de triangulo.
*/
package aula03c;

import javax.swing.JOptionPane;

public class Aula03cexercicio {
    public static void main (String args[]) {
        
        String tit = "Calcular um triangulo";
        String strLadoA = JOptionPane.showInputDialog(null,"Digitite a medida do lado A: ", tit, 3);
        String strLadoB = JOptionPane.showInputDialog(null,"Digite a medida do lado B: ", tit, 3);
        String strLadoC = JOptionPane.showInputDialog(null,"Digite a medida do lado C: ", tit, 3);
      
        double LadoA = Double.parseDouble(strLadoA);
        double LadoB = Double.parseDouble(strLadoB);
        double LadoC = Double.parseDouble(strLadoC);
       
        
        if (LadoA == LadoB && LadoA == LadoC && LadoB == LadoC){
            JOptionPane.showMessageDialog(null,"Equilátero", tit,3);
            
        } else if (LadoA == LadoB || LadoA == LadoC || LadoA == LadoC) {
            JOptionPane.showMessageDialog(null, "Isóceles");
        } else {
            JOptionPane.showMessageDialog(null, "Escaleno");
            
    } 
            
     
                
    }
    
    
}
