
package listas;

public class ListaCircular {
    
    //Se los nodos cabeza y cola 
    
    Nodo cabeza;
    Nodo cola;
    
    //Se estable el metodo insertar para insertar los elementos numericos a la lista circular
    
    public void insertar(int dato){
    Nodo nuevo = new Nodo(dato);
    if (cabeza == null){
        cabeza = nuevo;
        cola = nuevo;
    }else{
        cola.siguiente = nuevo;
        nuevo.anterior = cola;
        cola = nuevo;
    }
   }
    
     //Se establece el metodo mostrar para imprimir la lista circular en la consola
    
    public void mostrar(){
    Nodo temp = cabeza;
    System.out.println("Lista Circular : ");
    while(temp != null){
        System.out.print(temp.dato + " <-> ");
        temp = temp.siguiente;
        }
        System.out.println("");
    }
}

