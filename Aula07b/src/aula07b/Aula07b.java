/*
 *  Nesse Programa vamos estudar o uso de métodos (funções) 
 *  sem parametros / argumentos e sem retorno 
 */
package aula07b;

import java.util.Scanner;

public class Aula07b {
    
    public void exibirBoasVindas(){
   
    
        System.out.println("-".repeat(40));
        System.out.println("***** Bem vindo ao sistema Senai *****");
        System.out.println("-".repeat(40));
    }
    
    public static void main(String[] args) {
        Aula07b msg = new Aula07b();
        msg.exibirBoasVindas();
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double somaNotas = 0;
        int i = 0;
        while (true){
            System.out.println("Digite a nota do aluno ou -1 para encerrar: ");
            double nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            i++;
            somaNotas += nota;
        }
         media = somaNotas / i;
         System.out.println("A media do aluno foi: " + media);
         Aula07b sair = new Aula07b();
         sair.prepararParaEncerrar();
         
    }
    
    public void prepararParaEncerrar(){
        System.out.println("=".repeat(40));
        System.out.println("Iniciando processo de desligamento...");
        System.out.println("salvando dados pendentes...");
        // supondo que aqui haveria a lógica para salvar o arquivo
        System.out.println("Fechando conexoes de rede...");
        // supondo que aqui haveria a lógica para fechar as conexões
        System.out.println("Aplicativo pronto para ser encerrado.");
        System.out.println("=".repeat(40));
    }
    
}
