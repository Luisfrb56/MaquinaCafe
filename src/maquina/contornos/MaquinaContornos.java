
package maquina.contornos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static maquina.contornos.Producto.azucar;
import static maquina.contornos.Producto.precio;


public class MaquinaContornos {

 

    public static void main(String[] args) {
Botonera boton=new Botonera();
Dinero din=new Dinero();
boton.seleccionBebida();
boton.añadirAzucar();
din.introducirDinero();
}
    }

