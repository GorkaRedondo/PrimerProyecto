/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.time.Clock;

/**
 *
 * @author 2dam
 */
public class ViewImplementation implements  View{
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
}