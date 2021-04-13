/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratoriosolid;

/**
 *
 * @author Yurguen Pinedo
 */
public class Pez implements AnimalMarino{
     String tipo;

    public Pez(){ //Constructor de la clase
    }

    public void nadar(){  // Se implementa el método heredado

    	System.out.println("Nada el pez");
    }

    public String obtenerTipo(){
        return tipo;
    }

    public boolean actualizarTipo(String nuevoTipo){
        tipo = nuevoTipo;
        return true;
    }
}
