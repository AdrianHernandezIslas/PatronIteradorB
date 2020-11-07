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
public class Articulo {
    private String nombre;
    private int cantidad;
    private int precio;

    public Articulo(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
