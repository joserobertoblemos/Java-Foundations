/**
 * Faça um programa com métodos com parametros e com retorno para calcular a área
 * de três objetos geométricos.
 *
 * para Calcular a área de um triangulo utilize a formula:
 * (base * altura) / 2
 * Para calcular a àrea de um retangulo utilize a formula:
 * (base * altura)
 * Para calcular a área de um circuito utilize a formula:
 * (PI * (raio * raio)
 *
 * Crie um método para cada calculo e no método 'main' solicite ao usuário qual área
 * ele deseja calcular, depois solicite os valores, Calcule a área e informe o resultado.
 * Pode ser por JOptionPane, System ou Scanner.
 * Não esquece de instanciar os objetos. // ex exercicio 7 = new exercicio 7
 */
package aula07b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio07 {

    double PI = 3.14;

    public double calcularAreaTriangulo(double altura, double base) {
        return base * altura / 2;
    }

    public double calcularAreaRetangulo(double altura, double base) {
        return base * altura;
    }

    public double calcularAreaCirculo(double raio) {
        return PI * (raio * raio);
    }

    public static void main(String args[]) {
        Object[] opcoes = {"Calcular a área de um triangulo ", "Calcular a área de um retangulo", "Calcular a área de um circuito"};
        int resposta = JOptionPane.showOptionDialog(null, "Selecione qual calculo deseja: ", "Calculadora de área",
                JOptionPane.YES_NO_CANCEL_OPTION, 3, null, opcoes, opcoes[0]);
        String baseStr = "";
        String alturaStr = "";

        double base = 0;
        double altura = 0;
        double raio = 0;
        double resultado = 0;
        Exercicio07 msg = new Exercicio07();
        switch (resposta) {
            case 0:
                baseStr = JOptionPane.showInputDialog("Digite a base: ");
                alturaStr = JOptionPane.showInputDialog("Digite a altura: ");
                base = Double.parseDouble(baseStr);
                altura = Double.parseDouble(alturaStr);
                resultado = msg.calcularAreaTriangulo(altura, base);
                break;
            case 1:
                baseStr = JOptionPane.showInputDialog("Digite a base: ");
                alturaStr = JOptionPane.showInputDialog("Digite a altura: ");
                base = Double.parseDouble(baseStr);
                altura = Double.parseDouble(alturaStr);
                resultado = msg.calcularAreaRetangulo(altura, base);
                break;
            case 2:
                String raioStr = JOptionPane.showInputDialog("Digite o valor do raio: ");
                raio = Double.parseDouble(raioStr);
                resultado = msg.calcularAreaCirculo(raio * raio);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você fechou a janela sem escolher uma opção. ");
        }
        JOptionPane.showMessageDialog(null, "O resultado esperado é " + resultado + "cm");
    }

}
