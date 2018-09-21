/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFxViewImplementation extends Application implements View {
    
    private static String greeting;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        
        // getSource -> Carga el archivo fxml donde esta cargada mi vista
        Parent root = loader.load();
        
        FXMLDocumentController control = loader.getController();
        control.setGreeting(greeting);
        
        // Creamos la Scene
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public void showGreeting(String greeting) {
        
        JavaFxViewImplementation.greeting = greeting;
        launch();
    }
    
    /*public void init() throws Exception {
        
        List<String> lista = getParameters().getRaw();
        String greeting = lista.get(0);
        
        this.greeting = greeting;
    }*/
    
    public void setGreeting(String greeting) {
        
        this.greeting = greeting;
        
    }
}
