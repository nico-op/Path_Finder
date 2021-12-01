package Logic;

 /*
   The methods of this class are responsible for obtaining the parameters of X and Y,
   also get the adjacency matrix.
 */
public class Grafics {

    private final double MatrizCoeficiente[][] = new double[51][51];
    private final int MatrizAdyacencia[][] = new int[51][51];
    private final int cordenadaX[] = new int[51];
    private final int cordenadaY[] = new int[51];
    private final String nombre[] = new String[51];
    private int enArbol[];

    /**
     *
     * @author Adrian, Andrés, Meibel, Nicol
     */
    
  
    public Grafics() {

    }
    
    /*
    Method that obtains the coefficient
    */
    public double getmCoeficiente(int i, int j) {
        return MatrizCoeficiente[i][j];
    }
    
    /*
    Method that gets adjacency
    */
    public int getmAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }
    
    /*
    The getCordex, getCordeY, getNombre and getEnArbol methods are responsible 
    for obtaining coordinates, names and tree
    */
    public int getCordeX(int i) {
        return cordenadaX[i];
    }

    public int getCordeY(int i) {
        return cordenadaY[i];
    }

    public String getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbol(int i) {
        return enArbol[i];
    }
    //--------------------------------------------------------------------------
    
    /*
    These methods send the coefficient, the adjacency, the coordinates, the
    name and tree
    */
    public void setmCoeficiente(int i, int j, double mCoeficiente) {
        this.MatrizCoeficiente[i][j] = mCoeficiente;
    }

    public void setmAdyacencia(int i, int j, int mAdyacencia) {
        this.MatrizAdyacencia[i][j] = mAdyacencia;
    }

    public void setCordeX(int i, int cordeX) {
        this.cordenadaX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordenadaY[i] = cordeY;
    }

    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbol(int i, int enArbol) {
        this.enArbol[i] = enArbol;
    }
    //--------------------------------------------------------------------------
    /*
    It is responsible for creating the tree
    */
    public void crearEnArbol(int i) {
        enArbol = new int[i];
    }

}
