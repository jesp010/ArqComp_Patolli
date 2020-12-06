/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoNegocio;

import java.util.ArrayList;

/**
 *
 * @author Acedo
 */
public class Tablero {
    private Casilla[] casillas;
    
    /**
     * Método constructor vacio de clase Tablero
     */
    public Tablero() {
    }
    
    /**
     * Método constructor para clase Tablero..
     * @param casillas 
     */
    public Tablero(Casilla[] casillas) {
        this.casillas = casillas;
    }
    
    /**
     * Método para obtener lista de casillas
     * @return 
     */
    public Casilla[] getCasillas() {
        return casillas;
    }
    
    /**
     * Método para ingresar Lista de casillas
     * @param casillas 
     */
    public void setCasillas(Casilla[] casillas) {
        this.casillas = casillas;
    }
}
