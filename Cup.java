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
public class Cup {
    private static Dice dice = new Dice();
    
    private static void roll(){
        dice.roll();
    }
    
    public static int getTotal(){
        roll();
        return dice.getFV();
    }
}
