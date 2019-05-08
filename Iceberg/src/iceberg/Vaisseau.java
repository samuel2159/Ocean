/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iceberg;

import iceberg.Projectiles.Boulet;
import iut.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author tellier samuel
 */
public class Vaisseau extends iut.BoxGameItem implements KeyListener{
    
    ArrayList<Integer> touches;
    private int angle;
    private int vitesse = 8;
    private int vitesseRotation = 4;
    int vie;// nombre de vie restantes
    double x; // position du vaisseau en x
    double y; // position du vaisseau en y
    int prochainTir;// temps restant avant de pouvoir tirer à nouveau
    int attenteTir = 200;// temps d'attente avant de pouvoir tirer à nouveau

    public Vaisseau(Game g, int x, int y) {
        super(g, "vaisseau", x, y);
        touches = new ArrayList();
        angle = 0;
        vie = 3;
        this.x = (double)x;
        this.y = (double)y;
        prochainTir = attenteTir;
    }

    @Override
    public void collideEffect(GameItem gi) {
        
    }

    @Override
    public String getItemType() {
        return "vaisseau";
    }

    @Override
    public void evolve(long l) {
        if(touches.contains((Integer)KeyEvent.VK_UP)){
            double dx = Math.cos(Math.toRadians(angle))*vitesse;
            double dy = Math.sin(Math.toRadians(angle))*vitesse;
            this.moveXY(dx,dy);
            x += dx;
            y += dy;
        }
        if(touches.contains((Integer)KeyEvent.VK_LEFT)){
            this.setAngle(angle-vitesseRotation);
            angle -=vitesseRotation;
        }
        if(touches.contains((Integer)KeyEvent.VK_RIGHT)){
            this.setAngle(angle+vitesseRotation);
            angle +=vitesseRotation;
        }
        if(touches.contains((Integer)KeyEvent.VK_SPACE)){
            if(prochainTir<0){
                Boulet b = new Boulet(this.getGame(), (int)x, (int)y, angle);
                this.getGame().addItem(b);
                prochainTir = attenteTir;   
            }
            
        }     
        prochainTir -= 10;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(!touches.contains((Integer)e.getKeyCode())){
        touches.add((Integer)e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       touches.remove((Integer)e.getKeyCode());
    }
    
    
    
}
