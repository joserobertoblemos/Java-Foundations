/**
 *  Faça um programa que recebe a data de nascimento de uma pessoa no formato dd/mm/aaaa. 
 *  Essa data deve ser informada usando o JOptionPane.
 *  Usando uma estrutura switch...case verifique o mes de nascimento do usuário
 * e exiba a data no formato extenso (ex: 20 de junho de 2026). Use o 
 * JOptionPane para exibir a data por extenso.
 */
package aula04a;
import javax.swing.JOptionPane;


public class Aula04aExercicio1 {
public static void main (String args[]){
    
    String tit = "Data de nascimento";
    String data = JOptionPane.showInputDialog(null, "Informe sua data de nascimento (dd/mm/aaaa): ", tit, 3);
   
   //System.out.println("Segundo nome do texto: " + texto.substring(6)); 
   String dia = data.substring(0,2);
   String mes = data.substring(3,5);
   String ano = data.substring(6,10);
   
   //poderia ter feito outra variavel String mesExtenso;
   
    switch (mes) {
        case "01":
            JOptionPane.showMessageDialog(null, dia + " de janeiro de " + ano, tit, 3);
            break;
        case "02":
            JOptionPane.showMessageDialog(null, dia + " de favereiro de " + ano, tit, 3);
            break;
        case "03":
            JOptionPane.showMessageDialog(null, dia + " de março de " + ano, tit, 3);
            break;
        case "04":
            JOptionPane.showMessageDialog(null, dia + " de abril  de " + ano, tit, 3);
            break;
        case "05":
            JOptionPane.showMessageDialog(null, dia + " de maio de " + ano, tit, 3);
            break;
        case "06":
            JOptionPane.showMessageDialog(null, dia + " de junho de " + ano, tit, 3);
            break;
        case "07":
            JOptionPane.showMessageDialog(null, dia + " de julho de " + ano, tit, 3);
            break;
        case "08":
            JOptionPane.showMessageDialog(null, dia + " de agosto de " + ano, tit, 3);
            break;
        case "09": 
            JOptionPane.showMessageDialog(null, dia + " de setembro de " + ano, tit, 3);
            break;
        case "10":
            JOptionPane.showMessageDialog(null, dia + " de outubro de " + ano, tit, 3);
            break;
        case "11":
            JOptionPane.showMessageDialog(null, dia + " de novembro de " + ano, tit, 3);
            break;
        case "12": 
            JOptionPane.showMessageDialog(null, dia + " de dezembro de " + ano, tit, 3);
            break;
        default: 
            JOptionPane.showMessageDialog(null,"Data digitada inválida ",tit,1);
    }
    
    
    
}    
}
