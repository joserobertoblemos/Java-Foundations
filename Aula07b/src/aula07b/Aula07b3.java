/**
 * Nesse programa vamos estudar os métodos (funções)
 * sem parametros/argumentos e com retorno
 */
package aula07b;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Aula07b3 {
    
    public int gerarNumeroAleatorio() {
        Random rd = new Random();
        int numero = rd.nextInt(100) + 1;
        return numero;
    }
    
    public static void main(String args[]){
        Aula07b3 gerador = new Aula07b3();
        Scanner sc = new Scanner (System.in);
        System.out.print("Quantos numeros aleatorios deseja gerar? : ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++){
            System.out.println(gerador.gerarNumeroAleatorio() + " ");
        }
        System.out.println();
        System.out.println("Hora atual: " + gerador.gerarhoraAtual());
    }
    
    public String gerarhoraAtual(){
        LocalTime agora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = agora.format(formato);
        return horaFormatada;
    }
}
