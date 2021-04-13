/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratoriosolid;

/**
 *
 * @author Yurguen Pinedo
 */
public abstract class Mamifero {
    private int cantMamas;

    // mamar es un método real
    public void mamar(){
    	System.out.println("El mamifero mama");
    }
    /**
    *
    * nacer es abstracto, lo q significa q cualquier clase que herede de Mamifero
    * está obligada a implementar el método nacer. En general, una clase que
    * hereda de otra está obligada a implementar los métodos abstractos de todas
    * las clases en su jerarquía de herencia. La única manera de que esto no sea
    * obligatorio es que la clase que hereda también sea abstracta
    */

    public abstract void nacer();

    public int obtenerCantMamas(){
        return cantMamas;
    }

    public boolean acualizarCantMamas(int nuevaCantMamas){
        if (nuevaCantMamas > 0 && (nuevaCantMamas%2) == 0){

          //Tiene mamas y son pares % determina el residuo de una división

          cantMamas = nuevaCantMamas;
          return true;   // Parámetro correcto
        }
        else return false;
    }
}
