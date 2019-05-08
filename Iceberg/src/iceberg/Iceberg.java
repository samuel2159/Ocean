/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iceberg;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author telli
 */
public class Iceberg extends iut.Game{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iceberg i = new Iceberg(800, 600, "Iceberg");
        i.play();
    }

    public Iceberg(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    protected void createItems() {
        Vaisseau v = new Vaisseau(this, 200, 200);
        this.addItem(v);          
    }

    @Override
    protected void drawBackground(Graphics grphcs) {
        grphcs.setColor(Color.WHITE);
        grphcs.fillRect(00, 0, getWidth(), getHeight());
    }

    @Override
    protected void lost() {
        
    }

    @Override
    protected void win() {
        
    }

    @Override
    protected boolean isPlayerWin() {
        return false;
    }

    @Override
    protected boolean isPlayerLost() {
        return false;
    }
    
}
