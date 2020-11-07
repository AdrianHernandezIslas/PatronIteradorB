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
public class IteradorLista implements Iterator{
    private final LinkedList listA;
    private int indice = 0;

    public IteradorLista(LinkedList listA) {
        this.listA = listA;
    }
    
    @Override
    public boolean hasNext() {
        return indice < listA.size();
    }

    @Override
    public Object next() {
        return listA.get(indice++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("No Soportado");
    }
    
}
