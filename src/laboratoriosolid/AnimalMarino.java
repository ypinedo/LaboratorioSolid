/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratoriosolid;

/**
 *
 * @author Yurguen Pinedo
 */
public interface AnimalMarino {
    public final int SINBRANQUIAS = 0; // Las variables finales se escriben toda
    public final int CONBRANQUIAS = 1; // en mayúsculas. Su valor no puede ser cambiado.

    public void nadar(); // nadar es abstracto por defecto
}
