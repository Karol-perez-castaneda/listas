
package listas;

import java.util.Scanner;

public class ListaDobleEnlazada {
    
    //Se establece sc de scanner para introducir un valor numerico en el metodo primosMenores
    
    Scanner sc = new Scanner(System.in);
    
    //Se los nodos cabeza y cola
    
    Nodo cabeza;
    Nodo cola;
    
    //Se estable el metodo insertar para insertar los elementos numericos a la lista doblemente enlazada 
    
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
    
    //Se estable el metodo ordenarAscendente para ordenar ascendentemente los elementos numericos de la lista
    
    public void ordenarAscendente() {
        if (cabeza == null || cabeza.siguiente == null) {
            return; }

        boolean intercambio;
        Nodo actual;

        do { intercambio = false;
            actual = cabeza;

            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {
                    int temp = actual.dato;
                    actual.dato = actual.siguiente.dato;
                    actual.siguiente.dato = temp;
                    
                    intercambio = true;
                }
                actual = actual.siguiente;
            }
        } while (intercambio);
    }

    //Se establece el metodo mostrar para imprimir la lista doblemente enlazada  en la consola
        
    public void mostrar(){
    Nodo temp = cabeza;
    System.out.println("Lista Doblemente enlazada : ");
    while(temp != null){
        System.out.print(temp.dato + " <-> ");
        temp = temp.siguiente;
        }
        System.out.println("");
    }
    
    //Se establece el metodo eliminarDuplicados para eliminar los elementos duplicados en la
    //lista doblemente enlazada 
    
    public void eliminarDuplicados() {
    Nodo actual = cabeza;
    while (actual != null) {
        Nodo corredor = actual.siguiente;
        while (corredor != null) {
            if (corredor.dato == actual.dato) {
                corredor.anterior.siguiente = corredor.siguiente;
                if (corredor.siguiente != null) {
                    corredor.siguiente.anterior = corredor.anterior;
                }
                
                if (corredor == cola) {
                    cola = corredor.anterior;
                }
                
                Nodo siguienteNodo = corredor.siguiente;
                corredor = null;
                corredor = siguienteNodo;
                } else {
                corredor = corredor.siguiente;
            }
        }
        actual = actual.siguiente;
    }
 }
    
    //Se establece el metodo primos para filtrar los numeros primos de la lista doblemente enlazada, 
    //agregarlos en la lista simple ListaNumerosPrimos e imprimir la lista en la consola
    
        public void primos(){
        ListaPrimos ListaNumerosPrimos = new ListaPrimos();
        Nodo primos = cabeza;
        int cantidad = 0;
        while(primos != null){
        for (int i = 1; i < primos.dato; i++) {
            if (primos.dato % i == 0){
            cantidad++;}
        }
        if (cantidad > 2){
        }else{
            ListaNumerosPrimos.insertar(primos.dato);          
        }
        primos = primos.siguiente;
    }
    System.out.println("");  
    ListaNumerosPrimos.mostrar();
    System.out.println("");
}
        
        //Se establece el metodo primosMenores para filtrar los numero iguales o menores al numero que
        //ingrese el usuario y los imprime en consola
        
        public void primosMenores(){
        Nodo primosMenor = cabeza;
        int numero;
        System.out.println("Ingrese  un numero para filtra los numeros primos menores o iguales a ese numero en el Nodo");
        numero = sc.nextInt();
        int cantidad2 = 0;
        System.out.println("Los numeros primos menores o iguales a ese numero en el Nodo son: ");
        while(primosMenor != null){
        for (int i = 1; i < primosMenor.dato; i++) {
            if (primosMenor.dato % i == 0){
            cantidad2++;}
        }
        if (cantidad2 > 2){
        }else{
            if (primosMenor.dato <= numero){
            
            System.out.print(primosMenor.dato+ " <-> ");
            }
            System.out.println("");
        }
        primosMenor = primosMenor.siguiente;
        }
    } 
}


