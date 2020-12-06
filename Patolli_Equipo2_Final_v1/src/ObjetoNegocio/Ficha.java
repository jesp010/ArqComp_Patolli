/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoNegocio;

/**
 *
 * @author Acedo
 */
public class Ficha {

    private int posicion;
    private int id;
    
    /**
     * Método constructor de clase Ficha
     * @param id
     * @param posicion 
     */
    public Ficha(int id, int posicion) {
        this.id = id;
        this.posicion = posicion;
    }

    /**
     * Método para obtener id de Ficha.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Método para ingresar id de ficha.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para obtener posición de ficha.
     * @return posición
     */
    public int getPosicion() {
        return posicion;
    }
    
    /**
     * Método para ingresar posición de ficha.
     * @param posicion 
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
