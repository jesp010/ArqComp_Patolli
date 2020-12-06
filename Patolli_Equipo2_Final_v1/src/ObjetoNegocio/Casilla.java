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
public class Casilla {
    private int Id;
    private Ficha[] ListaFicha;
   
    
    /**
     * Constructor para clase Casilla
     */
    public Casilla() {
    }

    /**
     * Constructor para clase Casilla
     * @param Id
     * @param ListaFicha 
     */
    public Casilla(int Id, Ficha[] ListaFicha) {
        this.Id = Id;
        this.ListaFicha = ListaFicha;
       
    }
    
    /**
     * Método que regresa un Int con el Id de casilla
     * @return int Id
     */ 
    public int getId() {
        return Id;
    }

    /**
     * Método void para ingresar id de casilla.
     * @param int id
    */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * Método que regresa una lista de fichas.
     * @return  Ficha[]
     */
    public Ficha[] getListaFicha() {
        return ListaFicha;
    }

    /**
     * Método vacío para ingresar lista de fichas/
     * @param ListaFicha 
     */
    public void setListaFicha(Ficha[] ListaFicha) {
        this.ListaFicha = ListaFicha;
    }
    
    /**
     * Metodo vacío para agregar ficha a lista de fichas.
     * @param ficha 
     */
    public void agregarFichaLista (Ficha ficha){
        for (int i = 0; i < ListaFicha.length; i++) {
            if (this.ListaFicha[i] == null) {
                this.ListaFicha[i]= ficha;
            }
        }
        
    }
        

}
