/**
 * Nesse programa vamos criar um formulario com caixa de texto e botões de radio
 */
package aula10b;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Aula10b extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label labelNome = new Label("Nome");
        TextField textFieldNome = new TextField();
        
        Label labelGenero = new Label ("Gênero");
        
        // Grupo para o Gênero
        ToggleGroup grupoGenero = new ToggleGroup();
        RadioButton rbMasculino = new RadioButton("Masculino");
        RadioButton rbFeminino = new RadioButton("Feminino");
        
        rbMasculino.setToggleGroup(grupoGenero);
        rbFeminino.setToggleGroup(grupoGenero);
        
        rbMasculino.setSelected(true);
        
        HBox hboxGenero = new HBox(10, rbMasculino, rbFeminino);
        
        
        Label labelPeriodo = new Label("periodo");
        // Grupo para o periodo
        ToggleGroup grupoPeriodo = new ToggleGroup();
        RadioButton rbManha = new RadioButton("Manhã");
        RadioButton rbTarde = new RadioButton("Tarde");
        RadioButton rbNoite = new RadioButton("Noite");
        RadioButton rbSabado = new RadioButton("Sábado");
        
        rbManha.setToggleGroup(grupoPeriodo);
        rbTarde.setToggleGroup(grupoPeriodo);
        rbNoite.setToggleGroup(grupoPeriodo);
        rbSabado.setToggleGroup(grupoPeriodo);
        
        rbManha.setSelected(true);
        
        //botões
        Button btnSalvar = new Button("Salvar");
        Button btnLimpar = new Button("Limpar");
        Button btnFechar = new Button("Fechar");
        
        HBox hboxBotoes = new HBox(10, btnSalvar, btnLimpar, btnFechar);
        
        // Layout, principal
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
                labelNome,
                textFieldNome,
                labelGenero,
                hboxGenero,
                labelPeriodo,
                rbManha,
                rbTarde,
                rbNoite,
                rbSabado,
                hboxBotoes
        );
        
        // Logica dos botões
        btnSalvar.setOnAction(e -> {
            //Captura dos dados
            String nome = textFieldNome.getText();
            RadioButton botaoSelecionado = (RadioButton) grupoGenero.getSelectedToggle();
            String genero = botaoSelecionado.getText();
            
            botaoSelecionado = (RadioButton) grupoPeriodo.getSelectedToggle();
            String periodo = botaoSelecionado.getText();
            
            String dados = "Nome: " + nome;
            dados += "\nGênero: " + genero;
            dados += "\nPeriodo: " + periodo;
            
            //Criação dos botões
            ButtonType btnSim = new ButtonType("Sim", ButtonBar.ButtonData.YES);
            ButtonType btnNao = new ButtonType("Não", ButtonBar.ButtonData.NO);
            
            //Configurando a caixa de alerta
            Alert confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
            confirmacao.setTitle("Confirmar salvamento");
            confirmacao.setHeaderText("Deseja realmente salvar os dados?");
            confirmacao.setContentText(dados);
            
            //Substituir os botões padrão
            confirmacao.getButtonTypes().setAll(btnSim, btnNao);
            
            //Exibição e Captura da resposta 
            Optional<ButtonType> resultado = confirmacao.showAndWait();
            
            //lógica baseada no botão clicado
            
            if (resultado.isPresent() && resultado.get() == btnSim){
                System.out.println("--- Salvando dados ---");
                System.out.println("Genero: " + genero);
                System.out.println("Nome: " + nome);
                System.out.println("Periodo: " + periodo);
            } else {
                System.out.println("Operação cancelada pelo usuário");
            }
            
        });
                
                
        btnLimpar.setOnAction(r -> {
            textFieldNome.clear();
            rbMasculino.setSelected(true);
            rbManha.setSelected(true);
            
        });
        
        btnFechar.setOnAction(e -> primaryStage.close());
            
            Scene scene = new Scene (root, 350, 350);
        
        
        
        primaryStage.setTitle("Cadastro de Aluno");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
