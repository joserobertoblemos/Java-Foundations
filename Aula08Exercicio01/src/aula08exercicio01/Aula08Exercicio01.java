/**
 * Exercício – Construtores e Sobrecarga de Construtores
Você foi contratado(a) pela CyberCore Dynamics para desenvolver um pequeno módulo 
*de cadastro de computadores utilizados pelos colaboradores da empresa.
Alguns computadores já possuem todas as informações cadastradas, enquanto outros 
*ainda não possuem a quantidade de memória RAM informada. Para facilitar a criação 
* dos objetos, seu gerente solicitou a utilização de sobrecarga de construtores.

Requisitos
Crie uma classe chamada Computador contendo os seguintes atributos:
marca
modelo
memoriaRAM (em GB)
A classe deverá possuir:
* 
Construtor 1
Recebe:
marca
modelo
memoriaRAM
* 
Construtor 2 (Sobrecarga)
Recebe apenas:
marca
modelo
Quando este construtor for utilizado, a memória RAM deverá receber automaticamente o valor 8 GB.
* 
Método
Crie um método chamado:
mostrarInformacoes()
Esse método deverá exibir todos os atributos do computador usando o JOptionPane.
* 
Programa Principal
Na classe Principal, faça o seguinte:

Computador 1

Utilize o construtor completo para criar:

Marca: Dell
Modelo: Inspiron
Memória RAM: 16 GB
Computador 2
Utilize o construtor com sobrecarga para criar:
Marca: Lenovo
Modelo: IdeaPad
* 
(Neste caso, a memória RAM deverá assumir automaticamente 8 GB.)
Em seguida, exiba as informações dos dois computadores utilizando o método mostrarInformacoes().
 */
package aula08exercicio01;

public class Aula08Exercicio01 {

    public static void main(String[] args) {
        
        Computador pc1 = new Computador("Dell","Inspirion", 16);
        Computador pc2 = new Computador("Lenovo","IdeaPad");
        
        pc1.mostrarInformacoes();
        pc2.mostrarInformacoes();
        
        
    }
    
}
