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
public class Jugador {
    private Apuesta apuesta;
    private Ficha[] fichas;
    
    /**
     * Método constructor para clase Jugador
     */
    public Jugador() {
    }

    /**
     * Método constructor para clase Jugador
     * @param apuesta 
     */
    public Jugador(Apuesta apuesta) {
        this.apuesta = apuesta;
    }
    
    /**
     * Método constructor para clase Jugador
     * @param apuesta
     * @param fichas 
     */
    public Jugador(Apuesta apuesta, Ficha[] fichas) {
        this.apuesta = apuesta;
        this.fichas = fichas;
    }
    
    /**
     * Método para obtener apuesta
     * @return 
     */
    public Apuesta getApuesta() {
        return apuesta;
    }
    
    /**
     * Método para ingresar apuesta
     * @param apuesta 
     */
    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }
    
    /**
     * Método para obtener lista de fichas.
     * @return 
     */
    public Ficha[] getFichas() {
        return fichas;
    }
    
    /**
     * Método para ingresar lista de fichas.
     * @param fichas 
     */
    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }

    
}
