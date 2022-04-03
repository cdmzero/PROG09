/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.electrodomesticos;

import maestre.interfaces.Reparable;

/**
 *
 * @author jfunez
 */
public class Lavadora implements Reparable{
    String modelo;
    String tipo;
    int potencia;

     public Lavadora(String modelo, String tipo, int potencia) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "-->Lavadora " + "modelo=" + modelo + ", tipo=" + tipo + ", potencia=" + potencia + " \n"+' ';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
     @Override
    public void reparar() {
        
         System.out.println("Arreglando aspiradora ######");
        
        
      if (this == null){
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }  
    }

  
}
