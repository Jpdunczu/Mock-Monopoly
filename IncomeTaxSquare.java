/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4311.homework.pkg5.pkg1;

import static java.lang.Math.min;

/**
 *
 * @author joshuaduncan
 */
public class IncomeTaxSquare extends Square {
    
    @Override
    public void landedOn(Player p){
        p.setLocation(this);
        int w = p.getNetWorth();
        p.reduceCash((int) min(200,w*.10));
        printName("IncomeTaxSquare");
    }
}
