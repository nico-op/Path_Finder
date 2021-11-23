/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LienzoArbol;
import path.Arbol;
import LienzoArbol.Lienzo;
import javax.swing.JFrame;

/**
 *
 * @author Meibel Ceciliano
 */
public class lienzoArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol objArbol = new Arbol(); //modelo
        Lienzo objLienzo = new Lienzo(); //vista
        Controlador objControlador = new Controlador(objLienzo,objArbol); //controlador
        
        //Insertar y pintar el arbol 
        objArbol.insertar(40);
        objArbol.insertar(20);
        objArbol.insertar(60);
        objArbol.insertar(4);
        objArbol.insertar(35);
        objArbol.insertar(99);
        objArbol.insertar(54);
        objArbol.insertar(15);
        objArbol.insertar(11);
        objArbol.insertar(21);
        objArbol.insertar(33);
        objArbol.insertar(19);
        objArbol.insertar(24);
        objArbol.insertar(13);
        objArbol.insertar(14);
        objControlador.iniciar();
        
        //Mostrar el lienzo en una ventana
        JFrame ventana= new JFrame();
        ventana.getContentPane().add(objLienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600,600);
        ventana.setVisible(true);                    
        
    }
    
}
