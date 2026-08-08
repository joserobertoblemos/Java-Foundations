/**
 *  Nessa classe vamos estudar o polimorfismo por sobrecarga
 */
package aula09d;


public class Aula09d {

    public static int somar(int a, int b){
        int soma = a + b;
        return soma;
    }
    
    public static int somar(int a, int b, int c){
        int soma = a + b + c;
        return soma;
    }
    
    public static double somar(double a, double b){
        double soma = a + b;
        return soma;
    }
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        int z = 30;
        double p = 15.55;
        double q = 28.32;
        
        System.out.println("Somando dois numeros inteiros");
        System.out.println("A soma de " + x + " e " + y + " e igual a " + somar(x,y));
        
        
        System.out.println("Somando tres numeros inteiros");
        System.out.println("A soma de " + x + " , " + y + " e " + z + " e igual a " + somar(x,y, z));
        
        
        System.out.println("Somando dois numeros inteiros");
        System.out.println("A soma de " + p + " e " + q + " e igual a " + somar(p,q));
    }
    
}
