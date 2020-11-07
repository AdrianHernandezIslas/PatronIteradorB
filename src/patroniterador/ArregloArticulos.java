/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;

import java.util.Iterator;

/**
 *
 * @author adrian
 */
public class ArregloArticulos extends ColeccionDatos{
    Object lista[];
    int indice;

    public ArregloArticulos(int tamanio) {
        lista = new Object[tamanio];
    }
    
    @Override
    public void add(Object obj) {
        lista[indice++] = obj;
    }

    @Override
    public void print(Iterator il) {
         while (il.hasNext()) {
            System.out.println(il.next());
        }
    }

    @Override
    public Iterator creaIterador() {
        return new IteradorArreglo(lista); //To change body of generated methods, choose Tools | Templates.
    }
    
}
