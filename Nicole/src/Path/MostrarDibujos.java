
package Path;

import Logic.Grafics;
import Logic.Paint;
import static Path.main.jPanel1;
/**
 *
 * @author Nicol, Adrián, Meibel, Andrés
 */

/*
This class is in charge of showing the drawings on the image.
*/
public class MostrarDibujos {
    private int tope=0;// carries the number of nodes created
    private int nodoFin;
    private int permanente;
    int n=0,nn=0,id,id2;//allows you to control that you have clicked on a node
    private int aristaMayor;
    Grafics arboles = new Grafics();
    
    public static void R_repaint(int tope, Grafics arboles){
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(arboles.getmAdyacencia(j, k) == 1)
                   Paint.pinta_Linea(jPanel1.getGraphics(),arboles.getCordeX(j),arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k),arboles.getmCoeficiente(j, k));
                                 }
        }
        for (int j = 0; j < tope; j++) 
           Paint.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j),arboles.getCordeY(j),String.valueOf(arboles.getNombre(j)));
                
   }
}
