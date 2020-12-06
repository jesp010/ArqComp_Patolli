/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoNegocio;

import java.util.Random;

/**
 *
 * @author Acedo
 */
public class Cañas {
    private int numCaña;
    
    private boolean lado;

    /**
     * Método constructor de clase cañas.
     * @param numCaña 
     */
    public Cañas(int numCaña) {
        this();
        this.numCaña = numCaña;
        this.GenerarLado();
    }
    
    /**
     * Método constructor vacío de clase cañas.
     */
    public Cañas() {
    }
    
    /**
     * Método que regresa número de cañas.
     * @return int numCaña
     */
    public int getNumCaña() {
        return numCaña;
    }
    
    /**
     * 
     * Método vacío para ingresar número de cañas.
     * @param numCaña 
     */
    public void setNumCaña(int numCaña) {
        this.numCaña = numCaña;
    }

    /**
     * Método que regresa un boolean para obtener lado.
     * @return lado
     */
    public boolean getLado() {
        return lado;
    }

    /**
     * Método vacío para ingresar un boolean con el lado.
     * @param lado 
     */
    public void setLado(boolean lado) {
        this.lado = lado;
    }

    /**
     * Método vacío para generar lado
     */
    public void GenerarLado(){
        Random rd = new Random();
        int numAl= rd.nextInt(3);
        if(numAl==0){
            GenerarLado();
        }
        for (int i = 0; i < numAl; i++) {
            if(numAl%2==0){
                this.lado = true;
//                    System.out.println("El número es par" + numAl);
            } else {
                this.lado= false;
//                System.out.println("El número es no par" + numAl);

            }

        }

    }

}
