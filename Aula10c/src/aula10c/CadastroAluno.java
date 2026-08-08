/**
 * 
 */
package aula10c;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CadastroAluno {
    
    private TextField txtNome;
    private TextField txtCurso;
    private ChoiceBox<String> cbPeriodo; // caixa com opções
    private DatePicker dpNascimento;//Calendario
    private RadioButton rbFeminino;
    private RadioButton rbMasculino;
    private CheckBox chkRG;
    private CheckBox chkCPF;
    private CheckBox chkComprovante;
    private CheckBox chkHistorico;
            
            
    
    public void mostrar(Stage dono) {
        
        Stage primaryStage = new Stage();
        
        // Configurando o Layout
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #F0F8FF;");
        
        //Criação do layout em grade (Grid Layout)
        
        GridPane grade = new GridPane();
        grade.setVgap(10);
        grade.setHgap(10);
        
        // Campos de entrada de dados
        txtNome = new TextField();
        txtNome.setPrefWidth(250); // Define a largura do campo
        grade.add(new Label("Nome:"), 0, 0);
        grade.add(txtNome, 1, 0);
        
        txtCurso = new TextField();
        txtCurso.setPrefWidth(150);
        grade.add(new Label("Curso:"), 0, 1);
        grade.add(txtCurso, 1, 1);
        
        //Periodo com ChoiceBox
        cbPeriodo = new ChoiceBox();
        cbPeriodo.getItems().addAll("Manhã", "Tarde", "Noite", "Sábado");
        grade.add(new Label("Periodo"), 0, 2);
        grade.add(cbPeriodo, 1, 2);
        
        //Data de Nascimento com o Datepicker
        dpNascimento = new DatePicker();
        grade.add(new Label("Data de Nascimento:"), 0, 3);
        grade.add(dpNascimento, 1, 3);
        
        //Gênero com RadioButton
        ToggleGroup grupoSexo = new ToggleGroup();
        rbMasculino = new RadioButton("Masculino");
        rbMasculino.setToggleGroup(grupoSexo);
        rbFeminino = new RadioButton("Feminino");
        rbFeminino.setToggleGroup(grupoSexo);
        rbMasculino.setSelected(true);
        
        HBox hboxSexo = new HBox(10, rbMasculino, rbFeminino);
        grade.add(new Label("Sexo:"), 0, 4);
        grade.add(hboxSexo, 1, 4);
        
        
        //Documentos entregues com CheckBox
        chkRG = new CheckBox("RG");
        chkCPF = new CheckBox("CPF");
        chkComprovante = new CheckBox("Comprovante");
        chkHistorico = new CheckBox("Histórico");
        VBox vboxDocumentos = new VBox (5, chkRG, chkCPF, chkComprovante, chkHistorico);
        grade.add(new Label("Documentos Entregues:"), 0, 5);
        grade.add(vboxDocumentos, 1, 5);
        
        // Botões
        Button btnSalvar = new Button ("Salvar");
        Button btnLimpar = new Button ("Limpar Formulário");
        Button btnFechar = new Button ("Fechar");
        
        HBox hboxBotoes = new HBox(10, btnSalvar, btnLimpar, btnFechar);
        
        root.getChildren().addAll(grade, hboxBotoes);
        
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Cadastro de Aluno!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
