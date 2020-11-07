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
public abstract class ColeccionDatos {
    
    protected int maxElements;
    
    public abstract void add(Object obj);
    
    public abstract Iterator creaIterador();
    
    public abstract void print(Iterator il);
    
}
