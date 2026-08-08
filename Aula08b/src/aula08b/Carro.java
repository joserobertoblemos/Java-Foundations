/**
 * 
*/
package aula08b;

public class Carro {

    String marca;
    String modelo;
    int ano;
    
    // construtor
    public Carro(String marcaCarro,String modeloCarro,int anoCarro){
        marca = marcaCarro;
        modelo = modeloCarro;
        ano = anoCarro;
}
    public void imprimirDados(){
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        
    }
}
