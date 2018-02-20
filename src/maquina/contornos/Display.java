
package maquina.contornos;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Display {


    public void procesoPreparacion(){
        //Muestra icono preparacion iniciando.
        Icon bateriavacia=new ImageIcon(getClass().getResource("\\bateriavacia.png"));
        JOptionPane.showMessageDialog(null, "Se esta preparando su bebida", "Preparacion",JOptionPane.INFORMATION_MESSAGE,bateriavacia);
        //Muestra icono preparacion segundo paso.
        Icon bateriamedia=new ImageIcon(getClass().getResource("\\bateriamedia.png"));
        JOptionPane.showMessageDialog(null, "Tomese su tiempo", "Preparacion",JOptionPane.INFORMATION_MESSAGE,bateriamedia);
        //Muestra la tercera parte de la preparacion.
        Icon bateriacasillena=new ImageIcon(getClass().getResource("\\bateriacasillena.png"));
        JOptionPane.showMessageDialog(null, "Estamos calentando su bebida", "Preparacion",JOptionPane.INFORMATION_MESSAGE,bateriacasillena);
        //Preparacion paso final.
        Icon bateriallena=new ImageIcon(getClass().getResource("\\bateriallena.png"));
        JOptionPane.showMessageDialog(null, "Ya esto listo, ¡INCREIBLE!", "Preparacion",JOptionPane.INFORMATION_MESSAGE,bateriallena);
        
        
    }
    public void bebidaLista(){
        Icon vasocafe=new ImageIcon(getClass().getResource("\\vasocafe.png"));
        JOptionPane.showMessageDialog(null, "Recoja su bebida", "Preparacion",JOptionPane.INFORMATION_MESSAGE,vasocafe);
    }
}
