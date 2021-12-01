package Logic;

import static Path.main.PintarFiguras;
import static Path.main.jPanel1;
import java.awt.Color;


public class Dijkstra {

    private final Grafics arboles;
    private int subTope;
    private Nodo Nodoauxiliar = null;
    private double auxiliarAumulado; 
    private double subtotalAcomulado;
    private final Nodo nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;
 
    /*
    Constructor method
    */
    public Dijkstra(Grafics arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Nodo[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    /**
     * These methods get the accumulated and the name respectively
     */
    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }
    
    //--------------------------------------------------------------------------
    /**
     *This is the method in charge of finding the shortest path between points.
     * It also paints the road and the points of origin and destination.
     */
    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creation of the node vector of the size of the number of painted nodes
        {
            nodo[i] = new Nodo();
        }
            jPanel1.paint(jPanel1.getGraphics());
            PintarFiguras(tope, arboles);
            Paint.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(Origen), 
                    arboles.getCordeY(Origen), null, Color.DARK_GRAY); // color the Origin node

            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;
                auxiliarAumulado = 2000000000; // we equate it to this figure since the accumulated of the nodes, to which it will never be greater
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, Origen) == 1) {
                        subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);
                        
                        if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        }
                    }
                }
                
                //Finding the shortest way
                for (int i = 0; i < tope; i++) { //We look for which of the visited nodes has the smallest accumulated to choose it as the path
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxiliarAumulado) {
                            Origen = nodo[i].getNombre();
                            auxiliarAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);

            Nodoauxiliar = nodo[nodoFinal];
            
            //Painting roads traveled
            while (Nodoauxiliar.getPredecesor() != null) {
                Paint.pinta_Camino(jPanel1.getGraphics(), // PAINT THE ROAD
                        arboles.getCordeX(Nodoauxiliar.getNombre()),
                        arboles.getCordeY(Nodoauxiliar.getNombre()),
                        arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.MAGENTA);
                
                Paint.seleccionNodo(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getNombre()), null, Color.MAGENTA);//PAINT THE NODES OF THE ROAD TRAVELED
                Nodoauxiliar = Nodoauxiliar.getPredecesor();
            }
            
            Paint.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(nodoFinal), 
                    arboles.getCordeY(nodoFinal), null, Color.GREEN);//DESTINATION PAINT
        
    }

}
