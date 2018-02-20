
package maquina.contornos;

import javax.swing.JOptionPane;
import static maquina.contornos.Producto.precio;


public class Dinero {
    private float credito=0;
    private float cambio;

    

    public Dinero() {
    }

    public Dinero(float credito, float cambio) {
        this.credito = credito;
        this.cambio = cambio;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return "Dinero: " + "\nCredito: " + credito + "\nCambio=" + cambio;
    }
    public void introducirDinero(){
        JOptionPane.showMessageDialog(null, "Precio del producto: "+precio, "Titulo", JOptionPane.DEFAULT_OPTION);
        boolean exit=true;
        do{
            if(credito<precio){
                
    credito=Float.parseFloat(JOptionPane.showInputDialog("¿ Valor de moneda introducida?"))+credito;
    if(credito<precio){
    JOptionPane.showMessageDialog(null, "Faltan: "+(precio-credito)+"€", "Titulo", JOptionPane.DEFAULT_OPTION);}
            }if(credito==precio){
                exit=false;
                        JOptionPane.showMessageDialog(null, "Recoja su bebida", "Titulo", JOptionPane.DEFAULT_OPTION);

            }if(credito>precio){
                      cambio=credito-precio;
                      JOptionPane.showMessageDialog(null, "Recoja su cambio: " +cambio+"€");
        }      
            
    }while(credito<precio);
    
    
}
}
