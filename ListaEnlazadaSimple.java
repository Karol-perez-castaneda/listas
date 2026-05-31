
package listas;

public class ListaEnlazadaSimple {
    
    //Se establece el nodo cabeza
    
    Nodo cabeza;
    
    //Se estable el metodo insertar para insertar los elementos numericos a la lista enlazada simple
    
    public void insertar(int dato){
    Nodo nuevo = new Nodo(dato);
    if(cabeza == null){
       cabeza = nuevo;
    }else{
        Nodo actual=cabeza;
        while(actual.siguiente!= null){
        actual = actual.siguiente;
      }
    actual.siguiente = nuevo;
    }
   }
    
    //Se establece el metodo mostrar para imprimir la lista enlazada simple en la consola
    
    public void mostrar(){
        Nodo actual = cabeza;
        System.out.println("Lista simple : ");
        while(actual != null){
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("");
    }
}
