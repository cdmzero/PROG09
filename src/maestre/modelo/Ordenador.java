/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.modelo;

import java.util.ArrayList;
import java.util.List;
import maestre.interfaces.Reparable;

/**
 *
 * @author jfunez
 */
public abstract class Ordenador implements Reparable{
    
    private int NumeroDeSerie;
    private String Marca;
    private String Modelo;
    private int Mram;
    private String Procesador;
    private int Nucleos;
    private String Almacenamiento;
    private boolean arrancado;
    
    
    
//Constructores
     public Ordenador() {
         
        this.NumeroDeSerie = 0;
        this.Marca = "Null";
        this.Modelo = "Null";
        this.Mram = 0;
        this.Procesador = "Null";
        this.Nucleos = 0;
        this.Almacenamiento = "Null";
        this.arrancado = false;
    }
    public Ordenador(int NumeroDeSerie, String Marca, String Modelo, int Mram, String Procesador, int Nucleos, String Almacenamiento, boolean arrancado) {
        this.NumeroDeSerie = NumeroDeSerie;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Mram = Mram;
        this.Procesador = Procesador;
        this.Nucleos = Nucleos;
        this.Almacenamiento = Almacenamiento;
        this.arrancado = arrancado;
    }
  
    
//Setter y Getters
    

    public int getNumeroDeSerie() {
        return NumeroDeSerie;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getMram() {
        return Mram;
    }

    public String getProcesador() {
        return Procesador;
    }

    public int getNucleos() {
        return Nucleos;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setNumeroDeSerie(int NumeroDeSerie) {
        this.NumeroDeSerie = NumeroDeSerie;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setMram(int Mram) {
        this.Mram = Mram;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public void setNucleos(int Nucleos) {
        this.Nucleos = Nucleos;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    
    //Metodos
    
    public boolean equals(Ordenador obj) {
        if (obj instanceof Ordenador){
         return (this.getNumeroDeSerie() == obj.getNumeroDeSerie());
        }else{
         throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    @Override
    public String toString() {
        
        return "Ordenador--" + "NumeroDeSerie=" + NumeroDeSerie + "\n - Marca=" + Marca + "\n - Modelo=" + Modelo + "\n - Mram=" + Mram + "\n - Procesador=" + Procesador + "\n - Nucleos=" + Nucleos + "\n - Almacenamiento=" + Almacenamiento + "\n - arrancado=" + arrancado +" \n TIPO: "+ ' ';
       
    }
    
    
    abstract public void Dibujar();
    
    
   
    

    
}
 
        
    
    

