/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iceberg.Ennemis;

import iut.Game;
import iut.GameItem;

/**
 *
 * @author telli
 */
public abstract class Ennemi extends iut.BoxGameItem{

    public Ennemi(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void collideEffect(GameItem gi) {
        
    }

    @Override
    public abstract String getItemType();

    @Override
    public void evolve(long l) {
        
    }
    
}
