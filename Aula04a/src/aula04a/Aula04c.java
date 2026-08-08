/**
 *  Nesse Programa vamos estudar a estrutura de controle switch...case encadeada 
 */
package aula04a;
import javax.swing.JOptionPane;

public class Aula04c {
    public static void main (String args[]) {
     
        int feriado = JOptionPane.showConfirmDialog(null,"Hoje é feriado? ", "Calendário",JOptionPane.YES_NO_OPTION,3);
        boolean isFeriado;
        if (feriado == JOptionPane.YES_OPTION) {
             isFeriado = true;
        }else{
             isFeriado = false;
        }
        
        switch (feriado){
                case 0:
                    JOptionPane.showMessageDialog(null, "Hoje não trabalhamos ", "Calendário", 1);
        break;
                case 1:
                    String diaSemana = JOptionPane.showInputDialog(null,"Digite o numero do dia da semana:", "Calendário", 3 );
                    switch (diaSemana) {
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":    
                            JOptionPane.showMessageDialog( null, "Hoje é " + diaSemana + " feira. " + "Dia de trabalho normal.", "Calendário", 1);
                            break;
                            case "7":
                            JOptionPane.showMessageDialog( null, "Hoje é sábado, Dia de trabalho 1/2 periodo.", "Calendário", 1);
                            break;
                            case "1":
                            JOptionPane.showMessageDialog( null, "Hoje é domingo, Dia de Descanso.", "Calendário", 1);
                            default:
                            JOptionPane.showMessageDialog( null, "Dia digitado inválido.", "Calendário", 1);
                                
                    }
        break;
                default: 
                JOptionPane.showMessageDialog( null, "Voce fechou a caixa sem escolher sim ou não ", "Calendário", 1);
        }
        
    }
    
}
