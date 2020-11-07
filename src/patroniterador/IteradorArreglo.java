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
public class IteradorArreglo implements Iterator{
    private Object[] lista;
    private int indice;

    public IteradorArreglo(Object[] lista) {
        this.lista = lista;
        indice = 0;
    }

    @Override
    public boolean hasNext() {
        return indice < lista.length;
    }

    @Override
    public Object next() {
         return lista[indice++];
    }
    
}
