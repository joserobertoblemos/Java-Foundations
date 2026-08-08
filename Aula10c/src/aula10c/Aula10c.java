/**
 * nesse programa vamos criar um menu que vai chamar outra janela
 */
package aula10c;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Aula10c extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane painel = new BorderPane();
        
        //Barra de menu
        MenuBar barraMenu = new MenuBar();
        
        //Menu Alunos, Cursos e Professores
        Menu menuAlunos = new Menu("Alunos");
        Menu menuCursos = new Menu("Cursos");
        Menu menuProfessores = new Menu("Professores");
        
        //Item do menu alunos
        MenuItem itemCadastrarAluno = new MenuItem("Cadastrar");
        MenuItem itemAlterarAluno = new MenuItem("Alterar");
        MenuItem itemExcluirAluno = new MenuItem("Excluir");
        MenuItem itemConsultarAluno = new MenuItem("Consultar");
        
        //Item do menu cursos
        MenuItem itemCadastrarCurso = new MenuItem("Cadastrar");
        MenuItem itemAlterarCurso = new MenuItem("Alterar");
        MenuItem itemExcluirCurso = new MenuItem("Excluir");
        MenuItem itemConsultarCurso = new MenuItem("Consultar");
        
        // Adicionando submenu dos alunos
        menuAlunos.getItems().add(itemCadastrarAluno);
        menuAlunos.getItems().add(itemAlterarAluno);
        menuAlunos.getItems().add(itemExcluirAluno);
        menuAlunos.getItems().add(itemConsultarAluno);
        
        // Adicionando submenu dos cursos
        menuCursos.getItems().add(itemCadastrarCurso);
        menuCursos.getItems().add(itemAlterarCurso);
        menuCursos.getItems().add(itemExcluirCurso);
        menuCursos.getItems().add(itemConsultarCurso);
        
        barraMenu.getMenus().add(menuAlunos);
        barraMenu.getMenus().add(menuCursos);
        barraMenu.getMenus().add(menuProfessores);
        
        painel.setTop(barraMenu);
        
        //Evento do menu
        itemCadastrarAluno.setOnAction(e -> {
           
            CadastroAluno cadastroAluno = new CadastroAluno();
            cadastroAluno.mostrar(primaryStage);
        });
        
        Scene scene = new Scene(painel, 600, 400);
        
        primaryStage.setTitle("Sistema de Escola");
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
