/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4311.homework.pkg5.pkg1;

import java.util.Random;

/**
 *
 * @author joshuaduncan
 */
public class Dice {
    private int faceValue;
    Random random = new Random();
    
    public void roll() {
        this.faceValue = random.nextInt(10);
    }
    
    public int getFV(){
        return this.faceValue;
    }
}
