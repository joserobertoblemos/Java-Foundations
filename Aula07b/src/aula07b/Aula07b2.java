/**
 * Nesse programa vamos estudar os métodos (funções) 
 * com parametros / argumentos e sem retorno
 */
package aula07b;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Aula07b2 {
    
    public void mostrarMensagem(String nome){
        System.out.println("*** Mensagem do Sistema ***");
        System.out.println("Seja bem vindo " + nome);
        System.out.println("-".repeat(40));
    }
    
    public static void main(String args[]){
        Aula07b2 msg = new Aula07b2();
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();
        msg.mostrarMensagem(nomeUsuario);
        
        msg.registrarLog(1, "Usuario " + nomeUsuario + " logou com sucesso");
        msg.registrarLog(0, "Falha ao conectar com o banco de dados");
        msg.registrarLog(2, "Espaco em disco abaixo de 20%");
        msg.registrarLog(99, "Erro desconhecido");
        
        Aula07b sair = new Aula07b();
        sair.prepararParaEncerrar();
    }
        
    public void registrarLog(int tipo, String descricao) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String tipoLog = "";
        if (tipo == 0){
            tipoLog = "ERRO";
        } else if (tipo == 1) {
            tipoLog = "INFO";
        } else if (tipo == 2) {
            tipoLog = "ALERTA";
        }else {
            tipoLog = "INEXISTENTE";
        }
        String dataHoraFormatada = agora.format(formatoData);
        System.out.println(dataHoraFormatada + " [" + tipoLog + "] " + descricao);
    }
}
