/**
 * Nesse programa Vamos criar um formulario de login do usuário
 */
package aula10a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Aula10a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label labelUsuario = new Label("Nome do Usuário");
        TextField textFieldUsuario = new TextField();
        
        Label labelSenha = new Label("Senha");
        PasswordField passwordFieldSenha = new PasswordField();
        
        //Botões
        Button btnLogin = new Button("Login");
        Button btnLimpar = new Button("Limpar");
        
        //Evento do botão login
        btnLogin.setOnAction(e -> {
                System.out.println("Usuário: " + textFieldUsuario.getText());
                System.out.println("Senha: " + passwordFieldSenha.getText());
            });
        
            //Evento do botão limpar
            btnLimpar.setOnAction(e -> {
                textFieldUsuario.clear();
                passwordFieldSenha.clear();
            });
            
            // Painel principal usando Grid layout
            GridPane painel = new GridPane();
            painel.setPadding(new Insets(20));
            painel.setHgap(10);
            painel.setVgap(10);
            
            painel.add(labelUsuario, 0, 0);
            painel.add(textFieldUsuario, 1, 0);
            
            painel.add(labelSenha, 0, 1);
            painel.add(passwordFieldSenha, 1, 1);
            
            // painel de botões
            HBox botoes = new HBox(10);
            botoes.setAlignment(Pos.CENTER);
            botoes.getChildren().addAll(btnLogin,btnLimpar);
            
            painel.add(botoes, 1, 2);
            
            
        //StackPane root = new StackPane();
        
        Scene scene = new Scene(painel, 350, 170);
        
        primaryStage.setTitle("Login do Usuário");
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
