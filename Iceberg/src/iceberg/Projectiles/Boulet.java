/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iceberg.Projectiles;

import iut.Audio;
import iut.Game;

/**
 *
 * @author telli
 */
public class Boulet extends Projectile{

    public Boulet(Game g, int x, int y, int direction) {
        super(g, "boulet", x, y, direction);
        // musique jouée lors de l'apparition
        Audio son = new Audio("boulet");
        son.start();
    }

    @Override
    public String getItemType() {
        return "boulet";
    }
    
}
