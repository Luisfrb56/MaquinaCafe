
package maquina.contornos;

import java.util.ArrayList;


public class ListaProductos {
    private ArrayList<Producto>listaProductos=new ArrayList<Producto>();
    
    
    
    
    
    public void lista(){
        listaProductos.add(new Producto("Café"));
        listaProductos.add(new Producto ("Chocolate"));
        listaProductos.add(new Producto ("Té"));
    }
}
