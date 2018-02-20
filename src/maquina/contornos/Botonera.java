package maquina.contornos;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static maquina.contornos.Producto.azucar;

public class Botonera {
//int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
    public void seleccionBebida() {
        
        String[] bebidas={"Café","Té","Azucar"};
        
        int num = JOptionPane.showOptionDialog(null, "***Seleccione una bebida***", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bebidas, bebidas[1]);
        switch (num) {
            case 0:
                JOptionPane.showMessageDialog(null,"***Café seleccionado***");
                
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"***Té seleccionado***");
                break;
            case 2:
             JOptionPane.showMessageDialog(null,"***Chocolate seleccionado***");
                break;
        }
    
        }

    public void añadirAzucar() {
        String[]opciones={"+","-"};
        boolean exit=true;
        int num;
        
        num =JOptionPane.showOptionDialog(null, null, "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);


        switch (num) {
            case 0:
                 do{
                     if(azucar<=5){
                
                azucar = azucar + 1;
                    System.out.println(azucar);
                     }else{exit=false;}
                }while(exit==true);
                
                
                
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

}
        }
    


