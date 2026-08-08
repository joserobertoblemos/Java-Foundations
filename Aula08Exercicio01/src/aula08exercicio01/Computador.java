/**
 * 
 */
package aula08exercicio01;

import javax.swing.JOptionPane;


public class Computador {
   String marca;
   String modelo;
   int memoriaRam;
   
   public Computador(String marca,String modelo,int memoriaRam){
       this.marca = marca;
       this.modelo = modelo;
       this.memoriaRam = memoriaRam;
   }
   public Computador(String marca,String modelo){
       this.marca = marca;
       this.modelo = modelo;
       this.memoriaRam = 8;
   }
   public void mostrarInformacoes(){
       String msg = "Marca do Computador: " + this.marca + "\n";
       msg += "Modelo do computador: " + this.modelo + "\n";
       msg += "Mémória Ram: " + this.memoriaRam + "GB" + "\n";
       JOptionPane.showMessageDialog(null, msg);
       
   }
}
