/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author adrian
 */
public class ListaArticulos extends ColeccionDatos{
    LinkedList<Object> articulos;

    public ListaArticulos() {
        articulos = new LinkedList<>();
    }
    
    @Override
    public void add(Object obj){
        articulos.add(obj);
    }
    
    @Override
    public void print(Iterator il) {
        while (il.hasNext()) {
            System.out.println(il.next());
        }
    }

    @Override
    public Iterator creaIterador() {
         return new IteradorLista(articulos); //To change body of generated methods, choose Tools | Templates.
    }
    
}
