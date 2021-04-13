/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratoriosolid;

/**
 *
 * @author Yurguen Pinedo
 */
public class ProbarPeces {
    // Declaramos tres atributos tipo Cetaceo, Pez y AnimalMarino

    Cetaceo ballena;
    Pez carite;
    // Cetaceo y Pez son ambos AnimalesMarinos
    AnimalMarino am = null;

    public ProbarPeces(){

        String tipo;
        tipo = javax.swing.JOptionPane.showInputDialog("¿Pez o Cetaceo?");

        if (tipo.equals("Cetaceo")){
            ballena = new Cetaceo();  // Instanciamos un objeto de Cetaceo.
            am = ballena;             // Como ballena es un Mamifero pero
                                      // también un AnimalMarino, ballena puede
                                      // ser asignada a am la cual es también un
                                      // AnimalMarino (ballena y am son variables
                                      // del mismo tipo)
        }
        if (tipo.equals("Pez")){
            carite = new Pez();       // Instanciamos un objeto de Pez
            am = carite;              // Igual comentario que para ballena
        }
        if (am != null)
                am.nadar();           // ¿Cuál es el valor de am aqui?
                                      // !Cierto! Depende del valor de tipo y este
                                      // es dinámico, se conocerá en tiempo de
                                      // ejecución (cuando "corras" la clase).
                                      // Revisa en el site lo referente a
                                      // polimorfismo.
        // Si am = carite entonces será llamado Pez.nadar()
        // Si am = ballena entonces será llamado Cetaceo.nadar()
        javax.swing.JOptionPane.showMessageDialog(null, "Todo OK con " + tipo,"!Listo!",
                   javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
