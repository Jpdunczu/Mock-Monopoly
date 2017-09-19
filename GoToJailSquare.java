/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4311.homework.pkg5.pkg1;

/**
 *
 * @author joshuaduncan
 */
public class GoToJailSquare extends Square {
    
    private Square JailSquare = new JailSquare();
    
    @Override
    public void landedOn(Player p){
        p.setLocation(JailSquare);
        printName("GoToJailSquare");
        JailSquare.landedOn(p);
    }
}
