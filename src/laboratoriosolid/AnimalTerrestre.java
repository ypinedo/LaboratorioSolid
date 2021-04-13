/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosolid;

/**
 *
 * @author Yurguen Pinedo
 */
public class AnimalTerrestre extends Mamifero{
    private int cantPatas;
    public AnimalTerrestre(){
        mamar();      // En el constructor enviamos a mamar al AnimalTerrestre
    }

    public void caminar(){
    	System.out.println("Camina el animalTerrestre");
    }

    public void nacer(){// Se implementa el método heredado de Mamifero
        System.out.println("El AnimalTerrestre lo pare su mamá");
    }

    public int obtenerTipo(){
        return cantPatas;
    }

    public boolean actualizarCantPatas(int patas){
        cantPatas = patas;
        return true;
    }
}
