/**
 *  Nesse programa vamos estudar as conversões possiveis de tipos de dados e operações aritmeticas
 */
package aula02c;

public class Aula02c {

    public static void main(String[] args) {
        
        //conversão de numeros inteiros
        byte byteNumero = 18;
        short shortNumero = 1000;
        int intNumero = 100000;
        long longNumero = 200_000_000_000_000L;
        
        
        short numero = byteNumero; // conversão implicita
        int numero1 = shortNumero;
        long numero3 = intNumero;
        
        //conversão de numeros de pontos flutuantes (decimais)
        
        float floatNumero = 123.456789f;
        double doubleNumero = 123.45678112345;
        
        
        double numero4 = floatNumero;
        float numero5 = (float) doubleNumero;
        int numero6 = (int) doubleNumero;
        
        System.out.println("Double original: " + doubleNumero);
        System.out.println("double convertido para float: " + numero5);
        System.out.println("Double convertido para int:" + numero6 );
        
        System.out.println("'".repeat(50));
        
        int valor1 = 10;
        int valor2 = 3;
        double valor3 = 15.5;
        double valor4 = 3.3;
        
        //Adição +
        int somal = valor1 + valor2;
        double soma2 = valor3 + valor4;
        double soma3 = valor1 + valor3;
        
        System.out.println("Soma de " + valor1 + " + " + valor2+ " = " + somal);
        System.out.println ("Soma de " + valor3 + " e " + valor4 + " e igual a " + soma2);
        System.out.println("soma de " +valor1 + " e " + valor3 + " e igual a " + soma3);
        
        //Subtração -
        
        //Multiplicação *
        //Divisão /
        
        int div1 = valor1 / valor2; 
        double div2 = valor1 / valor2;
        double div3 = valor3 / valor4;
        
        System.out.println("Divisao de " + valor1 + " por " + valor2 + " e igual a " + div1 + " - resultado inteiro");
        System.out.println("Divisao de " + valor1 + " por " + valor2 + " e igual a " + div2 + " - resultado Double");
        System.out.println("Divisao de " + valor1 + " por " + valor2 + " e igual a " + div3 + " - resultado Double");
        
        //Modulo (Resto da divisão)
        
        int resto1 = valor1 % valor2;
        double resto2 = valor3 % valor4;
        double resto3 = valor1 % valor4;       
        
        System.out.println ("=".repeat(50));
        System.out.println (" resultado de " + valor1 + " por " + valor2 + " igual a " + resto1);
        System.out.println (" resultado de " + valor3 + " por " + valor4 + " igual a " + resto2);
        System.out.println (" resultado de " + valor1 + " por " + valor4 + " igual a " + resto3);
        
        //Concatenação de Strings
        
        System.out.println("=".repeat(50));
        System.out.println(1 + 3 + " e o valor total");
        System.out.println("O total e " + 1 + 3);
        
        double salario = 8764.59;
        String mensagem = "o salario do funcionario e R$ " + salario;
        
        System.out.println("=".repeat(50));
        System.out.println(mensagem);
        
        
    }
    
}
