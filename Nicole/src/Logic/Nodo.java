package Logic;

/**
 *
 * @author Meibel, Adrián, Andrés, Nicol
 */


public class Nodo {    
   private  int nombre ;
   private boolean visitado ;
   private boolean etiqueta;
   private double acumulado; 
   private Nodo Predecesor;
   
   
   public Nodo(){
       this.nombre =-1;
       this.visitado = false;
       this.etiqueta = false;
       this.Predecesor  = null;
       this.acumulado =0;       

   }
   /*
   Method that gets the name of the node
   */
     public int getNombre() {
        return nombre;
    }
     
    /*
     Method that verifies if the node was visited
     */
    public boolean isVisitado() {
        return visitado;
    }

    /*
    Method that checks if the label
    */
    public boolean isEtiqueta() {
        return etiqueta;
    }

    /*
    Method that obtains the accumulated
    */
    public double getAcumulado() {
        return acumulado;
    }
    
    /*
    Method that gets the previous node
    */
    public Nodo getPredecesor() {
        return Predecesor;
    }

    //--------------------------------------------------------------------------
    /*
    These methods are responsible for sending the name, the visited node, the 
    label, the accumulated and the previous node respectively.
    */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAcumulado(double acomulado) {
        this.acumulado = acomulado;
    }

    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }

    
}
