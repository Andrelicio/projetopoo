/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.VMain;
import View.VGame;


/**
 *
 * @author Equipe Forca
 */
public class CMain {
    VMain M = new VMain();
    VGame G = new VGame();
    
    public void Enter(){
        G.setVisible(true);
        G.setLocationRelativeTo(null);
        M.dispose();
    }
}
