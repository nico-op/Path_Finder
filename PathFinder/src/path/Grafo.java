
package path;

// h
import java.util.Random;
import java.io.*;

public class Grafo {

    Grafo(int N, String S, String[] L, double[][] PL, String[] V, double[][] PV ){

        boolean[][] A = new boolean[N][N];
        Random R = new Random();
        int NumLad = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = R.nextBoolean();
                if(A[i][j]){
                	NumLad++;
                }
            }
        }
        


        try{
        	//Crea el archivo
            File f = new File("prueba.txt");
            PrintWriter fileOut = new PrintWriter(new FileWriter(f));
            
            //Crea si es dirigido o no dirigido
            fileOut.println(S);
            fileOut.flush();
            
            //Coloca el numero de vertices
            fileOut.println(N);
            fileOut.flush();

            //Coloca el numero de propieaddes
            fileOut.print(V.length);
            fileOut.flush();

            //Coloca Los identificadores de cada propiedad
            for(int i = 0; i < V.length; i++){
                fileOut.print(" " + V[i]);
                fileOut.flush();
            }
            fileOut.println();
            
            //Coloca los identificadores de los vertices
            for(int i = 0; i < N; i++){
            	fileOut.print("V" + i);
                fileOut.flush();
                //Coloca los valores de las propiedades
                for(int j = 0; j < PV[i].length; j++){
                fileOut.print(" " + PV[i][j]);
                fileOut.flush();
                }
                fileOut.println();
            }
            
            //Coloca el numero de Lados
            fileOut.println(NumLad);
            fileOut.flush();            
  
            //Coloca el numero de propieaddes
            fileOut.print(L.length);
            fileOut.flush();

            //Coloca Los identificadores de cada propiedad
            for(int i = 0; i < L.length; i++){
                fileOut.print(" " + L[i]);
                fileOut.flush();
            }
            fileOut.println();
            
            int i=0;
            //Coloca los identificadores de los lados y los vertices asociados al lado            
            for(int j = 0; j < N; j++){
            	for(int k = 0; k < N; k++){
            		if(A[j][k]){
                            fileOut.print("L" + i);
                            fileOut.flush();
                            fileOut.print(" " + "V" + j + " " + "V" + k);
                            fileOut.flush();

                            //Coloca los valores de las propiedades
                            for(int w = 0; w < (PL[i].length); w++){
                                fileOut.print(" " + PL[i][w]);
                                fileOut.flush();
                            }
                            fileOut.println();

                            i++;
                	}
                }
            }

            //Cierro el archivo
            fileOut.close();
        }catch(IOException Ex) {
        }



        /*
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        */
    }
    
    public static void main(String[] args) {

		int NV = Integer.parseInt(args[0]); //<< Numero de Vertices
		int N1 = NV*NV; //<< Numero Maximo de Aristas
		int N2 = 4; //<< Cantidad de Columnas Necesarias
		
		boolean U = false; //<< Uniforme, si Es 1 Todos los Costos y Ganancias son 1, si es false son al azar
		
		try {
			if(Integer.parseInt(args[1])==1)
				U = true;
		}catch (Exception E1){
			U = false;
		}
		
		String[] V = new String[4];
        String[] L = new String[4];		
		
        double[][] PL=new double[N1][N2]; //<< Costo y Ganancia de Cada Nodo
        Random R = new Random();

        for(int i=0;i<N1;i++){
            for(int j=0;j<N2;j++){
				if(U)
					PL[i][j]=1.0;
				else
					PL[i][j]= R.nextDouble()*10;
            }
        }
		
        L[0]="CostoCoodNess";
        L[1]="TiempoGoodNess";
        L[2]="TiempoEvil";
        L[3]="GananciaEvil";

        Grafo C = new Grafo(NV,"DIR",L,PL,L,PL);
        
    }

}/// hhhhhhhhhhhh
