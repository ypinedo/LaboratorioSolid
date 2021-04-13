/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratoriosolid;

/**
 *
 * @author Yurguen Pinedo
 */

public class Cetaceo extends Mamifero implements AnimalMarino{
    private String tipo;

    public Cetaceo(){
        mamar();      // En el constructor enviamos a mamar al cetáceo
    }

    public void nadar(){// Se implementa el método heredado de AnimalMarino
    	System.out.println("Nada el cetaceo");
    }

    public void nacer(){// Se implementa el método heredado de Mamifero
        System.out.println("El cetáceo lo pare su mamá");
    }

    public String obtenerTipo(){
        return tipo;
    }

    public boolean actualizarTipo(String nuevoTipo){
        tipo = nuevoTipo;
        return true;
    }
}
