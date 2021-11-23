/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LienzoArbol;
import path.Arbol;

/**
 *
 * @author Meibel Ceciliano
 */
public class Controlador {
    private Lienzo objLienzo;
    private Arbol  objArbol;
    
    public Controlador(Lienzo objLienzo, Arbol objArbol){
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
        
    }
    
    public void iniciar(){
        objLienzo.setObjArbol(objArbol);
    }
}
