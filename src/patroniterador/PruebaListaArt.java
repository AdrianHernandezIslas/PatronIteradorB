/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;

/**
 *
 * @author adrian
 */
public class PruebaListaArt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaArticulos lista = new ListaArticulos();
        lista.add(new Articulo("Uno", 10, 2));
        lista.add(new Articulo("Dos", 5, 2));
        lista.add(new Articulo("Tres", 3, 5));
        lista.add(new Articulo("Cuatro", 20, 3));
        lista.add(new Articulo("Cinco",30 , 1));
        lista.add(new Articulo("Seis", 25, 1));
        lista.add(new Articulo("Siete", 1, 1));
        lista.print(new IteradorLista(lista.articulos));
        
        ArregloArticulos arreglo = new ArregloArticulos(5);
        arreglo.add(new Articulo("Uno", 10, 2));
        arreglo.add(new Articulo("Dos", 5, 2));
        arreglo.print(new IteradorArreglo(arreglo.lista));
        
        ArrayListArticulos arraylist = new ArrayListArticulos();
        arraylist.add(new Articulo("Cuatro", 20, 3));
        arraylist.add(new Articulo("Cinco", 20, 3));
        arraylist.print(new IteradorArrayList(arraylist.lista));
    }
    
}
