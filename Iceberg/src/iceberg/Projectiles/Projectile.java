/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iceberg.Projectiles;

import iut.Game;
import iut.GameItem;

/**
 *
 * @author telli
 */
public abstract class Projectile extends iut.BoxGameItem{

    private int direction;
    private int vitesse;
    
    /**
     * Permet de créer un projectile
     * @param g le jeu
     * @param s 
     * @param x position en x
     * @param y position en y
     * @param direction direction en degres
     */
    public Projectile(Game g,String s,int x, int y,int direction) {
        super(g, s, x, y);
        this.direction = direction;
        vitesse = 5;
    }

    @Override
    public void collideEffect(GameItem gi) {
        
    }

    @Override
    public abstract String getItemType();

    @Override
    public void evolve(long l) {
        this.moveXY(Math.cos(Math.toRadians(direction))*vitesse, Math.sin(Math.toRadians(direction))*vitesse);
    }
    
}
