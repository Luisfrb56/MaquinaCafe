package maquina.contornos;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static maquina.contornos.Producto.azucar;

public class Botonera {

    public void seleccionBebida(ArrayList<Producto> listaProductos) {
        int num;
        num = parseInt(JOptionPane.showInputDialog("1.Café. \n2.Chocolate. \n3Té."));
        switch (num) {
            case 1:
                listaProductos.get(0);
                break;
            case 2:
                listaProductos.get(1);
                break;
            case 3:
                listaProductos.get(2);
                break;
        }
    }

    public void añadirAzucar() {
        String[]opciones={"+","-"};
        boolean exit=true;
        do{
        int num =JOptionPane.showOptionDialog(null, null, "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);


        switch (num) {
            case 0:
                if(azucar<=5){
                azucar = azucar + 1;
                    System.out.println(azucar);
                }else{
                    exit=false;
                }
                
                break;
            case 1:
                if(azucar>=1){
                azucar = azucar - 1;
                    System.out.println(azucar);
                }else{
                exit=false;
                }
                break;
        }        
}   while (exit==true);
}
        }
