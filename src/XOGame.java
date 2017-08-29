/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

/**
 *
 * @author Paramjeet Singh
 */
public class XOGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xomain().setVisible(true);
            }
        });// TODO code application logic here
    }
    
}
