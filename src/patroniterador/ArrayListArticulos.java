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
public class ArrayListArticulos extends ColeccionDatos{
    ArrayList<Object> lista;

    public ArrayListArticulos() {
        lista = new ArrayList();
    }

    @Override
    public void add(Object obj) {
       lista.add(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator creaIterador() {
       return new IteradorArrayList(lista); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print(Iterator il) {
         while (il.hasNext()) {
            System.out.println(il.next());
        }
    }
}
