
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
        boolean exit=true;
        do{
            if(credito<precio){
                
    credito=Float.parseFloat(JOptionPane.showInputDialog("¿ Valor de moneda introducida?"))+credito;
    
            }if(credito==precio){
                exit=false;
            }if(credito>precio){
                      cambio=credito-precio;
                      JOptionPane.showMessageDialog(null, "Recoja su cambio: " +cambio+"€");
        }      
            
    }while(credito<precio);
    
    
}
}
