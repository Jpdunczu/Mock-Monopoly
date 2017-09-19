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
public class Player {
    private Square loc;
    private int cash;
    private Board board = new Board();
    
    Player(){
        this.cash = 1500;
        this.loc = board.getSquare(null,0);
        int fvTot = Cup.getTotal();
        this.loc = board.getSquare(loc,fvTot);
        System.out.println("Dice: " + fvTot);
        loc.landedOn(this);
        System.out.println("Cash: " + cash);
    }
    
    public void addCash(int cash) {
        this.cash += cash;
    }
    
    public void reduceCash(int cash) {
        this.cash -= cash;
    }
    
    public int getNetWorth(){
        return this.cash;
    }
    
    public void setLocation(Square loc){
        this.loc = loc;
    }
}
