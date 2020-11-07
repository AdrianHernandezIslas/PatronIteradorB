/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adrian
 */
public class IteradorArrayList implements Iterator {
    private final ArrayList lista;
    private int indice = 0;

    public IteradorArrayList(ArrayList lista) {
        this.lista = lista;
    }
    

    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    @Override
    public Object next() {
        return lista.get(indice++);
    }
    
}
