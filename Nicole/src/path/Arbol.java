/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package path;

/**
 *
 * @author Meibel Ceciliano
 * @param <T>
 */
public class Arbol <T> {
    private Nodo raiz;
    
    public void insertar(T elemento){
        if (raiz==null)
            raiz = new Nodo(elemento);
        else
            raiz=raiz.insertar(raiz, elemento);
        
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    
}
