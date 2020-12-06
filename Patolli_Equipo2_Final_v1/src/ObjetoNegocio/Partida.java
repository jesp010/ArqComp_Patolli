/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoNegocio;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Acedo
 */
public class Partida {
    private int numCasillas;
    private Tablero tablero;
    private Jugador[] ListaJugadores;
    private Cañas[] cañas;
    private int Codigo;
    
    /**
     * Método constructor vacío de clase Partida
     */
    public Partida() {
    }
    
    /**
     * Método constructor de clase Partida
     * @param numCasillas
     * @param tablero
     * @param ListaJugadores
     * @param cañas
     * @param Codigo 
     */
    public Partida(int numCasillas, Tablero tablero, Jugador[] ListaJugadores, Cañas[] cañas, int Codigo) {
        this.numCasillas = numCasillas;
        this.tablero = tablero;
        this.ListaJugadores = ListaJugadores;
        this.cañas = cañas;
        this.Codigo = Codigo;
    }

    
    /**
     * Método constructor de clase Partdia
     * @param tablero
     * @param ListaJugadores
     * @param cañas 
     */
    public Partida(Tablero tablero, Jugador[] ListaJugadores, Cañas[] cañas) {
        this.tablero = tablero;
        this.ListaJugadores = ListaJugadores;
        this.cañas = cañas;
       
    }
    
    /**
     * Método para obtener tablero de partida
     * @return Tablero tablero
     */
    public Tablero getTablero() {
        return tablero;
    }
    
    /**
     * Método para obtener tablero de partida
     * @param tablero 
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    /**
     * Método para obtener lista de jugadores de partida.
     * @return Jugador[] ListaJugadores
     */
    public Jugador[] getListaJugadores() {
        return ListaJugadores;
    }
    
    /**
     * Método para ingresar lista de jugadores de partida
     * @param ListaJugadores 
     */
    public void setListaJugadores(Jugador[] ListaJugadores) {
        this.ListaJugadores = ListaJugadores;
    }

    /**
     * Método para obtener lista de cañas de partida
     * @return Cañas[] cañas
     */
    public Cañas[] getCañas() {
        return cañas;
    }
    
    /**
     * Método para ingresar lista de cañas de partida.
     * @param Cañas[] cañas 
     */
    public void setCañas(Cañas[] cañas) {
        this.cañas = cañas;
    }
    
    /**
     * Método para obtener codigo de partida
     * @return  int codigo
     */
    public int getCodigo() {
        return Codigo;
    }
    
    /**
     * Método para ingresar código de partida
     * @param Codigo 
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    /**
     * Método para obtener número de casillas.
     * @return int numCasillas
     */
    public int getNumCasillas() {
        return numCasillas;
    }
    
    /**
     * Método para ingresar número de casillas.
     * @param numCasillas 
     */
    public void setNumCasillas(int numCasillas) {
        this.numCasillas = numCasillas;
    }
    
    
}
