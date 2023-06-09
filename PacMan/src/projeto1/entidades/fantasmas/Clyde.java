/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1.entidades.fantasmas;

import javafx.scene.paint.Color;
import projeto1.engine.Tabuleiro;

/**
 *
 * @author Vitor Rinaldini
 */
public class Clyde extends FantasmaAleatorio{

    /**
     * Classe responsável pela implementação do Clyde.
     * @author Vitor Rinaldini
     * @param x
     * @param y
     * @param tab
     * @param turnosPreso 
     */
    public Clyde(float x, float y, Tabuleiro tab, int turnosPreso) {
        super(x, y, tab, Color.ORANGE, turnosPreso, "Clyde");
    }

    @Override
    public float getRealX() {
        return getX();
    }

    @Override
    public float getRealY() {
        return getY();
    }
    
}
