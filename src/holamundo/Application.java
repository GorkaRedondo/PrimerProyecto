/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 * Aplicacion hola mundo por capas
 * @author GorkaRedondo
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Controller controller = new Controller();
        controller.run(ViewFactory.getView(),ModelFactory.getModel());
        
    }
    
}
