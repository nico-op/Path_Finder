
package path;
//
import java.util.Scanner;
import javax.swing.JTextArea;

public class myGraph {
    
    public  float distance[] = new float[15]; //Vector to store distances
    public  static float cost[][] = new float[15][15]; // square matriz
 
    public void calc(int n, int origen){ //(15,#)
        int flag[] = new int[n + 1];
        int i, k, c, minpos = 1;
        float minimum;
        
        //Se le da al vector distancia la primera fila de la matriz
        for(i = 1; i <= n; i++){  
            flag[i] = 0; 
            this.distance[i] = this.cost[origen][i]; // cost[1][1] = 0
        }
        
        c=2;
        while(c <= n){
            minimum = 99;
            for(k = 1; k <= n; k++){
                if(this.distance[k] < minimum && flag[k]!= 1){
                    minimum = this.distance[i];
                    minpos = k;
                }
            }
            
            flag[minpos] = 1;
            c++;
            
            for(k = 1; k <= n; k++){
                if(this.distance[minpos] + this.cost[minpos][k] < this.distance[k] && flag[k]!= 1 )
                    this.distance[k] = this.distance[minpos] + this.cost[minpos][k];
                }   
            } 
  
    }
    
    public static void main(String[] args) {
        JTextArea window = new JTextArea();
        String output = "NODO\tA \tB \tC \tD\n";
        int c = 1;
        
        int nodos, origen, destiny, atraso, i, j, l = 0;
        float distancestList[] = new float[]{0,2.25f,999,5.25f,  
                                             2.25f,0,3f,1.5f,  
                                             999,3f,0,3.75f,  
                                             5.25f,1.5f,3.75f,0}; //Contiene la matriz de pesos en horas
        Scanner in = new Scanner(System.in);
        nodos = 4;
        myGraph d = new myGraph();
        
        //fill the matrix
        for(i = 1; i <= nodos; i++){
            output += c++ + "\t";
            for(j = 1; j <= nodos; j++){
                d.cost[i][j] = distancestList[l]; // Almacena cada peso fila por fila
                output += d.cost[i][j] + "\t"; // Se concatena con la salida
                l++;
            }
            output += "\n";
        }
        
        //window.setText(output); //Muestra los datos de la matriz
        //JOptionPane.showMessageDialog(null, window);
        
        System.out.println("Ingrese su lugar de origen: ");
        origen = in.nextInt();
        
        System.out.println("Ingrese su lugar de destino: ");
        destiny = in.nextInt();
        
        System.out.println("Ingrese el tiempo de atraso en minutos: ");
        atraso = in.nextInt();
        
        d.calc(nodos, origen); // Se envía el # de nodos y el # del nodo de origen
        //System.out.println("La ruta más corta desde el nodo \t" + origen + "\t a todos los demás nodos es: \n");
        System.out.println("Origen: " + origen + "\t destiny: " + destiny + "\t the best route is: " + (d.distance[destiny] + atraso) + "\t");
        
        /*for(i = 1; i <= nodos; i++){
            if(i != origen){ // Si la i es diferente del origen, muestrelo
                System.out.println("Origen: " + origen + "\t destiny: " + i + "\t the shortest distance is: " + d.distance[i] + "\t");
            }
        }*/
        
        System.out.println("Mostrando la matriz costo");
        for(i = 0; i <= nodos; i++){
            for(j = 0; j <= nodos; j++){
                System.out.print(cost[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
