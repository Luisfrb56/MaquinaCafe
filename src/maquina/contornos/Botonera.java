package maquina.contornos;

import javax.swing.JOptionPane;

public class Botonera {
//int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
    public void seleccionBebida() {

        String[] bebidas = {"Café", "Té", "Azucar"};

        int num = JOptionPane.showOptionDialog(null, "***Seleccione una bebida***", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bebidas, bebidas[1]);
        switch (num) {
            case 0:
                JOptionPane.showMessageDialog(null, "***Café seleccionado***");

                break;
            case 1:
                JOptionPane.showMessageDialog(null, "***Té seleccionado***");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "***Chocolate seleccionado***");
                break;
        }

    }

    public void añadirAzucar() {
        String[] opciones = {"+", "-", "Salir"};
        boolean exit = false;
        int num;


do {       
      num = JOptionPane.showOptionDialog(null, null, "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

    switch (num) {
            case 0:
               
               if(Producto.azucar<=5){
                       Producto.azucar = Producto.azucar + 1;
                        System.out.println(Producto.azucar);
               }else{System.out.println("MAX azucar");
               exit=true;
               }
               
               

                break;
            case 1:
                
               if(Producto.azucar>=0){
                    Producto.azucar = Producto.azucar - 1;
                    System.out.println(Producto.azucar);
               }else{
                       System.out.println("MIN azucar");
                       exit=true;
        }
            case 2:
                exit=true;
                break;
    }
}while (exit == false);
}
}