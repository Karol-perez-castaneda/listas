
package listas;

public class Nodo {
 
//Se define las especificaciones de los Nodos
    
    int dato;
    Nodo siguiente;
    Nodo anterior;
    
    //Se define el metdodo constructor del Nodo
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
