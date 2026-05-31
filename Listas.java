
package listas;

public class Listas {

    public static void main(String[] args) {
    
        //Se instancia la primera lista: la lista simple
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        
        //Se inserta elementos numericos a la lista simple
        lista.insertar(10);
        lista.insertar(64);
        lista.insertar(11);
        
        //Se imprime la lista simple en el consola
        lista.mostrar();
    
        //Se instancia la segunda lista: la lista circular
        ListaCircular listaC = new ListaCircular();
        
        //Se inserta elementos numericos a la lista circular
        listaC.insertar(11);
        listaC.insertar(5);
        listaC.insertar(8);
        
        //Se imprime la lista circular en el consola
        listaC.mostrar();
        
        //Se instancia la tercera lista: la lista doblemente enlazada
        ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
        
        //Se inserta elementos numericos de las anteriores listas a la lista doblemente enlazada
        listaDoble.insertar(10);
        listaDoble.insertar(64);
        listaDoble.insertar(11);
        listaDoble.insertar(5);
        listaDoble.insertar(8);
        listaDoble.insertar(11);
        listaDoble.insertar(7);
        
        //Se ordena los elementos de la lista ascendentemente
        listaDoble.ordenarAscendente();
        
        //Se imprime la lista ya ordenada
        listaDoble.mostrar();
        
        //Se elimina los numeros duplicados
        listaDoble.eliminarDuplicados();
        
        //Se imprime la lista con los elementos duplicados ya eliminados
        listaDoble.mostrar();
        
        //Se crea una nueva lista simple con solo los elementos que son numeros primos y
        //imprime en el consola
        listaDoble.primos();
        
        //Se le pide al usuario un numero para filtrar los numeros primos menores o iguales a este numero
        //se imprime el resultado en la consola
        listaDoble.primosMenores();
             
    }
}
