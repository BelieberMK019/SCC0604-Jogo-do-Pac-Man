/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1.engine.niveis;

import projeto1.entidades.elementos.frutinhas.Cereja;

/**
 *
 * @author Vitor Rinaldini
 */
public class Nivel1 extends Nivel{
    /**
     * Construtor do nível 1;
     */
    public Nivel1() {
        super(1, ".//mapas//map1.txt", 70, 100, 15f, 0.001f, 5, Cereja.class);
    }
    
}
