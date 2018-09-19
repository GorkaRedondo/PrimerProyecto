/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class for the Swing implementation of the HelloWorldWithTiers app
 * @author Gorka
 */
public class SwingImplementation implements View{
    
    /**
     * Shows a greetin in a message window.
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting){
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, greeting, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}
