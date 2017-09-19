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
public class JailSquare extends Square {
    
    @Override
    public void landedOn(Player p) {
        p.setLocation(this);
        int w = p.getNetWorth();
        if (w >= 200){
            p.reduceCash(200);
        } else {
            p.addCash(w-200);
        }
        printName("Jail");
    }
}
