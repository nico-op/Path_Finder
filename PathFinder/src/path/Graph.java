package path;
//
import java.util.Scanner;
import javax.swing.JTextArea;

public class Graph {
    
    public  int distance[] = new int[15]; //Vector to store distances
    public  static int cost[][] = new int[15][15]; // square matriz
 
    public void calc(int n, int origen){ //(15,#)
        int flag[] = new int[n + 1];
        int i, k, c, minimum, minpos = 1;
        
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
                    minimum=this.distance[i];
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
        
        int nodos, origen, destiny, i, j, l = 0;
        int distancestList[] = new int[]{0,3,999,7,3,0,4,2,999,4,0,5,7,2,5,0}; //Contiene la matriz de pesos
        Scanner in = new Scanner(System.in);
        nodos = 4;
        Graph d = new Graph();
        
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
        
        d.calc(nodos, origen); // Se envía el # de nodos y el # del nodo de origen
        System.out.println("Origen: " + origen + "\t destiny: " + destiny + "\t the shortest distance is: " + d.distance[destiny] + "\t");
        
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
