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
public class Board {
    
    private static Square GoSquare = new GoSquare();
    private static Square GoToJailSquare = new GoToJailSquare();
    private static Square RegularSquare = new RegularSquare();
    private static Square IncomeTaxSquare = new IncomeTaxSquare();
    
    private static Square[] Board = new Square[] {GoSquare,GoToJailSquare,
                                                            RegularSquare,IncomeTaxSquare,RegularSquare};
    
    public static Square getSquare(Square loc, int fvTot){
        
        return Board[fvTot%5];
    }
}
