
package maquina.contornos;


public class Producto {
    private String nombre;
    static float precio=(float) 0.50;
    static int azucar=3;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        Producto.precio = precio;
    }

    public static int getAzucar() {
        return azucar;
    }

    public static void setAzucar(int azucar) {
        Producto.azucar = azucar;
    }

    @Override
    public String toString() {
        return "Producto: " + "\nNombre=" + nombre;
    }
    
}
